package com.example.admin.musicplayer.interfaces;


import com.example.admin.musicplayer.bean.AudioItem;

/** 音频播放界面的接口 */
public interface Ui {

    /** 更新Ui */
    void updateUI(AudioItem item);

    /** 播放暂停 */
    void play();

    /** 播放暂停 */
    void stopPlayBtnBg();

}
