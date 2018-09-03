package com.example.jessi.rjt_hw_tab_subtabs;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerSub extends FragmentStatePagerAdapter {

    int iTabCount;

    public PagerSub(FragmentManager fm, int tabCount) {
        super(fm);
        this.iTabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Tab1SubTab1 subtab1Tab1 = new Tab1SubTab1();
                return subtab1Tab1;
            case 1:
                Tab1SubTab1 subtab1Tab2 = new Tab1SubTab1();
                return subtab1Tab2;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return iTabCount;
    }
}
