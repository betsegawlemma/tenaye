package com.betsegaw.tenaye.hivandotherstis;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.transition.TransitionManager;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.betsegaw.tenaye.R;

/**
 * Created by betsegaw on 4/1/18.
 */

public class HivContent extends Fragment {

    // HivAndSTIs introduction
    TextView hivIntroHeader;
    TextView hivIntroArrow;
    ConstraintLayout hivIntroDetail;

    // HivAndSTIs stages
    TextView hivStagesHeader;
    TextView hivStagesArrow;
    ConstraintLayout hivStagesDetail;

    // HivAndSTIs syptoms
    TextView hivSyptomsHeader;
    TextView hivSyptomsArrow;
    ConstraintLayout hivSyptomsDetail;

    // HivAndSTIs misconceptions
    TextView hivMisconceptionsHeader;
    TextView hivMisconceptionsArrow;
    ConstraintLayout hivMisconceptionsDetail;

    // HivAndSTIs diagnosis
    TextView hivDiagnosisHeader;
    TextView hivDiagnosisArrow;
    ConstraintLayout hivDiagnosisDetail;

    // HivAndSTIs transmission
    TextView hivTransmissionHeader;
    TextView hivTransmissionArrow;
    ConstraintLayout hivTransmissionDetail;

    // HivAndSTIs prevention
    TextView hivPreventionHeader;
    TextView hivPreventionArrow;
    ConstraintLayout hivPreventionDetail;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.hiv_content_tab, container, false);

        // HivAndSTIs Introduction
        hivIntroHeader = view.findViewById(R.id.hiv_intro_header);
        hivIntroDetail = view.findViewById(R.id.hiv_intro_details);
        hivIntroArrow = view.findViewById(R.id.hiv_intro_arrow);

        hivIntroHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TransitionManager.beginDelayedTransition(hivIntroDetail);

                if(hivIntroDetail.getVisibility()==View.VISIBLE){
                    hivIntroArrow.setText(R.string.down_arrow);
                   setGone(hivIntroDetail);
                }else if(hivIntroDetail.getVisibility()==View.GONE) {
                    setVisible(hivIntroDetail);
                    hivIntroArrow.setText(R.string.up_arrow);

                }
            }
        });

       // HivAndSTIs Stages
        hivStagesHeader = view.findViewById(R.id.hiv_stages_header);
        hivStagesDetail = view.findViewById(R.id.hiv_stages_detail);
        hivStagesArrow = view.findViewById(R.id.hiv_stages_arrow);

        hivStagesHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TransitionManager.beginDelayedTransition(hivStagesDetail);

                if(hivStagesDetail.getVisibility()==View.VISIBLE){
                    hivStagesArrow.setText(R.string.down_arrow);
                    setGone(hivStagesDetail);
                }else if(hivStagesDetail.getVisibility()==View.GONE) {
                    setVisible(hivStagesDetail);
                    hivStagesArrow.setText(R.string.up_arrow);

                }
            }
        });

        // HivAndSTIs Syptoms
        hivSyptomsHeader = view.findViewById(R.id.hiv_syptoms_header);
        hivSyptomsDetail = view.findViewById(R.id.hiv_syptoms_details);
        hivSyptomsArrow = view.findViewById(R.id.hiv_syptoms_arrow);

        hivSyptomsHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(hivSyptomsDetail);

                if(hivSyptomsDetail.getVisibility()==View.VISIBLE){
                    hivSyptomsArrow.setText(R.string.down_arrow);
                    setGone(hivSyptomsDetail);
                }else if(hivSyptomsDetail.getVisibility()==View.GONE) {
                    setVisible(hivSyptomsDetail);
                    hivSyptomsArrow.setText(R.string.up_arrow);

                }
            }
        });

        // HivAndSTIs Misconceptions
        hivMisconceptionsHeader = view.findViewById(R.id.hiv_misconceptions_header);
        hivMisconceptionsArrow = view.findViewById(R.id.hiv_misconceptions_arrow);
        hivMisconceptionsDetail = view.findViewById(R.id.hiv_misconceptions_details);

        hivMisconceptionsHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(hivMisconceptionsDetail);

                if(hivMisconceptionsDetail.getVisibility()==View.VISIBLE){
                    hivMisconceptionsArrow.setText(R.string.down_arrow);
                    setGone(hivMisconceptionsDetail);
                }else if(hivSyptomsDetail.getVisibility()==View.GONE) {
                    setVisible(hivMisconceptionsDetail);
                    hivMisconceptionsArrow.setText(R.string.up_arrow);

                }
            }
        });

        // HivAndSTIs Diagnosis
        hivDiagnosisHeader = view.findViewById(R.id.hiv_diagnosis_header);
        hivDiagnosisArrow = view.findViewById(R.id.hiv_diagnosis_arrow);
        hivDiagnosisDetail = view.findViewById(R.id.hiv_diagnosis_details);

        hivDiagnosisHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(hivDiagnosisDetail);

                if(hivDiagnosisDetail.getVisibility()==View.VISIBLE){
                    hivDiagnosisArrow.setText(R.string.down_arrow);
                    setGone(hivDiagnosisDetail);
                }else if(hivDiagnosisDetail.getVisibility()==View.GONE) {
                    setVisible(hivDiagnosisDetail);
                    hivDiagnosisArrow.setText(R.string.up_arrow);

                }
            }
        });

        // HivAndSTIs Transmission
        hivTransmissionHeader = view.findViewById(R.id.hiv_transmission_header);
        hivTransmissionArrow = view.findViewById(R.id.hiv_transmission_arrow);
        hivTransmissionDetail = view.findViewById(R.id.hiv_transmission_details);

        hivTransmissionHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(hivTransmissionDetail);

                if(hivTransmissionDetail.getVisibility()==View.VISIBLE){
                    hivTransmissionArrow.setText(R.string.down_arrow);
                    setGone(hivTransmissionDetail);
                }else if(hivTransmissionDetail.getVisibility()==View.GONE) {
                    setVisible(hivTransmissionDetail);
                    hivTransmissionArrow.setText(R.string.up_arrow);

                }
            }
        });

        // HivAndSTIs Prevention
        hivPreventionHeader = view.findViewById(R.id.hiv_prevention_header);
        hivPreventionArrow = view.findViewById(R.id.hiv_prevention_arrow);
        hivPreventionDetail = view.findViewById(R.id.hiv_prevention_details);

        hivPreventionHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(hivPreventionDetail);

                if(hivPreventionDetail.getVisibility()==View.VISIBLE){
                    hivPreventionArrow.setText(R.string.down_arrow);
                    setGone(hivPreventionDetail);
                }else if(hivPreventionDetail.getVisibility()==View.GONE) {
                    setVisible(hivPreventionDetail);
                    hivPreventionArrow.setText(R.string.up_arrow);

                }
            }
        });

        return view;
    }

    void setVisible(ConstraintLayout constraintLayout) {

        hivIntroDetail.setVisibility(View.GONE);
        hivIntroArrow.setText(R.string.down_arrow);
        hivStagesDetail.setVisibility(View.GONE);
        hivStagesArrow.setText(R.string.down_arrow);
        hivSyptomsDetail.setVisibility(View.GONE);
        hivSyptomsArrow.setText(R.string.down_arrow);
        hivMisconceptionsDetail.setVisibility(View.GONE);
        hivMisconceptionsArrow.setText(R.string.down_arrow);
        hivDiagnosisDetail.setVisibility(View.GONE);
        hivDiagnosisArrow.setText(R.string.down_arrow);
        hivTransmissionDetail.setVisibility(View.GONE);
        hivTransmissionArrow.setText(R.string.down_arrow);
        hivPreventionDetail.setVisibility(View.GONE);
        hivPreventionArrow.setText(R.string.down_arrow);

        constraintLayout.setVisibility(View.VISIBLE);

    }

    void setGone(ConstraintLayout constraintLayout) {
        constraintLayout.setVisibility(View.GONE);
    }
}
