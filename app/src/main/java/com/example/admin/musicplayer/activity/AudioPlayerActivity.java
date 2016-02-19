package com.example.admin.musicplayer.activity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

import com.example.admin.musicplayer.R;
import com.example.admin.musicplayer.bean.AudioItem;
import com.example.admin.musicplayer.global.BaseActivity;
import com.example.admin.musicplayer.interfaces.Keys;
import com.example.admin.musicplayer.interfaces.PlayService;
import com.example.admin.musicplayer.interfaces.Ui;
import com.example.admin.musicplayer.service.AudioPlayService;
import com.example.admin.musicplayer.utils.L;
import com.example.admin.musicplayer.utils.Utils;
import com.example.admin.musicplayer.view.LyricView;

import java.util.ArrayList;


public class AudioPlayerActivity extends BaseActivity implements Ui {

    /** 更新播放时间 */
    private static final int UPDATE_PLAY_TIME = 0;
    /** 播放服务 */
    private PlayService playService;
    private Handler handler = new Handler() {

        public void handleMessage(android.os.Message msg) {
            switch (msg.what) {
                case AudioPlayService.PLAY_SERVICE_INTERFACE:
                    playService = (PlayService) msg.obj;
                    // 在这个地方Service和Activity都拿到了对方的引用，这个时候再去播放音频
                    if (msg.arg1 == AudioPlayService.NO_OPEN_AUDIO) {
                        // 更新一下Ui
                        updateUI(playService.getCurrentAudioItem());
                    } else {
                        playService.openAudio();
                    }

                    break;
                case UPDATE_PLAY_TIME:
                    updatePlayTime();
                    break;

                default:
                    break;
            }
        };
    };

    private Messenger uiMessenger = new Messenger(handler);

    private ServiceConnection conn;
    private Button btn_play;
    private TextView tv_artist;
    private TextView tv_play_time;
    private SeekBar sb_audio;
    private ImageView iv_vision;
    private Button btn_play_mode;
    /** 歌词View */
    private LyricView lyric_view;
    private Button btn_pre;
    private Button btn_next;

    /** 连接服务 */
    private void connectServcie() {
        ArrayList<AudioItem> audioItems = (ArrayList<AudioItem>) getIntent().getSerializableExtra(Keys.ITEM_LIST);
        int position = getIntent().getIntExtra(Keys.CURRENT_POSITION, -1);

        Intent service = new Intent(this, AudioPlayService.class);
        service.putExtra(Keys.ITEM_LIST, audioItems);
        service.putExtra(Keys.CURRENT_POSITION, position);
        service.putExtra(Keys.WHAT, getIntent().getIntExtra(Keys.WHAT, -1));
        startService(service);
        conn = new ServiceConnection() {

            @Override
            public void onServiceDisconnected(ComponentName name) {

            }

            // 服务连接成功
            @Override
            public void onServiceConnected(ComponentName name, IBinder binder) {
                L.i(TAG, "连接成功！");
                Messenger playServiceMesseger = new Messenger(binder);
                Message message = new Message();
                message.what = AudioPlayService.UI_INTERFACE;
                message.obj = AudioPlayerActivity.this;
                message.replyTo = uiMessenger;
                try {
                    playServiceMesseger.send(message);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        };
        bindService(service, conn, BIND_AUTO_CREATE);
    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        setContentView(R.layout.activity_audio_player);
        btn_play = getViewById(R.id.btn_play);
        btn_pre = getViewById(R.id.btn_pre);
        btn_next = getViewById(R.id.btn_next);
        tv_artist = getViewById(R.id.tv_artist);
        tv_play_time = getViewById(R.id.tv_play_time);
        sb_audio = getViewById(R.id.sb_audio);
        iv_vision = getViewById(R.id.iv_vision);
        AnimationDrawable anim = (AnimationDrawable) iv_vision.getBackground();
        anim.start();
        btn_play_mode = getViewById(R.id.btn_play_mode);
        lyric_view = getViewById(R.id.lyric_view);
    }

    @Override
    protected void setListener() {
        btn_play.setOnClickListener(this);
        btn_pre.setOnClickListener(this);
        btn_next.setOnClickListener(this);
        btn_play_mode.setOnClickListener(this);
        sb_audio.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {

            // 当停止拖动的时候
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }

            // 当开始拖动的时候
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            // 当进度发生改变的时候
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser) {
                    playService.seekTo(progress);
                }
            }
        });
    }

    @Override
    protected void processLogic(Bundle savedInstanceState) {
        connectServcie();
    }

    @Override
    protected void onDestroy() {
        unbindService(conn);
        handler.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_play:
                play();
                break;
            case R.id.btn_pre:
                playService.pre();	// 播放上一首
                break;
            case R.id.btn_next:
                playService.next();	// 播放下一首
                break;
            case R.id.btn_play_mode:
                switchPlayMode();
                break;

            default:
                break;
        }
    }


    /** 切换播放模式 */
    private void switchPlayMode() {
        int currentPlayMode = playService.switchPlayMode();
        updatePlayModeBtnBg(currentPlayMode);
    }

    /**
     *
     * @param currentPlayMode 当前的播放模式
     */
    private void updatePlayModeBtnBg(int currentPlayMode) {
        int resid;
        switch (currentPlayMode) {
            case AudioPlayService.PLAY_MODE_ORDER:	// 如果当前是顺序播放
                resid = R.drawable.selector_audio_btn_playmode_order;
                break;
            case AudioPlayService.PLAY_MODE_SINGLE:	// 如果当前是单曲循环
                resid = R.drawable.selector_audio_btn_playmode_single;
                break;
            case AudioPlayService.PLAY_MODE_RANDOM:	// 如果当前是随机播放
                resid = R.drawable.selector_audio_btn_playmode_random;
                break;
            default:
                throw new RuntimeException("见鬼吧，不知道当前是什么播放模式,currentPlayMode = " + currentPlayMode);
        }
        btn_play_mode.setBackgroundResource(resid);
    }

    /** 播放或暂停 */
    private void play() {
        if (playService.isPlaying()) {
            playService.pause();
        } else {
            playService.start();
        }

        updatePlayBtnBg();
    }

    /** 更新播放按钮背景 */
    private void updatePlayBtnBg() {
        int resid;
        if (playService.isPlaying()) {
            // 如果正在播放，则显示一个暂停按钮
            resid = R.drawable.selector_audio_btn_pause;
        } else {
            // 如果是暂停的，则显示一个播放按钮
            resid = R.drawable.selector_audio_btn_play;
        }
        btn_play.setBackgroundResource(resid);
    }

    @Override
    public void updateUI(AudioItem item) {
        L.i(TAG, "ui的方法被调用了");
        updatePlayBtnBg();
        tv_artist.setText(item.getArtist());
        sb_audio.setMax(playService.getDuration());
        lyric_view.setMusicPath(item.getPath());
        updatePlayTime();
        updatePlayModeBtnBg(playService.getCurrentPlayMode());
    }

    /** 更新播放时间 */
    private void updatePlayTime() {
        int position = playService.getCurrentPosition();
        CharSequence currentPosition = Utils.formatMillis(position);	// 当前播放时间
        CharSequence duration = Utils.formatMillis(playService.getDuration());					// 总时长
        tv_play_time.setText(currentPosition + "/" + duration);
        sb_audio.setProgress(position);
        lyric_view.setCurrentPosition(position);

        handler.sendEmptyMessageDelayed(UPDATE_PLAY_TIME, 30);
    }

}
