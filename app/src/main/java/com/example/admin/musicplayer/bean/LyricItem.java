package com.example.admin.musicplayer.bean;


public class LyricItem implements Comparable<LyricItem>{

    /** 歌词的开始显示时间 */
    public long startShowTime;
    /**歌词文本 */
    public String text;

    public LyricItem(long startShowTime, String text) {
        super();
        this.startShowTime = startShowTime;
        this.text = text;
    }

    @Override
    public String toString() {
        return "LyricItem [startShowTime=" + startShowTime + ", text=" + text + "]";
    }

    @Override
    public int compareTo(LyricItem o) {
        return Long.valueOf(startShowTime).compareTo(o.startShowTime);
    }

}
