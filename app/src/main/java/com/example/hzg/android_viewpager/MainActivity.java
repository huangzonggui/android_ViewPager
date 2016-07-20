package com.example.hzg.android_viewpager;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener{
    private List<View> viewList;
    private ViewPager pager;
    private List<String> titleList;
    private PagerTabStrip tab;
    private List<Fragment>fragmentList;

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

        fragmentList = new ArrayList<Fragment>();
        fragmentList.add(new Fragment1());
        fragmentList.add(new Fragment2());
        fragmentList.add(new Fragment3());
        fragmentList.add(new Fragment4());

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

        pager= (ViewPager) findViewById(R.id.pager);
//        MyPagerAdapter adapter = new MyPagerAdapter(viewList,titleList);
//        pager.setAdapter(adapter);
//        MyFragementPagerAdapter adapter1 = new MyFragementPagerAdapter(getSupportFragmentManager(), fragmentList, titleList);
//        pager.setAdapter(adapter1);
        MyFragementPagerAdapter2 adapter2 = new MyFragementPagerAdapter2(getSupportFragmentManager(), fragmentList, titleList);
        pager.setAdapter(adapter2);
        pager.setOnPageChangeListener(this);
    }


    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        Toast.makeText(this, "这是第"+(position+1)+"个界面", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
