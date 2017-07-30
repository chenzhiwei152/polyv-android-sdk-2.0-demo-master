package com.easefun.polyvsdk.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;

import com.easefun.polyvsdk.R;

/**
 * Created by chen.zhiwei on 2017-7-28.
 */

public class PlayActivity extends FragmentActivity {
    private PolyvPlayerView iv_play;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play);
        iv_play = (PolyvPlayerView) findViewById(R.id.iv_play);


        FragmentTransaction ft =getSupportFragmentManager().beginTransaction();
//        android.app.FragmentTransaction transaction=getFragmentManager().beginTransaction();
        iv_play.setTransaction(ft);
        iv_play.setVid("c538856ddeb0abe3b875545932c82c59_c");
    }

    @Override
    protected void onResume() {
        super.onResume();
        iv_play.resume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        iv_play.pause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        iv_play.stop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        iv_play.destroy();
    }
}
