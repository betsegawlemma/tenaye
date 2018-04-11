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

public class STIsContent extends Fragment {

    // STIs introduction
    TextView stiIntroHeader;
    TextView stiIntroArrow;
    ConstraintLayout stiIntroDetail;

    // STI causes
    TextView stiCausesHeader;
    TextView stiCausesArrow;
    ConstraintLayout stiCausesDetail;

    // STI Transmission
    TextView stiTransmissionHeader;
    TextView stiTransmissionArrow;
    ConstraintLayout stiTransmissionDetail;

    // STI Syptoms
    TextView stiSyptomsHeader;
    TextView stiSyptomsArrow;
    ConstraintLayout stiSyptomsDetail;

    // STI Complications
    TextView stiComplicationsHeader;
    TextView stiComplicationsArrow;
    ConstraintLayout stiComplicationsDetail;

    // STI prevention
    TextView stiPreventionHeader;
    TextView stiPreventionArrow;
    ConstraintLayout stiPreventionDetail;

    // STI Treatment
    TextView stiTreatmentHeader;
    TextView stiTreatmentArrow;
    ConstraintLayout stiTreatmentDetail;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.sti_content_tab, container, false);

        // STIs Introduction
        stiIntroHeader = view.findViewById(R.id.sti_intro_header);
        stiIntroDetail = view.findViewById(R.id.sti_intro_details);
        stiIntroArrow = view.findViewById(R.id.sti_intro_arrow);

        stiIntroHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TransitionManager.beginDelayedTransition(stiIntroDetail);

                if(stiIntroDetail.getVisibility()==View.VISIBLE){
                    stiIntroArrow.setText(R.string.down_arrow);
                    setGone(stiIntroDetail);
                }else if(stiIntroDetail.getVisibility()==View.GONE) {
                    setVisible(stiIntroDetail);
                    stiIntroArrow.setText(R.string.up_arrow);

                }
            }
        });

       // STI Causes
        stiCausesHeader = view.findViewById(R.id.sti_causes_header);
        stiCausesDetail = view.findViewById(R.id.sti_causes_details);
        stiCausesArrow = view.findViewById(R.id.sti_causes_arrow);

        stiCausesHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TransitionManager.beginDelayedTransition(stiCausesDetail);

                if(stiCausesDetail.getVisibility()==View.VISIBLE){
                    stiCausesArrow.setText(R.string.down_arrow);
                    setGone(stiCausesDetail);
                }else if(stiCausesDetail.getVisibility()==View.GONE) {
                    setVisible(stiCausesDetail);
                    stiCausesArrow.setText(R.string.up_arrow);

                }
            }
        });

        // STI Transmission
        stiTransmissionHeader = view.findViewById(R.id.sti_transmission_header);
        stiTransmissionDetail = view.findViewById(R.id.sti_transmission_details);
        stiTransmissionArrow = view.findViewById(R.id.sti_transmission_arrow);

        stiTransmissionHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(stiTransmissionDetail);

                if(stiTransmissionDetail.getVisibility()==View.VISIBLE){
                    stiTransmissionArrow.setText(R.string.down_arrow);
                    setGone(stiTransmissionDetail);
                }else if(stiTransmissionDetail.getVisibility()==View.GONE) {
                    setVisible(stiTransmissionDetail);
                    stiTransmissionArrow.setText(R.string.up_arrow);

                }
            }
        });

        // STI Syptoms
        stiSyptomsHeader = view.findViewById(R.id.sti_syptoms_header);
        stiSyptomsArrow = view.findViewById(R.id.sti_syptoms_arrow);
        stiSyptomsDetail = view.findViewById(R.id.sti_syptoms_details);

        stiSyptomsHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(stiSyptomsDetail);

                if(stiSyptomsDetail.getVisibility()==View.VISIBLE){
                    stiSyptomsArrow.setText(R.string.down_arrow);
                    setGone(stiSyptomsDetail);
                }else if(stiSyptomsDetail.getVisibility()==View.GONE) {
                    setVisible(stiSyptomsDetail);
                    stiSyptomsArrow.setText(R.string.up_arrow);

                }
            }
        });

        // STI Complications
        stiComplicationsHeader = view.findViewById(R.id.sti_complications_header);
        stiComplicationsArrow = view.findViewById(R.id.sti_complications_arrow);
        stiComplicationsDetail = view.findViewById(R.id.sti_complications_details);

        stiComplicationsHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(stiComplicationsDetail);

                if(stiComplicationsDetail.getVisibility()==View.VISIBLE){
                    stiComplicationsArrow.setText(R.string.down_arrow);
                    setGone(stiComplicationsDetail);
                }else if(stiComplicationsDetail.getVisibility()==View.GONE) {
                    setVisible(stiComplicationsDetail);
                    stiComplicationsArrow.setText(R.string.up_arrow);

                }
            }
        });

        // STI Prevention
        stiPreventionHeader = view.findViewById(R.id.sti_prevention_header);
        stiPreventionArrow = view.findViewById(R.id.sti_prevention_arrow);
        stiPreventionDetail = view.findViewById(R.id.sti_prevention_details);

        stiPreventionHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(stiPreventionDetail);

                if(stiPreventionDetail.getVisibility()==View.VISIBLE){
                    stiPreventionArrow.setText(R.string.down_arrow);
                    setGone(stiPreventionDetail);
                }else if(stiPreventionDetail.getVisibility()==View.GONE) {
                    setVisible(stiPreventionDetail);
                    stiPreventionArrow.setText(R.string.up_arrow);

                }
            }
        });

        // STI Treatment
        stiTreatmentHeader = view.findViewById(R.id.sti_treatment_header);
        stiTreatmentArrow = view.findViewById(R.id.sti_treatment_arrow);
        stiTreatmentDetail = view.findViewById(R.id.sti_treatment_details);

        stiTreatmentHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(stiTreatmentDetail);

                if(stiTreatmentDetail.getVisibility()==View.VISIBLE){
                    stiTreatmentArrow.setText(R.string.down_arrow);
                    setGone(stiTreatmentDetail);
                }else if(stiTreatmentDetail.getVisibility()==View.GONE) {
                    setVisible(stiTreatmentDetail);
                    stiTreatmentArrow.setText(R.string.up_arrow);

                }
            }
        });

        return view;
    }

    void setVisible(ConstraintLayout constraintLayout) {


        stiIntroDetail.setVisibility(View.GONE);
        stiIntroArrow.setText(R.string.down_arrow);
        stiCausesDetail.setVisibility(View.GONE);
        stiCausesArrow.setText(R.string.down_arrow);
        stiTransmissionDetail.setVisibility(View.GONE);
        stiTransmissionArrow.setText(R.string.down_arrow);
        stiSyptomsDetail.setVisibility(View.GONE);
        stiSyptomsArrow.setText(R.string.down_arrow);
        stiComplicationsDetail.setVisibility(View.GONE);
        stiComplicationsArrow.setText(R.string.down_arrow);
        stiPreventionDetail.setVisibility(View.GONE);
        stiPreventionArrow.setText(R.string.down_arrow);
        stiTreatmentDetail.setVisibility(View.GONE);
        stiTreatmentArrow.setText(R.string.down_arrow);

        constraintLayout.setVisibility(View.VISIBLE);

    }

    void setGone(ConstraintLayout constraintLayout) {
        constraintLayout.setVisibility(View.GONE);
    }
}
