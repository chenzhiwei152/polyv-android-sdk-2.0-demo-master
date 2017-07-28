package com.easefun.polyvsdk.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.easefun.polyvsdk.R;

/**
 * Created by chen.zhiwei on 2017-7-28.
 */

public class PlayActivity extends Activity {
    private PolyvPlayerView iv_play;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play);
        iv_play= (PolyvPlayerView) findViewById(R.id.iv_play);
    }
}
