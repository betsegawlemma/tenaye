package com.betsegaw.tenaye.hivandotherstis;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by betsegaw on 4/1/18.
 */

public class HivAndOtherSTIsViewPagerAdapter extends FragmentStatePagerAdapter {

    int tabCount;

    public HivAndOtherSTIsViewPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                HivAndOtherSTIsContent hivContent = new HivAndOtherSTIsContent();
                return hivContent;
            case 1:
                HivAndOtherSTIsQuiz hivAndOtherSTIsQuiz = new HivAndOtherSTIsQuiz();
                return hivAndOtherSTIsQuiz;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
