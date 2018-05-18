package com.betsegaw.tenaye.mentalhealth;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.betsegaw.tenaye.R;

/**
 * Created by betsegaw on 4/1/18.
 */

public class MentalHealthQuiz extends Fragment{

    TextView mentalMyth;
    TextView mentalDescription;

    TextView mentalFirstChoice;
    TextView mentalSecondChoice;

    TextView mentalChoiceA;
    TextView mentalChoiceB;

    TextView nextQuestion;

    final int totalQuestion = 7;

    int currentQuestion = 0;

    String mentalQnAnswer;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.mentalhealth_quiz_tab, container, false);

        mentalMyth = view.findViewById(R.id.mental_myth);
        mentalDescription = view.findViewById(R.id.mental_description);

        mentalChoiceA = view.findViewById(R.id.mental_choiceA);
        mentalChoiceB = view.findViewById(R.id.mental_choiceB);

        mentalFirstChoice = view.findViewById(R.id.mental_firstChoice);
        mentalSecondChoice = view.findViewById(R.id.mental_secondChoice);

        nextQuestion = view.findViewById(R.id.mental_next);

        getNextQuestion();

        mentalChoiceA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isAnswer(mentalFirstChoice.getText().toString(),mentalQnAnswer)){
                    mentalChoiceA.setBackgroundResource(R.drawable.choice_right);
                    mentalChoiceA.setText(R.string.check_mark);
                    loadDescription();
                }else {
                    mentalChoiceA.setBackgroundResource(R.drawable.choice_wrong);
                    mentalChoiceA.setText(R.string.cross_mark);
                    loadDescription();
                }
            }
        });

        mentalChoiceB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isAnswer(mentalSecondChoice.getText().toString(),mentalQnAnswer)){
                    mentalChoiceB.setBackgroundResource(R.drawable.choice_right);
                    mentalChoiceB.setText(R.string.check_mark);
                    loadDescription();
                }else {
                    mentalChoiceB.setBackgroundResource(R.drawable.choice_wrong);
                    mentalChoiceB.setText(R.string.cross_mark);
                    loadDescription();
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
        int mythId = getStringResourceByName("myth_"+currentQuestion, "string");
        String mythQn = res.getString(mythId);
        int choicesId = getStringResourceByName("myth_choices","array");
        String[] mythQnChoices = res.getStringArray(choicesId);
        int choiceSize = mythQnChoices.length;

        loadQuestion(mythQn,mythQnChoices,choiceSize);
    }

    private void loadDescription(){
        Resources res = getResources();
        int mythDescriptionId = getStringResourceByName("myth_"+currentQuestion+"_description", "string");
        String mythDn = res.getString(mythDescriptionId);
        mentalDescription.setText(mythDn);
    }

    private void loadQuestion(String myth, String[] choices, int size) {

        mentalDescription.setText("");
        mentalMyth.setText(myth);

     if(size == 3){
            mentalFirstChoice.setText(choices[0]);
            mentalChoiceA.setText("A");
            mentalChoiceA.setBackgroundResource(R.drawable.question_choices);
            mentalSecondChoice.setText(choices[1]);
            mentalChoiceB.setText("B");
            mentalChoiceB.setBackgroundResource(R.drawable.question_choices);
            mentalQnAnswer = choices[2];
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

}
