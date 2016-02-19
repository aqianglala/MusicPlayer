package com.example.admin.musicplayer.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.admin.musicplayer.R;
import com.example.admin.musicplayer.adapter.HotGridAdapter;
import com.example.admin.musicplayer.bean.HotBean;
import com.example.admin.musicplayer.global.BaseFragment;
import com.example.admin.musicplayer.interfaces.Keys;
import com.example.admin.musicplayer.utils.L;
import com.example.admin.musicplayer.utils.Utils;
import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.Callback;

import java.util.ArrayList;
import java.util.List;

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

            }
        });
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
    private List<HotBean.ShowapiResBodyEntity.PagebeanEntity.SonglistEntity> mData=new
            ArrayList<>();
    private  HotGridAdapter mAdapter;


    private class MyCallback extends Callback<HotBean> {

        @Override
        public HotBean parseNetworkResponse(Response response) throws Exception {
            bean = new Gson().fromJson(response.body().string(), HotBean
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
            mData=response.getShowapi_res_body().getPagebean().getSonglist();
            mAdapter =  new HotGridAdapter(mActivity, mData);

            mGridView.setAdapter(mAdapter);
        }
    }



    @Override
    protected void onUserVisible() {

    }
}
