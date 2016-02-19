package com.example.admin.musicplayer.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;

import com.example.admin.musicplayer.R;
import com.example.admin.musicplayer.global.BaseActivity;


public class SplashActivity extends BaseActivity {

    private Handler handler;

    /** 延迟3秒后进入首页 */
    private void delayEnterHome() {
        handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                enterHome();
            }
        }, 3000);
    }

    /** 进入首页 */
    protected void enterHome() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                handler.removeCallbacksAndMessages(null);
                enterHome();
                break;

            default:
                break;
        }
        return super.onTouchEvent(event);
    }

    @Override
    public void onBackPressed() {
        // super.onBackPressed();
    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        setContentView(R.layout.activity_splash);
    }

    @Override
    protected void setListener() {

    }

    @Override
    protected void processLogic(Bundle savedInstanceState) {
        delayEnterHome();
    }
}
