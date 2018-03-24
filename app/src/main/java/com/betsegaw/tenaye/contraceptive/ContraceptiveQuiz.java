package com.betsegaw.tenaye.contraceptive;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.betsegaw.tenaye.R;

/**
 * Created by betsegaw on 3/24/18.
 */

public class ContraceptiveQuiz extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.contraceptive_quiz_tab, container, false);
    }
}
