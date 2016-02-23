package com.example.admin.musicplayer.activity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.Html;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

import com.example.admin.musicplayer.R;
import com.example.admin.musicplayer.bean.AudioItem;
import com.example.admin.musicplayer.bean.SearchLyric;
import com.example.admin.musicplayer.global.BaseActivity;
import com.example.admin.musicplayer.interfaces.Keys;
import com.example.admin.musicplayer.interfaces.PlayService;
import com.example.admin.musicplayer.interfaces.Ui;
import com.example.admin.musicplayer.service.AudioPlayService;
import com.example.admin.musicplayer.utils.L;
import com.example.admin.musicplayer.utils.Utils;
import com.example.admin.musicplayer.view.LyricView;
import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.Callback;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

import okhttp3.Call;
import okhttp3.Response;


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
                    // Send a Message to this Messenger's Handler
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
        playService.updateBtnBackground(resid);
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

    private AudioItem mCurrentItem;

    @Override
    public void updateUI(AudioItem item) {
        L.i(TAG, "ui的方法被调用了");
        updatePlayBtnBg();
        tv_artist.setText(item.getArtist());
        sb_audio.setMax(playService.getDuration());
        // 下载歌词，获取歌词路径
        if(!TextUtils.isEmpty(item.getSongId())){
            mCurrentItem=item;
            getLyric(item.getSongId());
        }else{
            lyric_view.setMusicPath(item.getPath());
        }
        updatePlayTime();
        updatePlayModeBtnBg(playService.getCurrentPlayMode());
    }

    /** 播放或暂停 */
    @Override
    public void play() {
        if (playService.isPlaying()) {
            playService.pause();
        } else {
            playService.start();
        }
        updatePlayBtnBg();
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

    public static final String lrcRootPath = Environment
            .getExternalStorageDirectory().toString()
            + "/MusicPlayer/Lyrics/";

    // 歌词文件网络地址，歌词文件本地缓冲地址
    public void getLyric(String songId) {
        OkHttpUtils
                .post()
                .url(Keys.Url_Search_Lyric)
                .addParams("showapi_appid", "15869")
                .addParams("showapi_sign", "5ea357d154694ad1a58d0a8287dd6f6c")
                .addParams("showapi_timestamp", Utils.getTimestamp())
                .addParams("musicid", songId)
                .tag(this)
                .build()
                .execute(new MyCallback());
    }
    private SearchLyric bean;
    private class MyCallback extends Callback<SearchLyric> {

        @Override
        public SearchLyric parseNetworkResponse(Response response) throws Exception {
            bean = new Gson().fromJson(response.body().string(), SearchLyric
                    .class);
            return bean;
        }

        @Override
        public void onError(Call call, Exception e) {
            L.i(TAG,e.getMessage());
            showToast("加载失败");
        }

        @Override
        public void onResponse(SearchLyric response) {
            L.i(TAG,"数据长度："+response.getShowapi_res_body().getLyric());
            //将歌词保存到本地
            String lyric = response.getShowapi_res_body().getLyric();
            File file = new File(lrcRootPath);
            if (!file.exists()) {
                file.mkdirs();
            }
            String lrcPath=lrcRootPath+ mCurrentItem.getArtist()+".txt";
            try {
                FileWriter fw = new FileWriter(lrcPath, true);
                BufferedWriter bw = new BufferedWriter(fw);
                String newLineLyric = newLineLyric(lyric);
                bw.write(newLineLyric);
                bw.close();
                fw.close();
                lyric_view.setMusicPath(lrcPath);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 歌词换行的方法
     * 1，取得“[”的索引
     * 2，取得（第一步获取到的索引-1）的字符
     * 3，如果该字符不为“]”，则插入换行符
     *
     * 以上将获取到这样一串
     * [ti:04爸爸媽媽 Mama & Papa_mmm_Pf][ar:李荣浩][al:][by:][offset:0][00:00.87]爸爸妈妈 - 李荣浩
     [00:01.68]词：李荣浩
     * 然后我们把offset之前的所有标签都删除，这样就能获得正确的歌词格式
     */

    private String newLineLyric(String lyric){
        lyric= Html.fromHtml(lyric).toString();
        lyric= lyric.substring(lyric.indexOf("[00"));
        char[] chars = lyric.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<chars.length;i++){
            if(i!=0 && chars[i]=='[' && chars[i-1]!=']'){
                sb.append("\r\n[");
            }else{
                sb.append(chars[i]);
            }
        }
        Log.i("换行后:",sb.toString());
        return sb.toString();
    }

}
