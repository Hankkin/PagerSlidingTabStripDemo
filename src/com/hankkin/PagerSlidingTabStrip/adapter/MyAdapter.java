package com.hankkin.PagerSlidingTabStrip.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.hankkin.PagerSlidingTabStrip.fragment.AndroidFragment;
import com.hankkin.PagerSlidingTabStrip.fragment.JavaFragment;
import com.hankkin.PagerSlidingTabStrip.fragment.ObjectCFragment;

import java.util.List;

/**
 * Created by Hankkin on 15/9/20.
 */
public class MyAdapter extends FragmentPagerAdapter {
    private AndroidFragment androidFragment;
    private JavaFragment javaFragment;
    private ObjectCFragment objectCFragment;
    private String[] titles;
    public MyAdapter(FragmentManager fm,String[] titles) {
        super(fm);
        this.titles = titles;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                if (androidFragment == null) {
                    androidFragment = new AndroidFragment();
                }
                return androidFragment;
            case 1:
                if (javaFragment == null) {
                    javaFragment = new JavaFragment();
                }
                return javaFragment;
            case 2:
                if (objectCFragment == null) {
                    objectCFragment = new ObjectCFragment();
                }
                return objectCFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    public String getPageTitle(int i){
        return titles[i];
    }

}
