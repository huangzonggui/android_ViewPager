package com.example.hzg.android_viewpager;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewParent;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<View> viewList;
    private ViewPager pager;
    private List<String> titleList;
    private PagerTabStrip tab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        View view1 = View.inflate(this, R.layout.view1,null);
        View view2 = View.inflate(this, R.layout.view2,null);
        View view3 = View.inflate(this, R.layout.view3,null);
        View view4 = View.inflate(this, R.layout.view4,null);
        viewList =new ArrayList<View>();
        viewList.add(view1);
        viewList.add(view2);
        viewList.add(view3);
        viewList.add(view4);

        titleList = new ArrayList<String>();
        titleList.add("第一页");
        titleList.add("第二页");
        titleList.add("第三页");
        titleList.add("第四页");

        tab = (PagerTabStrip) findViewById(R.id.tab);
        tab.setBackgroundColor(Color.YELLOW);
        tab.setTabIndicatorColor(Color.BLUE);
        tab.setDrawFullUnderline(false);
        tab.setTextColor(Color.RED);

        MyPagerAdapter adapter = new MyPagerAdapter(viewList,titleList);
        pager= (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(adapter);
    }

}
