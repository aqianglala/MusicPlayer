package com.example.admin.musicplayer.utils;

import android.content.Context;
import android.database.Cursor;
import android.text.format.DateFormat;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.admin.musicplayer.interfaces.Constants;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Utils {

    /**
     * 查找Button和ImageButton并设置单击监听器
     * @param view
     */
    public static void findButtonSetOnClickListener(View view, OnClickListener listener) {
        // 遍历view的所有子view
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View child = viewGroup.getChildAt(i);
                if (child instanceof Button || child instanceof ImageButton) {
                    child.setOnClickListener(listener);
                } else if (child instanceof ViewGroup) {
                    findButtonSetOnClickListener(child, listener);
                }
            }
        }
    }

    /**
     * 在屏幕中央显示一个Toast
     * @param text
     */
    public static void showToast(Context context, String text) {
        Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

    /** 获取屏幕宽 */
    public static int getScreenWidth(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        int screenWidth = windowManager.getDefaultDisplay().getWidth();
        return screenWidth;
    }

    /** 获取屏幕高 */
    public static int getScreenHeight(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        int screenHeight = windowManager.getDefaultDisplay().getHeight();
        return screenHeight;
    }

    /**
     * 打印Cursor里面所有的记录
     * @param cursor
     */
    public static void printCursor(Cursor cursor) {
        if (cursor == null) {
            return;
        }

        L.i("utils", "共有" + cursor.getCount() + "条记录");
        while (cursor.moveToNext()) {
            L.i("utils", "---------------");
            // 遍历所有的列
            for (int i = 0; i < cursor.getColumnCount(); i++) {
                String columnName = cursor.getColumnName(i);
                String value = cursor.getString(i);
                L.i("utils", columnName + " = " + value);
            }
        }
    }

    /**
     * 格式化一个毫秒值，如果时间大于或等于1小时，则格式化为时分秒，如：01:30:49，否则格式化为分和秒，如：30:49
     * @param duration
     * @return
     */
    public static CharSequence formatMillis(long duration) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.add(Calendar.MILLISECOND, (int) duration);
        // kk代表小时中的1 ~ 24
        String pattern = duration / Constants.hourMillis > 0 ? "kk:mm:ss" : "mm:ss";
        return DateFormat.format(pattern, calendar);
    }

    public static String getTimestamp(){
        SimpleDateFormat formt = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = new Date(System.currentTimeMillis());
        return formt.format(date);
    }
}









