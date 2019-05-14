package com.example.bionintelligence.presentation.info;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class InfoPageAdapter extends FragmentPagerAdapter {

    private int mSize;
    public InfoPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return InfoPageFragment.newInstance(position);
    }

    @Override
    public int getCount() {
        return 2;
    }
}
