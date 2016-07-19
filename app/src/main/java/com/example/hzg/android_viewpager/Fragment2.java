package com.example.hzg.android_viewpager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by hzg on 2016/7/19.
 */
public class Fragment2 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.view2, container, false);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("Main", "报告，Fragment2已经被销毁");
    }
}
