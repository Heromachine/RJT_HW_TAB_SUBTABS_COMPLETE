package com.example.jessi.rjt_hw_tab_subtabs;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class Pager extends FragmentStatePagerAdapter {

    int iTabCount;

    public Pager(FragmentManager fm, int tabCount) {
        super(fm);
        this.iTabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Tab1 tab1 = new Tab1();
                return tab1;
            case 1:
                Tab1 tab2= new Tab1();
                return tab2;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return iTabCount;
    }
}
