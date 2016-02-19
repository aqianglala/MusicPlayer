package com.example.admin.musicplayer.fragment;

import android.content.AsyncQueryHandler;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore.Audio.Media;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.example.admin.musicplayer.R;
import com.example.admin.musicplayer.activity.AudioPlayerActivity;
import com.example.admin.musicplayer.adapter.AudioListAdapter;
import com.example.admin.musicplayer.bean.AudioItem;
import com.example.admin.musicplayer.global.BaseFragment;
import com.example.admin.musicplayer.interfaces.Keys;

import java.util.ArrayList;


public class AudioListFragment extends BaseFragment {

    private ListView listView;

    @Override
    protected void initView(Bundle savedInstanceState) {
        setContentView( R.layout.framgnet_media_list);
        listView = getViewById(R.id.lv_musiclist);
    }

    @Override
    protected void setListener() {
        listView.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // 跳转到音乐播放界面
                Cursor cursor = (Cursor) parent.getItemAtPosition(position);
                ArrayList<AudioItem> audioItems = getAudioItems(cursor);
                enterAudioPlayerActivity(audioItems, position);
            }
        });
    }

    @Override
    protected void processLogic(Bundle savedInstanceState) {
        initData();
    }

    /** 进入音频播放界面 */
    protected void enterAudioPlayerActivity(ArrayList<AudioItem> audioItems, int position) {
        Intent intent = new Intent(getActivity(), AudioPlayerActivity.class);
        intent.putExtra(Keys.ITEM_LIST, audioItems);
        intent.putExtra(Keys.CURRENT_POSITION, position);
        startActivity(intent);
    }

    /** 把Cursor里面的所有记录读取出来，保存到集合中 */
    protected ArrayList<AudioItem> getAudioItems(Cursor cursor) {
        ArrayList<AudioItem> audioItems = new ArrayList<AudioItem>();
        cursor.moveToFirst();
        do {
            audioItems.add(AudioItem.fromCursor(cursor));
        } while (cursor.moveToNext());
        return audioItems;
    }

    private void initData() {
        // getActivity().getContentResolver().query(uri, projection, selection, selectionArgs, sortOrder)
        AsyncQueryHandler queryHandler = new AsyncQueryHandler(getActivity().getContentResolver()) {
            // 这个方法会运行在主线程
            @Override
            protected void onQueryComplete(int token, Object cookie, Cursor cursor) {
                // Utils.printCursor(cursor);
                AudioListAdapter adapter = new AudioListAdapter(getActivity(), cursor);
                listView.setAdapter(adapter);
            }
        };

        int token = 0;				// 相当于Message.what
        Object cookie = null;		// 相当于Message.obj
        Uri uri = Media.EXTERNAL_CONTENT_URI;
        String[] projection = {		// 指定要查询哪些列
                Media._ID, Media.TITLE, Media.ARTIST, Media.DATA
        };
        String selection = null;		// 指定查询条件
        String[] selectionArgs = null;	// 指定查询条件中的参数
        String orderBy = Media.TITLE + " ASC";
        // 这个方法会运行在子线程
        queryHandler.startQuery(token, cookie, uri, projection, selection, selectionArgs, orderBy);
    }



    @Override
    protected void onUserVisible() {

    }

}
