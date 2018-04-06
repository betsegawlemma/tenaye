package com.betsegaw.tenaye.mentalhealth;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.betsegaw.tenaye.hiv.HivContent;
import com.betsegaw.tenaye.hiv.HivQuiz;

/**
 * Created by betsegaw on 4/1/18.
 */

public class MentalHealthViewPagerAdapter extends FragmentStatePagerAdapter {

    int tabCount;

    public MentalHealthViewPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                MentalHealthContent mentalHealthContent = new MentalHealthContent();
                return mentalHealthContent;
            case 1:
                MentalHealthQuiz mentalHealthQuiz = new MentalHealthQuiz();
                return mentalHealthQuiz;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
