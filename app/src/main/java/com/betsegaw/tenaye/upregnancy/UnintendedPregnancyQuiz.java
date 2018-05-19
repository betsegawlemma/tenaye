package com.betsegaw.tenaye.upregnancy;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.betsegaw.tenaye.R;

public class UnintendedPregnancyQuiz extends Fragment {


    TextView pregQuestion;

    TextView pregFirstChoice;
    TextView pregSecondChoice;
    TextView pregThirdChoice;
    TextView pregFourthChoice;

    TextView pregChoiceA;
    TextView pregChoiceB;
    TextView pregChoiceC;
    TextView pregChoiceD;

    TextView nextQustion;

    final int totalQuestion = 5;

    int currentQuestion = 0;

    String pregQnAnswer;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.upregnancy_quiz_tab, container, false);

        pregQuestion = view.findViewById(R.id.preg_question);

        pregChoiceA = view.findViewById(R.id.preg_choiceA);
        pregChoiceB = view.findViewById(R.id.preg_choiceB);
        pregChoiceC = view.findViewById(R.id.preg_choiceC);
        pregChoiceD = view.findViewById(R.id.preg_choiceD);

        pregFirstChoice = view.findViewById(R.id.preg_firstChoice);
        pregSecondChoice = view.findViewById(R.id.preg_secondChoice);
        pregThirdChoice = view.findViewById(R.id.preg_thirdChoice);
        pregFourthChoice = view.findViewById(R.id.preg_fourthChoice);

        nextQustion = view.findViewById(R.id.preg_next);

        getNextQuestion();

        pregChoiceA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isAnswer(pregFirstChoice.getText().toString(),pregQnAnswer)){
                    pregChoiceA.setBackgroundResource(R.drawable.choice_right);
                    pregChoiceA.setText(R.string.check_mark);
                }else {
                    pregChoiceA.setBackgroundResource(R.drawable.choice_wrong);
                    pregChoiceA.setText(R.string.cross_mark);
                }
            }
        });

        pregChoiceB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isAnswer(pregSecondChoice.getText().toString(),pregQnAnswer)){
                    pregChoiceB.setBackgroundResource(R.drawable.choice_right);
                    pregChoiceB.setText(R.string.check_mark);
                }else {
                    pregChoiceB.setBackgroundResource(R.drawable.choice_wrong);
                    pregChoiceB.setText(R.string.cross_mark);
                }
            }
        });

        pregChoiceC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isAnswer(pregThirdChoice.getText().toString(),pregQnAnswer)){
                    pregChoiceC.setBackgroundResource(R.drawable.choice_right);
                    pregChoiceC.setText(R.string.check_mark);
                }else {
                    pregChoiceC.setBackgroundResource(R.drawable.choice_wrong);
                    pregChoiceC.setText(R.string.cross_mark);
                }
            }
        });

        pregChoiceD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isAnswer(pregFourthChoice.getText().toString(),pregQnAnswer)){
                    pregChoiceD.setBackgroundResource(R.drawable.choice_right);
                    pregChoiceD.setText(R.string.check_mark);
                }else {
                    pregChoiceD.setBackgroundResource(R.drawable.choice_wrong);
                    pregChoiceD.setText(R.string.cross_mark);
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
        int questionId = getStringResourceByName("preg_q"+currentQuestion, "string");
        String pregQn = res.getString(questionId);
        int choicesId = getStringResourceByName("preg_q"+currentQuestion+"_choices","array");
        String[] pregQnChoices = res.getStringArray(choicesId);
        int choiceSize = pregQnChoices.length;

        loadQuestion(pregQn,pregQnChoices,choiceSize);
    }

    private void loadQuestion(String question, String[] choices, int size) {

        pregQuestion.setText(question);

        if(size == 5) {
            enableChoices();
            pregFirstChoice.setText(choices[0]);
            pregChoiceA.setText(R.string.choiceA);
            pregChoiceA.setBackgroundResource(R.drawable.question_choices);
            pregSecondChoice.setText(choices[1]);
            pregChoiceB.setText(R.string.choiceB);
            pregChoiceB.setBackgroundResource(R.drawable.question_choices);
            pregThirdChoice.setText(choices[2]);
            pregChoiceC.setText(R.string.choiceC);
            pregChoiceC.setBackgroundResource(R.drawable.question_choices);
            pregFourthChoice.setText(choices[3]);
            pregChoiceD.setText(R.string.choiceD);
            pregChoiceD.setBackgroundResource(R.drawable.question_choices);
            pregQnAnswer = choices[4];
        } else if(size == 3){
            disableChoices();
            pregFirstChoice.setText(choices[0]);
            pregChoiceA.setText(R.string.choiceA);
            pregChoiceA.setBackgroundResource(R.drawable.question_choices);
            pregSecondChoice.setText(choices[1]);
            pregChoiceB.setText(R.string.choiceB);
            pregChoiceB.setBackgroundResource(R.drawable.question_choices);
            pregQnAnswer = choices[2];
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
        pregChoiceC.setVisibility(View.GONE);
        pregChoiceD.setVisibility(View.GONE);
        pregThirdChoice.setVisibility(View.GONE);
        pregFourthChoice.setVisibility(View.GONE);
    }

    private void enableChoices() {
        pregChoiceC.setVisibility(View.VISIBLE);
        pregChoiceD.setVisibility(View.VISIBLE);
        pregThirdChoice.setVisibility(View.VISIBLE);
        pregFourthChoice.setVisibility(View.VISIBLE);
    }
}
