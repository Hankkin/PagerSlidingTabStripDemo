package com.hankkin.PagerSlidingTabStrip.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.hankkin.PagerSlidingTabStrip.R;

/**
 * Created by Hankkin on 15/9/20.
 */
public class JavaFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fg_java, null);

    }
}