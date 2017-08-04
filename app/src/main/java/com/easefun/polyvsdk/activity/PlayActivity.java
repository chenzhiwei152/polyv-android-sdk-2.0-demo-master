package com.easefun.polyvsdk.activity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.easefun.polyvsdk.R;
import com.easefun.polyvsdk.util.PolyvScreenUtils;

/**
 * Created by chen.zhiwei on 2017-7-28.
 */

public class PlayActivity extends FragmentActivity {
    private PolyvPlayerView iv_play;
    private ImageView iv_null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play);
        iv_play = (PolyvPlayerView) findViewById(R.id.iv_play);
        iv_null = (ImageView) findViewById(R.id.iv_null);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
//        android.app.FragmentTransaction transaction=getFragmentManager().beginTransaction();
        iv_play.setTransaction(ft);
        iv_play.setVid("c538856ddeb0abe3b875545932c82c59_c");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (PolyvScreenUtils.isLandscape(this)) {
            // 横屏
            iv_null.setVisibility(View.GONE);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
            iv_play.setLayoutParams(lp);
        } else {
            // 竖屏
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, (int) getResources().getDimension(R.dimen.top_center_player_height));
            iv_play.setLayoutParams(lp);
            iv_null.setVisibility(View.VISIBLE);
        }
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
