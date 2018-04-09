package com.betsegaw.tenaye.contraceptive;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by betsegaw on 3/24/18.
 */

public class ContraceptiveViewPagerAdapter extends FragmentStatePagerAdapter {

   int tabCount;

    public ContraceptiveViewPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                ContraceptiveContent contraceptiveContent = new ContraceptiveContent();
                return contraceptiveContent;
            case 1:
                ContraceptiveQuiz contraceptiveQuiz = new ContraceptiveQuiz();
                return contraceptiveQuiz;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
