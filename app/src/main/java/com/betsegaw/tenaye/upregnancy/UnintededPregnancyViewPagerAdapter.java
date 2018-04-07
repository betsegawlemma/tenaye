package com.betsegaw.tenaye.upregnancy;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.betsegaw.tenaye.mentalhealth.MentalHealthContent;
import com.betsegaw.tenaye.mentalhealth.MentalHealthQuiz;

/**
 * Created by betsegaw on 4/1/18.
 */

public class UnintededPregnancyViewPagerAdapter extends FragmentStatePagerAdapter {

    int tabCount;

    public UnintededPregnancyViewPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                UnintendedPregnancyContent unintendedPregnancyContent = new UnintendedPregnancyContent();
                return unintendedPregnancyContent;
            case 1:
                UnintendedPregnancyQuiz unintendedPregnancyQuiz = new UnintendedPregnancyQuiz();
                return unintendedPregnancyQuiz;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
