package com.example.admin.musicplayer.service;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import android.widget.RemoteViews;

import com.example.admin.musicplayer.R;
import com.example.admin.musicplayer.activity.AudioPlayerActivity;
import com.example.admin.musicplayer.bean.AudioItem;
import com.example.admin.musicplayer.interfaces.Keys;
import com.example.admin.musicplayer.interfaces.PlayService;
import com.example.admin.musicplayer.interfaces.Ui;
import com.example.admin.musicplayer.utils.L;

import java.util.ArrayList;
import java.util.Random;

public class AudioPlayService extends Service implements PlayService {
    /** UI 接口 */
    public static final int UI_INTERFACE = 0;
    /** 服务接口 */
    public static final int PLAY_SERVICE_INTERFACE = 1;
    private MediaPlayer mMediaPlayer;
    /** UI接口 */
    private Ui ui;
    /** 播放模式：顺序播放 */
    public static final int PLAY_MODE_ORDER = 1;
    /** 播放模式：随机播放 */
    public static final int PLAY_MODE_RANDOM = 2;
    /** 播放模式：单曲循环 */
    public static final int PLAY_MODE_SINGLE = 3;
    /** 当前的播放模式 */
    public int currentPlayMode = PLAY_MODE_ORDER;
    public static int NO_OPEN_AUDIO = 1;
    public int openAudioFlag;
    private SharedPreferences sp;
    /** 点击了通知栏的上一首按钮 */
    private static final int NOTIFICATION_PRE = 1;
    /** 点击了通知栏的下一首按钮 */
    private static final int NOTIFICATION_NEXT = 2;
    /** 点击了通知栏的根布局 */
    private static final int NOTIFICATION_ROOT = 3;
    private int notificationId = 1;
    private NotificationManager notificationManager;

    private Handler handler = new Handler() {
        public void handleMessage(android.os.Message msg) {
            switch (msg.what) {
                case UI_INTERFACE:
                    ui = (Ui) msg.obj;
                    Messenger uiMessenger = msg.replyTo;
                    Message message = new Message();
                    message.what = PLAY_SERVICE_INTERFACE;
                    message.obj = AudioPlayService.this;
                    message.arg1 = openAudioFlag;
                    try {
                        uiMessenger.send(message);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                    break;

                default:
                    break;
            }
        };
    };

    private Messenger playServiceMessenger = new Messenger(handler);
    private ArrayList<AudioItem> audioItems;
    private int currentPosition;
    private Random random;

    @Override
    public void onCreate() {
        L.i("AudioPlayService", "onCreate");
        sp = PreferenceManager.getDefaultSharedPreferences(this);
        notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        random = new Random();
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        L.i("AudioPlayService", "onStartCommand");
        currentPlayMode = sp.getInt(Keys.CURRENT_PLAY_MODE, PLAY_MODE_ORDER);
        openAudioFlag = -1;
        int what = intent.getIntExtra(Keys.WHAT, -1);
        switch (what) {
            case NOTIFICATION_PRE:
                pre();
                break;
            case NOTIFICATION_NEXT:
                next();
                break;
            case NOTIFICATION_ROOT:
                openAudioFlag = NO_OPEN_AUDIO;
                break;
            default:
                audioItems = (ArrayList<AudioItem>) intent.getSerializableExtra(Keys.ITEM_LIST);

                int currentPositionTemp = intent.getIntExtra(Keys.CURRENT_POSITION, -1);
                if (isPlaying() && currentPosition == currentPositionTemp) {
                    // 如果音频已经在播放，并且点击进来的位置和正在播放的音频是同一个，则不要重新播放
                    openAudioFlag = NO_OPEN_AUDIO;
                }
                currentPosition = currentPositionTemp;
                break;
        }
        return super.onStartCommand(intent, flags, startId);
    }

    /** 打开一个音频文件 */
    @Override
    public void openAudio() {
        if (audioItems == null || audioItems.isEmpty() || currentPosition == -1) {
            return ;
        }

        currentAudioItem = audioItems.get(currentPosition);

        Intent i = new Intent("com.android.music.musicservicecommand");
        i.putExtra("command", "pause");
        sendBroadcast(i);

        release();

        try {
            mMediaPlayer = new MediaPlayer();
            mMediaPlayer.setOnPreparedListener(mPreparedListener);
            mMediaPlayer.setOnCompletionListener(mCompletionListener);
            if(TextUtils.isEmpty(currentAudioItem.getSongId())){
                mMediaPlayer.setDataSource(this, Uri.parse(currentAudioItem.getPath()));
            }else{
                mMediaPlayer.setDataSource(currentAudioItem.getPath());
            }
            mMediaPlayer.prepareAsync();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    private void release() {
        if (mMediaPlayer != null) {
            mMediaPlayer.reset();
            mMediaPlayer.release();
            mMediaPlayer = null;
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        return playServiceMessenger.getBinder();
    }

    @Override
    public boolean onUnbind(Intent intent) {
        L.i("AudioPlayService", "onUnbind");
        return super.onUnbind(intent);
    }

    @Override
    public void onDestroy() {
        L.i("AudioPlayService", "onDestroy");
        super.onDestroy();
    }

    @Override
    public void start() {
        if (mMediaPlayer != null) {
            mMediaPlayer.start();
            sendNotification();
        }
    }

    @Override
    public void pause() {
        if (mMediaPlayer != null) {
            mMediaPlayer.pause();
            notificationManager.cancel(notificationId);
        }
    }

    @Override
    public void pre() {
        switch (currentPlayMode) {
            case PLAY_MODE_ORDER:	// 顺序播放
                if (currentPosition != 0) {
                    currentPosition--;
                } else {
                    currentPosition = audioItems.size() - 1;
                }
                break;
            case PLAY_MODE_RANDOM:	// 随机播放
                currentPosition = random.nextInt(audioItems.size());
                break;
            case PLAY_MODE_SINGLE:	// 单曲循环
                break;
        }

        openAudio();

    }

    @Override
    public void next() {
        switch (currentPlayMode) {
            case PLAY_MODE_ORDER:	// 顺序播放
                if (currentPosition != audioItems.size() - 1) {
                    currentPosition++;
                } else {
                    currentPosition = 0;
                }
                break;
            case PLAY_MODE_RANDOM:	// 随机播放
                currentPosition = random.nextInt(audioItems.size());
                break;
            case PLAY_MODE_SINGLE:	// 单曲循环
                break;
        }

        openAudio();
    }

    @Override
    public void seekTo(int position) {
        if (mMediaPlayer != null) {
            mMediaPlayer.seekTo(position);
        }
    }

    @Override
    public int getCurrentPosition() {
        if (mMediaPlayer != null) {
            return mMediaPlayer.getCurrentPosition();
        }
        return 0;
    }

    @Override
    public int getDuration() {
        if (mMediaPlayer != null) {
            return mMediaPlayer.getDuration();
        }
        return 0;
    }

    OnPreparedListener mPreparedListener = new OnPreparedListener() {

        @Override
        public void onPrepared(MediaPlayer mp) {
            start();
            ui.updateUI(currentAudioItem);
        }
    };
    private AudioItem currentAudioItem;

    @Override
    public boolean isPlaying() {
        if (mMediaPlayer != null) {
            return mMediaPlayer.isPlaying();
        }
        return false;
    }

    @Override
    public int switchPlayMode() {
        switch (currentPlayMode) {
            case PLAY_MODE_ORDER:	// 如果当前是顺序播放，则切换为单曲循环
                currentPlayMode = PLAY_MODE_SINGLE;
                break;
            case PLAY_MODE_SINGLE:	// 如果当前是单曲循环，则切换为随机播放
                currentPlayMode = PLAY_MODE_RANDOM;
                break;
            case PLAY_MODE_RANDOM:	// 如果当前是随机播放，则切换为顺序播放
                currentPlayMode = PLAY_MODE_ORDER;
                break;
            default:
                throw new RuntimeException("见鬼吧，不知道当前是什么播放模式,currentPlayMode = " + currentPlayMode);
        }

        // 把播放模式保存到配置文件中
        sp.edit().putInt(Keys.CURRENT_PLAY_MODE, currentPlayMode).commit();

        return currentPlayMode;
    }

    @Override
    public int getCurrentPlayMode() {
        return currentPlayMode;
    }

    @Override
    public AudioItem getCurrentAudioItem() {
        return currentAudioItem;
    }

    OnCompletionListener mCompletionListener = new OnCompletionListener() {

        @Override
        public void onCompletion(MediaPlayer mp) {
            next();
        }
    };

    private void sendNotification() {
        notificationManager.cancel(notificationId);

        int icon = R.drawable.icon_notification;
        CharSequence tickerText = "当前正在播放：" + currentAudioItem.getTitle();
        long when = System.currentTimeMillis();

        CharSequence contentTitle =  currentAudioItem.getTitle();
        CharSequence contentText = currentAudioItem.getArtist();
        PendingIntent contentIntent = getActivityPndingIntent(NOTIFICATION_ROOT);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        builder.setSmallIcon(icon)				// 设置通知栏出现的图标
                .setTicker(tickerText)			// 设置通知栏的提示文本
                .setWhen(when)					// 设置通知的时间
                .setContentTitle(contentTitle)	// 设置通知的内容标题
                .setContentText(contentText)		// 设置通知的内容
                .setContentIntent(contentIntent)	// 设置点击通知时要执行的Intent
                .setContent(getRemoteViews());	// 这个方法在3.0版本才有用
        Notification notification = builder.build();
        notificationManager.notify(notificationId, notification);
    }

    private RemoteViews getRemoteViews() {
        RemoteViews remoteViews = new RemoteViews(getPackageName(), R.layout.notification);
        remoteViews.setTextViewText(R.id.tv_title, currentAudioItem.getTitle());
        remoteViews.setTextViewText(R.id.tv_artist, currentAudioItem.getArtist());
        remoteViews.setOnClickPendingIntent(R.id.btn_pre, getServicePndingIntent(NOTIFICATION_PRE));
        remoteViews.setOnClickPendingIntent(R.id.btn_next, getServicePndingIntent(NOTIFICATION_NEXT));
        remoteViews.setOnClickPendingIntent(R.id.ll_root, getActivityPndingIntent(NOTIFICATION_ROOT));
        return remoteViews;
    }

    private PendingIntent getActivityPndingIntent(int what) {
        Intent intent = new Intent(this, AudioPlayerActivity.class);
        intent.putExtra(Keys.WHAT, what);
        int flags = PendingIntent.FLAG_UPDATE_CURRENT;// 如果第二次获取并且请求码相同，如果原来已经创建了这个PendingIntent，则复用这个类，并且更新intent中的数据
        PendingIntent contentIntent = PendingIntent.getActivity(this, what, intent, flags);
        return contentIntent;
    }

    private PendingIntent getServicePndingIntent(int what) {
        Intent intent = new Intent(this, AudioPlayService.class);
        intent.putExtra(Keys.WHAT, what);
        int flags = PendingIntent.FLAG_UPDATE_CURRENT;// 如果第二次获取并且请求码相同，如果原来已经创建了这个PendingIntent，则复用这个类，并且更新intent中的数据
        PendingIntent contentIntent = PendingIntent.getService(this, what, intent, flags);
        return contentIntent;
    }

}
