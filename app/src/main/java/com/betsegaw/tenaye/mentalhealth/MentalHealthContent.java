package com.betsegaw.tenaye.mentalhealth;

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

public class MentalHealthContent extends Fragment {

    // Mental health introduction
    TextView mhIntroHeader;
    TextView mhIntroArrow;
    ConstraintLayout mhIntroDetail;

    // Mental health issues stages
    TextView mhIssuesHeader;
    TextView mhIssuesArrow;
    ConstraintLayout mhIssuesDetail;

    // Mental health issues causes
    TextView mhCausesHeader;
    TextView mhCausesArrow;
    ConstraintLayout mhCausesDetail;

    // Mental health FAQs
    TextView mhFAQsHeader;
    TextView mhFAQsArrow;
    ConstraintLayout mhFAQsDetail;

    // Mental health diagnosis
    TextView mhDiagnosisHeader;
    TextView mhDiagnosisArrow;
    ConstraintLayout mhDiagnosisDetail;

    // Mental health diagnoses
    TextView mhDiagnoseWhoHeader;
    TextView mhDiagnoseWhoArrow;
    ConstraintLayout mhDiagnoseWhoDetail;

    // Mental health diagnose self-help
    TextView mhDiagnoseSelfhelpHeader;
    TextView mhDiagnoseSelfhelpArrow;
    ConstraintLayout mhDiagnoseSelfhelpDetail;

    // Mental health treatment
    TextView mhTreatmentHeader;
    TextView mhTreatmentArrow;
    ConstraintLayout mhTreatmentDetail;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.mentalhealth_content_tab, container, false);

        // Mental Health Introduction
        mhIntroHeader = view.findViewById(R.id.mh_intro_header);
        mhIntroDetail = view.findViewById(R.id.mh_intro_details);
        mhIntroArrow = view.findViewById(R.id.mh_intro_arrow);

        mhIntroHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TransitionManager.beginDelayedTransition(mhIntroDetail);

                if(mhIntroDetail.getVisibility()==View.VISIBLE){
                    mhIntroArrow.setText(R.string.down_arrow);
                    mhIntroDetail.setVisibility(View.GONE);
                }else if(mhIntroDetail.getVisibility()==View.GONE) {
                    mhIntroArrow.setText(R.string.up_arrow);
                    mhIntroDetail.setVisibility(View.VISIBLE);
                }
            }
        });

       // Mental health issues
        mhIssuesHeader = view.findViewById(R.id.mh_issues_header);
        mhIssuesDetail = view.findViewById(R.id.mh_issues_detail);
        mhIssuesArrow = view.findViewById(R.id.mh_issues_arrow);

        mhIssuesHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TransitionManager.beginDelayedTransition(mhIssuesDetail);

                if(mhIssuesDetail.getVisibility()==View.VISIBLE){
                    mhIssuesArrow.setText(R.string.down_arrow);
                    mhIssuesDetail.setVisibility(View.GONE);
                }else if(mhIssuesDetail.getVisibility()==View.GONE) {
                    mhIssuesArrow.setText(R.string.up_arrow);
                    mhIssuesDetail.setVisibility(View.VISIBLE);
                }
            }
        });

        // Mental health issues causes
        mhCausesHeader = view.findViewById(R.id.mh_causes_header);
        mhCausesDetail = view.findViewById(R.id.mh_causes_details);
        mhCausesArrow = view.findViewById(R.id.mh_causes_arrow);

        mhCausesHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(mhCausesDetail);

                if(mhCausesDetail.getVisibility()==View.VISIBLE){
                    mhCausesArrow.setText(R.string.down_arrow);
                    mhCausesDetail.setVisibility(View.GONE);
                }else if(mhCausesDetail.getVisibility()==View.GONE) {
                    mhCausesArrow.setText(R.string.up_arrow);
                    mhCausesDetail.setVisibility(View.VISIBLE);
                }
            }
        });

        // Mental health FAQs
        mhFAQsHeader = view.findViewById(R.id.mh_faqs_header);
        mhFAQsArrow = view.findViewById(R.id.mh_faqs_arrow);
        mhFAQsDetail = view.findViewById(R.id.mh_faqs_details);

        mhFAQsHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(mhFAQsDetail);

                if(mhFAQsDetail.getVisibility()==View.VISIBLE){
                    mhFAQsArrow.setText(R.string.down_arrow);
                    mhFAQsDetail.setVisibility(View.GONE);
                }else if(mhCausesDetail.getVisibility()==View.GONE) {
                    mhFAQsArrow.setText(R.string.up_arrow);
                    mhFAQsDetail.setVisibility(View.VISIBLE);
                }
            }
        });

        // Mental health diagnosis
        mhDiagnosisHeader = view.findViewById(R.id.mh_diagnoses_header);
        mhDiagnosisArrow = view.findViewById(R.id.mh_diagnoses_arrow);
        mhDiagnosisDetail = view.findViewById(R.id.mh_diagnoses_details);

        mhDiagnosisHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(mhDiagnosisDetail);

                if(mhDiagnosisDetail.getVisibility()==View.VISIBLE){
                    mhDiagnosisArrow.setText(R.string.down_arrow);
                    mhDiagnosisDetail.setVisibility(View.GONE);
                }else if(mhDiagnosisDetail.getVisibility()==View.GONE) {
                    mhDiagnosisArrow.setText(R.string.up_arrow);
                    mhDiagnosisDetail.setVisibility(View.VISIBLE);
                }
            }
        });

        // Hiv Transmission
        mhDiagnoseWhoHeader = view.findViewById(R.id.mh_diagnose_who_header);
        mhDiagnoseWhoArrow = view.findViewById(R.id.mh_diagnose_who_arrow);
        mhDiagnoseWhoDetail = view.findViewById(R.id.mh_diagnose_who_details);

        mhDiagnoseWhoHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(mhDiagnoseWhoDetail);

                if(mhDiagnoseWhoDetail.getVisibility()==View.VISIBLE){
                    mhDiagnoseWhoArrow.setText(R.string.down_arrow);
                    mhDiagnoseWhoDetail.setVisibility(View.GONE);
                }else if(mhDiagnoseWhoDetail.getVisibility()==View.GONE) {
                    mhDiagnoseWhoArrow.setText(R.string.up_arrow);
                    mhDiagnoseWhoDetail.setVisibility(View.VISIBLE);
                }
            }
        });

        // Mental health diagnose self-help
        mhDiagnoseSelfhelpHeader = view.findViewById(R.id.mh_diagnose_selfhelp_header);
        mhDiagnoseSelfhelpArrow = view.findViewById(R.id.mh_diagnose_selfhelp_arrow);
        mhDiagnoseSelfhelpDetail = view.findViewById(R.id.mh_diagnose_selfhelp_details);

        mhDiagnoseSelfhelpHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(mhDiagnoseSelfhelpDetail);

                if(mhDiagnoseSelfhelpDetail.getVisibility()==View.VISIBLE){
                    mhDiagnoseSelfhelpArrow.setText(R.string.down_arrow);
                    mhDiagnoseSelfhelpDetail.setVisibility(View.GONE);
                }else if(mhDiagnoseSelfhelpDetail.getVisibility()==View.GONE) {
                    mhDiagnoseSelfhelpArrow.setText(R.string.up_arrow);
                    mhDiagnoseSelfhelpDetail.setVisibility(View.VISIBLE);
                }
            }
        });

        // Mental health treatment
        mhTreatmentHeader = view.findViewById(R.id.mh_treatments_header);
        mhTreatmentArrow = view.findViewById(R.id.mh_treatments_arrow);
        mhTreatmentDetail = view.findViewById(R.id.mh_treatments_details);

        mhTreatmentHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(mhTreatmentDetail);

                if(mhTreatmentDetail.getVisibility()==View.VISIBLE){
                    mhTreatmentArrow.setText(R.string.down_arrow);
                    mhTreatmentDetail.setVisibility(View.GONE);
                }else if(mhTreatmentDetail.getVisibility()==View.GONE) {
                    mhTreatmentArrow.setText(R.string.up_arrow);
                    mhTreatmentDetail.setVisibility(View.VISIBLE);
                }
            }
        });

        return view;
    }
}
