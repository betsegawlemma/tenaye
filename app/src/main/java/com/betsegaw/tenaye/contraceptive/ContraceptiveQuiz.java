package com.betsegaw.tenaye.contraceptive;

import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.betsegaw.tenaye.R;

/**
 * Created by betsegaw on 3/24/18.
 */

public class ContraceptiveQuiz extends Fragment {

    TextView contraceptionQuestion;

    TextView contraceptionFirstChoice;
    TextView contraceptionSecondChoice;
    TextView contraceptionThirdChoice;
    TextView contraceptionFourthChoice;

    TextView contraceptionChoiceA;
    TextView contraceptionChoiceB;
    TextView contraceptionChoiceC;
    TextView contraceptionChoiceD;

    TextView nextQuestion;

    final int totalQuestion = 16;

    int currentQuestion = 0;

    String contraceptionQnAnswer;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.contraceptive_quiz_tab, container, false);

        contraceptionQuestion = view.findViewById(R.id.contra_question);

        contraceptionChoiceA = view.findViewById(R.id.contra_choiceA);
        contraceptionChoiceB = view.findViewById(R.id.contra_choiceB);
        contraceptionChoiceC = view.findViewById(R.id.contra_choiceC);
        contraceptionChoiceD = view.findViewById(R.id.contra_choiceD);

        contraceptionFirstChoice = view.findViewById(R.id.contra_firstChoice);
        contraceptionSecondChoice = view.findViewById(R.id.contra_secondChoice);
        contraceptionThirdChoice = view.findViewById(R.id.contra_thirdChoice);
        contraceptionFourthChoice = view.findViewById(R.id.contra_fourthChoice);

        nextQuestion = view.findViewById(R.id.contra_next);

        getNextQuestion();

        contraceptionChoiceA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isAnswer(contraceptionFirstChoice.getText().toString(),contraceptionQnAnswer)){
                    contraceptionChoiceA.setBackgroundResource(R.drawable.choice_right);
                    contraceptionChoiceA.setText(R.string.check_mark);
                }else {
                    contraceptionChoiceA.setBackgroundResource(R.drawable.choice_wrong);
                    contraceptionChoiceA.setText(R.string.cross_mark);
                }
            }
        });

        contraceptionChoiceB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isAnswer(contraceptionSecondChoice.getText().toString(),contraceptionQnAnswer)){
                    contraceptionChoiceB.setBackgroundResource(R.drawable.choice_right);
                    contraceptionChoiceB.setText(R.string.check_mark);
                }else {
                    contraceptionChoiceB.setBackgroundResource(R.drawable.choice_wrong);
                    contraceptionChoiceB.setText(R.string.cross_mark);
                }
            }
        });

        contraceptionChoiceC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isAnswer(contraceptionThirdChoice.getText().toString(),contraceptionQnAnswer)){
                    contraceptionChoiceC.setBackgroundResource(R.drawable.choice_right);
                    contraceptionChoiceC.setText(R.string.check_mark);
                }else {
                    contraceptionChoiceC.setBackgroundResource(R.drawable.choice_wrong);
                    contraceptionChoiceC.setText(R.string.cross_mark);
                }
            }
        });

        contraceptionChoiceD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isAnswer(contraceptionFourthChoice.getText().toString(),contraceptionQnAnswer)){
                    contraceptionChoiceD.setBackgroundResource(R.drawable.choice_right);
                    contraceptionChoiceD.setText(R.string.check_mark);
                }else {
                    contraceptionChoiceD.setBackgroundResource(R.drawable.choice_wrong);
                    contraceptionChoiceD.setText(R.string.cross_mark);
                }
            }
        });

        nextQuestion.setOnClickListener(new View.OnClickListener() {
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
        int questionId = getStringResourceByName("contra_q"+currentQuestion, "string");
        String contraQuestion = res.getString(questionId);
        int choicesId = getStringResourceByName("contra_q"+currentQuestion+"_choices","array");
        String[] contraQuestionChoices = res.getStringArray(choicesId);
        int choiceSize = contraQuestionChoices.length;

        loadQuestion(contraQuestion,contraQuestionChoices,choiceSize);
    }

    private void loadQuestion(String question, String[] choices, int size) {

        contraceptionQuestion.setText(question);

        if(size == 5) {
            enableChoices();
            contraceptionFirstChoice.setText(choices[0]);
            contraceptionChoiceA.setText(R.string.choiceA);
            contraceptionChoiceA.setBackgroundResource(R.drawable.question_choices);
            contraceptionSecondChoice.setText(choices[1]);
            contraceptionChoiceB.setText(R.string.choiceB);
            contraceptionChoiceB.setBackgroundResource(R.drawable.question_choices);
            contraceptionThirdChoice.setText(choices[2]);
            contraceptionChoiceC.setText(R.string.choiceC);
            contraceptionChoiceC.setBackgroundResource(R.drawable.question_choices);
            contraceptionFourthChoice.setText(choices[3]);
            contraceptionChoiceD.setText(R.string.choiceD);
            contraceptionChoiceD.setBackgroundResource(R.drawable.question_choices);
            contraceptionQnAnswer = choices[4];
        } else if(size == 3){
            disableChoices();
            contraceptionFirstChoice.setText(choices[0]);
            contraceptionChoiceA.setText(R.string.choiceA);
            contraceptionChoiceA.setBackgroundResource(R.drawable.question_choices);
            contraceptionSecondChoice.setText(choices[1]);
            contraceptionChoiceB.setText(R.string.choiceB);
            contraceptionChoiceB.setBackgroundResource(R.drawable.question_choices);
            contraceptionQnAnswer = choices[2];
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
        contraceptionChoiceC.setVisibility(View.GONE);
        contraceptionChoiceD.setVisibility(View.GONE);
        contraceptionThirdChoice.setVisibility(View.GONE);
        contraceptionFourthChoice.setVisibility(View.GONE);
    }

    private void enableChoices() {
        contraceptionChoiceC.setVisibility(View.VISIBLE);
        contraceptionChoiceD.setVisibility(View.VISIBLE);
        contraceptionThirdChoice.setVisibility(View.VISIBLE);
        contraceptionFourthChoice.setVisibility(View.VISIBLE);
    }
}
