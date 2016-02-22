package com.example.admin.musicplayer.utils;

import com.example.admin.musicplayer.bean.LyricItem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;



public class LyricLoader {

    public static void main(String[] args) {
        String musicPath = "G:\\classes\\gz_term1\\手机影音\\资料\\视频和音乐资源\\test\\audio\\TongHua.mp3";
        ArrayList<LyricItem> lyrics = loadLyric(musicPath);
        for (LyricItem lyricItem : lyrics) {
            System.out.println(lyricItem);
        }
    }

    /**
     * 加载歌词文件
     * @param musicPath
     * @return
     */
    public static ArrayList<LyricItem> loadLyric(String musicPath) {
        ArrayList<LyricItem> lyrics = null;

        // 删除音乐的扩展名
        String prefix = musicPath.substring(0, musicPath.lastIndexOf("."));

        // 拼接歌词文件
        File lrcFile = new File(prefix + ".lrc");
        File txtFile = new File(prefix + ".txt");
        if (lrcFile.exists()) {
            // 读取歌词文件
            lyrics = readLyricFile(lrcFile);
        } else if (txtFile.exists()) {
            // 读取歌词文件
            lyrics = readLyricFile(txtFile);
        }

        if (lyrics == null || lyrics.isEmpty()) {
            return null;
        }

        Collections.sort(lyrics);	// 按开始显示时间进行排序

        return lyrics;
    }

    /**
     * 读取歌词文件
     * @param lrcFile 歌词文件
     * @return
     */
    private static ArrayList<LyricItem> readLyricFile(File lrcFile) {
        ArrayList<LyricItem> lyrics = new ArrayList<LyricItem>();
        try {
            InputStream in = new FileInputStream(lrcFile);
            BufferedReader reader = new BufferedReader(new InputStreamReader(in, "UTF-8"));
            String line;
            while ((line = reader.readLine()) != null) {
                // System.out.println(line);
                // 解读一行的歌词：[01:55.10][00:48.04]我不可能是你的王子
                String[] strings = line.split("]");
                String lyricText = strings[strings.length - 1];
                for (int i = 0; i < strings.length - 1; i++) {
                    // 解析：[01:55.10 这样的时间，解析成一个long类型的毫秒值
                    long startShowTime = parseTime(strings[i]);
                    lyrics.add(new LyricItem(startShowTime, lyricText));
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lyrics;
    }


    /**
     * 解析：[01:55.10 这样的时间，解析成一个long类型的毫秒值。注：最后的毫秒值是需要乘以10的
     * @param time
     * @return
     */
    private static long parseTime(String time) {
        String minute = time.substring(1, 3);	// 获取分：01
        String second = time.substring(4, 6);	// 获取秒：55
        String millis = time.substring(7, 9);	// 获取毫秒：10

        long minuteMillis = Integer.parseInt(minute) * 60 * 1000;
        long secondMillis = Integer.parseInt(second) * 1000;
        long millisecond = Integer.parseInt(millis) * 10;

        return minuteMillis + secondMillis + millisecond;
    }

}
