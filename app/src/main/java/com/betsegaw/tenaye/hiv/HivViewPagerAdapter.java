package com.betsegaw.tenaye.hiv;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by betsegaw on 4/1/18.
 */

public class HivViewPagerAdapter extends FragmentStatePagerAdapter {

    int tabCount;

    public HivViewPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                HivContent hivContent = new HivContent();
                return hivContent;
            case 1:
                HivQuiz hivQuiz = new HivQuiz();
                return hivQuiz;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
