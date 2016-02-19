package com.example.admin.musicplayer.adapter;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

import com.example.admin.musicplayer.R;
import com.example.admin.musicplayer.bean.AudioItem;

public class AudioListAdapter extends CursorAdapter {

    public AudioListAdapter(Context context, Cursor c) {
        super(context, c);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        // 创建一个View
        View view = View.inflate(context, R.layout.adapter_audio_list, null);

        // 用一个ViewHolder把View里面的控件引用保存起来
        ViewHolder holder = new ViewHolder();
        holder.tv_title = (TextView) view.findViewById(R.id.tv_title);
        holder.tv_artist = (TextView) view.findViewById(R.id.tv_artist);

        // 把ViewHolder保存到View里面去
        view.setTag(holder);

        return view;
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        AudioItem item = AudioItem.fromCursor(cursor);
        ViewHolder holder = (ViewHolder) view.getTag();
        holder.tv_title.setText(item.getTitle());
        holder.tv_artist.setText(item.getArtist());
    }

    class ViewHolder {
        TextView tv_title;
        TextView tv_artist;
    }

}
