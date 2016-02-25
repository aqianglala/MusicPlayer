package com.example.admin.musicplayer.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import com.example.admin.musicplayer.R;
import com.example.admin.musicplayer.bean.LyricItem;
import com.example.admin.musicplayer.utils.LyricLoader;

import java.util.ArrayList;


public class LyricView extends View {

    /** 默认歌词颜色 */
    private int defaultColor = Color.WHITE;
    /** 高亮歌词颜色 */
    private int highlightColor = Color.GREEN;
    /** 默认歌词字体大小 */
    private float defaultSize;
    /** 高亮歌词字体大小 */
    private float highlightSize;
    /** 歌词数据 */
    private ArrayList<LyricItem> lyrics;
    /** 高行亮的索引 */
    private int highlightIndex;
    /** 画笔 */
    private Paint paint;
    /** 高亮行的y坐标 */
    private float hightlightY;
    /**  行高 */
    private float rowHeight;
    /** 音频当前的播放位置（时间） */
    private int currentPosition;

    public LyricView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    /** 初始化操作 */
    private void init() {
        defaultSize = getResources().getDimension(R.dimen.default_lyric_size);
        highlightSize = getResources().getDimension(R.dimen.highlight_lyric_size);

        paint = new Paint();
        paint.setColor(defaultColor);
        paint.setTextSize(defaultSize);
        paint.setAntiAlias(true);	// 抗锯齿，让字体边缘平滑

        rowHeight = getTextHeight("哈哈哈") + 10;

        // 模拟歌词数据，后面记得删除
//		lyrics = new ArrayList<LyricItem>();
//		highlightIndex = 4;
//		for (int i = 0; i < 10; i++) {
//			lyrics.add(new LyricItem(i * 2000, "我明天将会拥有" + (i + 1) + "千万"));
//		}
    }

    /**
     * canvas 相当于现实生活中的纸
     */
    @Override
    protected void onDraw(Canvas canvas) {

        if (lyrics == null || lyrics.isEmpty()) {
            drawCenterText(canvas, "正在查找歌词。。。");
            return;
        }

        LyricItem highlightLyric = lyrics.get(highlightIndex);

        if (highlightIndex != lyrics.size() - 1) {
            // 如果高亮行不是最后一行
            transaltionCanvas(canvas, highlightLyric);
        }

        drawLyrics(canvas, highlightLyric);
    }

    /**
     * 画歌词
     * @param canvas
     * @param highlightLyric
     */
    private void drawLyrics(Canvas canvas, LyricItem highlightLyric) {
        String text = highlightLyric.text;

        // 画高亮行歌词
        drawCenterText(canvas, text);

        // 画高亮行上面的歌词：
        for (int i = 0; i < highlightIndex; i++) {
            // y = 高亮行的y - 行差距 * 行高
            float y = hightlightY - (highlightIndex - i) * rowHeight;
            drawHorizotalText(canvas, lyrics.get(i).text, y, false);
        }

        // 画高亮行下面的歌词：
        for (int i = highlightIndex + 1; i < lyrics.size(); i++) {
            // y = 高亮行的y + 行差距 * 行高
            float y = hightlightY + (i - highlightIndex) * rowHeight;
            drawHorizotalText(canvas, lyrics.get(i).text, y, false);
        }
    }

    /**
     * 移动画布，是为了让歌词可以平滑滚动
     * @param canvas
     * @param highlightLyric
     */
    private void transaltionCanvas(Canvas canvas, LyricItem highlightLyric) {
        // 高亮行歌词的已显示时间 = 当前的播放时间 - 高亮行歌词的开始显示时间
        long showedTime = currentPosition - highlightLyric.startShowTime;

        // 高亮行歌词的总显示时间 = 高亮行下一行歌词的开始显示时间 - 高亮行歌词的开始显示时间
        long totalShowTime = lyrics.get(highlightIndex + 1).startShowTime - highlightLyric.startShowTime;

        // translationY = 比例关系(高亮行歌词的已显示时间 / 高亮行歌词的总显示时间) * 行高
        float scale = ((float) showedTime) / totalShowTime;
        float translationY = scale * rowHeight;
        canvas.translate(0, -translationY);	// 移动画面，因为是要往上移动，所以加了负号
    }

    /**
     * 画水平和垂直方向都居中的文本
     * @param canvas
     * @param text
     */
    private void drawCenterText(Canvas canvas, String text) {
        int textHeight = getTextHeight(text);
        // y = 歌词View高 / 2 + 歌词文本高 / 2
        hightlightY = getHeight() / 2 + textHeight / 2;
        drawHorizotalText(canvas, text, hightlightY, true);
    }

    /**
     * 画水平居中的文本
     * @param canvas
     * @param text
     * @param y
     * @param isHighlight 是否是高亮行
     */
    private void drawHorizotalText(Canvas canvas, String text, float y, boolean isHighlight) {
        paint.setColor(isHighlight ? highlightColor : defaultColor);
        paint.setTextSize(isHighlight ? highlightSize : defaultSize);

        int textWidth = getTextWidth(text);

        // x = 歌词View宽 / 2 - 歌词文本宽 / 2
        float x = getWidth() / 2 - textWidth / 2;

        canvas.drawText(text, x, y, paint);
    }

    /** 获取文本高 */
    private int getTextHeight(String text) {
        // 获取歌词文本的宽高
        Rect bounds = new Rect();	// 这个对象用于保存文本的上、下、左、右的位置
        paint.getTextBounds(text, 0, text.length(), bounds);
        int textHeight = bounds.height();
        return textHeight;
    }

    /**
     * 获取文本宽
     * @param text
     * @return
     */
    private int getTextWidth(String text) {
        // 获取歌词文本的宽高
        Rect bounds = new Rect();	// 这个对象用于保存文本的上、下、左、右的位置
        paint.getTextBounds(text, 0, text.length(), bounds);
        int textWidth = bounds.width();
        return textWidth;
    }

    /**
     * 设置音频当前播放的位置
     * @param currentPosition 音频当前的播放位置（时间）
     */
    public void setCurrentPosition(int currentPosition) {
        if (lyrics == null || lyrics.isEmpty()) {
            return;
        }

        // 1、计算高亮索引
//		如何计算哪一行是高亮行：
//		拿当前播放时间和歌词的开始显示时间进行比较

        this.currentPosition = currentPosition;
        for (int i = 0; i < lyrics.size(); i++) {
            LyricItem lyric = lyrics.get(i);

            // if (当前播放时间 >= 歌词的开始显示时间）｛
            if (currentPosition >= lyric.startShowTime) {

                // if (已经是最后一行）｛
                if (i == lyrics.size() - 1) {
                    // 当前行就是高亮行
                    highlightIndex = i;
                    break;
                    // else if(当前播放时间 < 下一行歌词的开始显示时间){
                } else if (currentPosition < lyrics.get(i + 1).startShowTime) {
                    // 当前行就是高亮行
                    highlightIndex = i;
                    break;
                }
            }
        }

        // 重新画一下歌词，调用onDraw
        invalidate();
    }

    /**
     * 设置一个音乐文件路径，这个方法会把这个路径中对应的歌词文件读取出来
     * @param musicPath
     */
    public void setMusicPath(String musicPath) {
        highlightIndex = 0;

        // 读取音乐路径下对应的歌词文件，并解析成歌词，并且显示出来
        lyrics = LyricLoader.loadLyric(musicPath);
        invalidate();
    }

}















