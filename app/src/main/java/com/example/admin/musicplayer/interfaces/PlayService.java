package com.example.admin.musicplayer.interfaces;


import com.example.admin.musicplayer.bean.AudioItem;

/** 音频播放服务的接口 */
public interface PlayService {

    /** 打开音频 */
    void openAudio();
    /** 是否正在播放  */
    boolean isPlaying();
    /** 播放音频 */
    void start();

    /** 停止播放 */
    void pause();

    /** 播放上一首 */
    void pre();

    /** 播放下一首 */
    void next();

    /** 跳转
     * @param position
     */
    void seekTo(int position);

    /** 获取音频当前的播放位置 */
    int getCurrentPosition();

    /** 获取音频总时长 */
    int getDuration();

    /**
     * 切换播放模式
     * @return 返回切换之后的播放模式
     */
    int switchPlayMode();

    /** 获取当前的播放模式 */
    int getCurrentPlayMode();

    /** 获取当前的播放模式 */
    void updateBtnBackground(int resId);

    /** 设置当前是否是通知栏上的播放暂停按钮被点击 */
    void setIsPlayClick(boolean isPlayClick);


    /** 获取当前正在播放的音频的JavaBean */
    AudioItem getCurrentAudioItem();
}
