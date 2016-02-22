package com.example.admin.musicplayer.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.admin.musicplayer.R;
import com.example.admin.musicplayer.activity.AudioPlayerActivity;
import com.example.admin.musicplayer.adapter.HotGridAdapter;
import com.example.admin.musicplayer.bean.AudioItem;
import com.example.admin.musicplayer.bean.HotBean;
import com.example.admin.musicplayer.global.BaseFragment;
import com.example.admin.musicplayer.interfaces.Keys;
import com.example.admin.musicplayer.utils.L;
import com.example.admin.musicplayer.utils.Utils;
import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.Callback;

import java.util.ArrayList;

import okhttp3.Call;
import okhttp3.Response;

/**
 * Created by admin on 2016/2/19.
 */
public class HotFragment extends BaseFragment {

    private GridView mGridView;

    @Override
    protected void initView(Bundle savedInstanceState) {
        setContentView(R.layout.fragment_hot);
        mGridView = getViewById(R.id.id_gridview);
    }

    @Override
    protected void setListener() {
        mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ArrayList<AudioItem> audioItems = getAudioItems(mData);
                Intent intent = new Intent(mActivity, AudioPlayerActivity.class);
                intent.putExtra(Keys.ITEM_LIST, audioItems);
                intent.putExtra(Keys.CURRENT_POSITION, position);
                startActivity(intent);
            }
        });
    }

    /** 把songEntity转换成AudioItem */
    protected ArrayList<AudioItem> getAudioItems(ArrayList<HotBean.ShowapiResBodyEntity
            .PagebeanEntity.SonglistEntity> data) {
        ArrayList<AudioItem> audioItems = new ArrayList<AudioItem>();
        for(HotBean.ShowapiResBodyEntity.PagebeanEntity.SonglistEntity entity: data){
            audioItems.add(AudioItem.fromBean(entity));
        }
        return audioItems;
    }

    @Override
    protected void processLogic(Bundle savedInstanceState) {
        getData();

    }

    private void getData() {
        OkHttpUtils
                .post()
                .url(Keys.Url_Hot)
                .addParams("showapi_appid", "15869")
                .addParams("showapi_sign", "5ea357d154694ad1a58d0a8287dd6f6c")
                .addParams("showapi_timestamp", Utils.getTimestamp())
                .addParams("topid", "5")
                .tag(this)
                .build()
                .execute(new MyCallback());
    }

    private HotBean bean;
    private ArrayList<HotBean.ShowapiResBodyEntity.PagebeanEntity.SonglistEntity> mData=new
            ArrayList<>();
    private  HotGridAdapter mAdapter;


    private class MyCallback extends Callback<HotBean> {

        @Override
        public HotBean parseNetworkResponse(Response response) throws Exception {
            String result = response.body().string();
            L.i("result",result);
            bean = new Gson().fromJson(result, HotBean
                    .class);
            return bean;
        }

        @Override
        public void onError(Call call, Exception e) {
            L.i(TAG,e.getMessage());
            showToast("加载失败");
        }

        @Override
        public void onResponse(HotBean response) {
            L.i(TAG,"数据长度："+response.getShowapi_res_body().getPagebean().getSonglist().size()+"");
            /**
             * 1. 列表项布局
             * 2. 数据
             * 3. 创建适配器
             */
            mData=(ArrayList<HotBean.ShowapiResBodyEntity.PagebeanEntity.SonglistEntity>) response.getShowapi_res_body().getPagebean().getSonglist();
            mAdapter =  new HotGridAdapter(mActivity, mData);

            mGridView.setAdapter(mAdapter);
        }
    }



    @Override
    protected void onUserVisible() {

    }
}
