package com.betsegaw.tenaye.hivandotherstis;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.betsegaw.tenaye.R;

/**
 * Created by betsegaw on 4/1/18.
 */

public class HivAndOtherSTIsQuiz extends Fragment{

 TextView hivStiQuestion;

 TextView hivStiFirstChoice;
 TextView hivStiSecondChoice;
 TextView hivStiThirdChoice;
 TextView hivStiFourthChoice;

 TextView hivStiChoiceA;
 TextView hivStiChoiceB;
 TextView hivStiChoiceC;
 TextView hivStiChoiceD;

 TextView nextQustion;

 final int totalQuestion = 10;

 int currentQuestion = 0;

 String hivStiQnAnswer;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.hiv_sti_quiz_tab, container, false);

        hivStiQuestion = view.findViewById(R.id.hiv_sti_question);

        hivStiChoiceA = view.findViewById(R.id.hiv_sti_choiceA);
        hivStiChoiceB = view.findViewById(R.id.hiv_sti_choiceB);
        hivStiChoiceC = view.findViewById(R.id.hiv_sti_choiceC);
        hivStiChoiceD = view.findViewById(R.id.hiv_sti_choiceD);

        hivStiFirstChoice = view.findViewById(R.id.hiv_sti_firstChoice);
        hivStiSecondChoice = view.findViewById(R.id.hiv_sti_secondChoice);
        hivStiThirdChoice = view.findViewById(R.id.hiv_sti_thirdChoice);
        hivStiFourthChoice = view.findViewById(R.id.hiv_sti_fourthChoice);

        nextQustion = view.findViewById(R.id.hiv_sti_next);

        getNextQuestion();

        hivStiChoiceA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isAnswer(hivStiFirstChoice.getText().toString(),hivStiQnAnswer)){
                    hivStiChoiceA.setBackgroundResource(R.drawable.choice_right);
                    hivStiChoiceA.setText(R.string.check_mark);
                }else {
                    hivStiChoiceA.setBackgroundResource(R.drawable.choice_wrong);
                    hivStiChoiceA.setText(R.string.cross_mark);
                }
            }
        });

        hivStiChoiceB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isAnswer(hivStiSecondChoice.getText().toString(),hivStiQnAnswer)){
                    hivStiChoiceB.setBackgroundResource(R.drawable.choice_right);
                    hivStiChoiceB.setText(R.string.check_mark);
                }else {
                    hivStiChoiceB.setBackgroundResource(R.drawable.choice_wrong);
                    hivStiChoiceB.setText(R.string.cross_mark);
                }
            }
        });

        hivStiChoiceC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isAnswer(hivStiThirdChoice.getText().toString(),hivStiQnAnswer)){
                    hivStiChoiceC.setBackgroundResource(R.drawable.choice_right);
                    hivStiChoiceC.setText(R.string.check_mark);
                }else {
                    hivStiChoiceC.setBackgroundResource(R.drawable.choice_wrong);
                    hivStiChoiceC.setText(R.string.cross_mark);
                }
            }
        });

        hivStiChoiceD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isAnswer(hivStiFourthChoice.getText().toString(),hivStiQnAnswer)){
                    hivStiChoiceD.setBackgroundResource(R.drawable.choice_right);
                    hivStiChoiceD.setText(R.string.check_mark);
                }else {
                    hivStiChoiceD.setBackgroundResource(R.drawable.choice_wrong);
                    hivStiChoiceD.setText(R.string.cross_mark);
                }
            }
        });

        nextQustion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    getNextQuestion();

            }
        });


        return view;
    }

    private void getNextQuestion(){

        currentQuestion = (currentQuestion+1) % (totalQuestion+1);

        if(currentQuestion == 0) {
            currentQuestion = 1;
        }

        Resources res = getResources();
        int questionId = getStringResourceByName("hiv_sti_q"+currentQuestion, "string");
        String hivStiQn = res.getString(questionId);
        int choicesId = getStringResourceByName("hiv_sti_q"+currentQuestion+"_choices","array");
        String[] hivStiQnChoices = res.getStringArray(choicesId);
        int choiceSize = hivStiQnChoices.length;

        loadQuestion(hivStiQn,hivStiQnChoices,choiceSize);
    }

    private void loadQuestion(String question, String[] choices, int size) {

        hivStiQuestion.setText(question);

        if(size == 5) {
            enableChoices();
            hivStiFirstChoice.setText(choices[0]);
            hivStiChoiceA.setText(R.string.choiceA);
            hivStiChoiceA.setBackgroundResource(R.drawable.question_choices);
            hivStiSecondChoice.setText(choices[1]);
            hivStiChoiceB.setText(R.string.choiceB);
            hivStiChoiceB.setBackgroundResource(R.drawable.question_choices);
            hivStiThirdChoice.setText(choices[2]);
            hivStiChoiceC.setText(R.string.choiceC);
            hivStiChoiceC.setBackgroundResource(R.drawable.question_choices);
            hivStiFourthChoice.setText(choices[3]);
            hivStiChoiceD.setText(R.string.choiceD);
            hivStiChoiceD.setBackgroundResource(R.drawable.question_choices);
            hivStiQnAnswer = choices[4];
        } else if(size == 3){
            disableChoices();
            hivStiFirstChoice.setText(choices[0]);
            hivStiChoiceA.setText(R.string.choiceA);
            hivStiChoiceA.setBackgroundResource(R.drawable.question_choices);
            hivStiSecondChoice.setText(choices[1]);
            hivStiChoiceB.setText(R.string.choiceB);
            hivStiChoiceB.setBackgroundResource(R.drawable.question_choices);
            hivStiQnAnswer = choices[2];
        }
    }

    private boolean isAnswer(String choice, String answer) {
        return choice.equals(answer);
    }


    private int getStringResourceByName(String aString, String type) {
        String packageName = getActivity().getPackageName();
        int resId = getResources().getIdentifier(aString, type, packageName);
        return resId;
    }

    private void disableChoices() {
        hivStiChoiceC.setVisibility(View.GONE);
        hivStiChoiceD.setVisibility(View.GONE);
        hivStiThirdChoice.setVisibility(View.GONE);
        hivStiFourthChoice.setVisibility(View.GONE);
    }

    private void enableChoices() {
        hivStiChoiceC.setVisibility(View.VISIBLE);
        hivStiChoiceD.setVisibility(View.VISIBLE);
        hivStiThirdChoice.setVisibility(View.VISIBLE);
        hivStiFourthChoice.setVisibility(View.VISIBLE);
    }
}
