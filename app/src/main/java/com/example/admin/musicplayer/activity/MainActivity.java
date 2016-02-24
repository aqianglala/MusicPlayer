package com.example.admin.musicplayer.activity;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.widget.Toast;

import com.example.admin.musicplayer.R;
import com.example.admin.musicplayer.adapter.TabFragmentAdapter;
import com.example.admin.musicplayer.fragment.AudioListFragment;
import com.example.admin.musicplayer.fragment.HotFragment;
import com.example.admin.musicplayer.global.BaseActivity;
import com.example.admin.musicplayer.service.AudioPlayService;

import java.util.ArrayList;

public class MainActivity extends BaseActivity {

    private ViewPager mViewPage;
    private TabLayout mTabLayout;
    private TabFragmentAdapter tabFragmentAdapter;

    @Override
    protected void initView(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        Toolbar toolbar = getViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    protected void setListener() {

    }

    @Override
    protected void processLogic(Bundle savedInstanceState) {
        initTabLayout();
    }

    private void initTabLayout() {
        mViewPage= (ViewPager) findViewById(R.id.id_viewpager);
        mTabLayout= (TabLayout) findViewById(R.id.id_tabLayout);
        ArrayList<String> tabTitles = new ArrayList<>();
        tabTitles.add("热门榜单");
        tabTitles.add("本地音乐");
        mTabLayout.setTabMode(TabLayout.MODE_FIXED);
        mTabLayout.addTab(mTabLayout.newTab().setText(tabTitles.get(0)));
        mTabLayout.addTab(mTabLayout.newTab().setText(tabTitles.get(1)));

        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new HotFragment());
        fragments.add(new AudioListFragment());

        tabFragmentAdapter = new TabFragmentAdapter(getSupportFragmentManager(), fragments,
                tabTitles);
        mViewPage.setAdapter(tabFragmentAdapter);
        mTabLayout.setupWithViewPager(mViewPage);
        mTabLayout.setTabsFromPagerAdapter(tabFragmentAdapter);
    }


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.main,menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        if(item.getItemId()==R.id.action_search){
//            showToast("点击了搜索");
//        }
//        return super.onOptionsItemSelected(item);
//    }

    private long mExitTime;
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if ((System.currentTimeMillis() - mExitTime) > 2000) {
                Toast.makeText(this, "再按一次退出程序", Toast.LENGTH_SHORT).show();
                mExitTime = System.currentTimeMillis();
            } else {
                stopService(new Intent(this, AudioPlayService.class));
                NotificationManager notificationManager = (NotificationManager) getSystemService
                        (Context.NOTIFICATION_SERVICE);
                notificationManager.cancel(1);
                finish();
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
