package com.hankkin.PagerSlidingTabStrip;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.widget.ListView;
import com.hankkin.PagerSlidingTabStrip.adapter.MyAdapter;
import com.hankkin.PagerSlidingTabStrip.view.PagerSlidingTabStrip;

import java.util.ArrayList;
import java.util.List;

public class MyActivity extends FragmentActivity {

    private PagerSlidingTabStrip pagerTab;
    private ViewPager pager;
    private String[] titles={"JAVA","Android","Object C"};
    private Context context;
    private MyAdapter adapter;
    private List<Fragment> fragments;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        setContentView(R.layout.main);

        initViews();
    }

    private void initViews(){
        fragments = new ArrayList<>();
        pagerTab = (PagerSlidingTabStrip) findViewById(R.id.tab);
        pager = (ViewPager) findViewById(R.id.pager);

        for (int i=0;i<titles.length;i++){
            Fragment fragment = new Fragment();
            fragments.add(fragment);
        }

        adapter = new MyAdapter(getSupportFragmentManager(),titles);
        pager.setAdapter(adapter);
        pagerTab.setViewPager(pager);
    }
}
