package com.betsegaw.tenaye.upregnancy;

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

public class UnintendedPregnancyContent extends Fragment {

    // Unintended pregnancy introduction
    TextView upregnancyIntroHeader;
    TextView upregnancyIntroArrow;
    ConstraintLayout upregnancyIntroDetail;

    // Causes of Unintended pregnancy
    TextView upregnancyCausesHeader;
    TextView upregnancyCausesArrow;
    ConstraintLayout upregnancyCausesDetail;

    // Consequences of Unintended pregnancy
    TextView upregnancyConsequencesHeader;
    TextView upregnancyConsequencesArrow;
    ConstraintLayout upregnancyConsequencesDetail;

    // Unsafe abortion
    TextView unsafeAbortionHeader;
    TextView unsafeAbortionArrow;
    ConstraintLayout unsafeAbortionDetail;

    // Unsafe methods of abortion
    TextView unsafeAbortionMethodHeader;
    TextView unsafeAbortionMethodArrow;
    ConstraintLayout unsafeAbortionMethodDetail;

    // Safe methods of abortion
    TextView safeAbortionMethodHeader;
    TextView safeAbortionMethodArrow;
    ConstraintLayout safeAbortionMethodDetail;

    // Issues of Unsafe abortion
    TextView unsafeAbortionIssuesHeader;
    TextView unsafeAbortionIssuesArrow;
    ConstraintLayout unsafeAbortionIssuesDetail;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.upregnancy_content_tab, container, false);

        upregnancyIntroHeader = view.findViewById(R.id.upregnancy_intro_header);
        upregnancyIntroDetail = view.findViewById(R.id.upregnancy_intro_details);
        upregnancyIntroArrow = view.findViewById(R.id.upregnancy_intro_arrow);

        upregnancyIntroHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TransitionManager.beginDelayedTransition(upregnancyIntroDetail);

                if(upregnancyIntroDetail.getVisibility()==View.VISIBLE){
                    upregnancyIntroArrow.setText(R.string.down_arrow);
                    upregnancyIntroDetail.setVisibility(View.GONE);
                }else if(upregnancyIntroDetail.getVisibility()==View.GONE) {
                    upregnancyIntroArrow.setText(R.string.up_arrow);
                    upregnancyIntroDetail.setVisibility(View.VISIBLE);
                }
            }
        });


        upregnancyCausesHeader = view.findViewById(R.id.upregnancy_causes_header);
        upregnancyCausesDetail = view.findViewById(R.id.upregnancy_causes_details);
        upregnancyCausesArrow = view.findViewById(R.id.upregnancy_causes_arrow);

        upregnancyCausesHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TransitionManager.beginDelayedTransition(upregnancyCausesDetail);

                if(upregnancyCausesDetail.getVisibility()==View.VISIBLE){
                    upregnancyCausesArrow.setText(R.string.down_arrow);
                    upregnancyCausesDetail.setVisibility(View.GONE);
                }else if(upregnancyCausesDetail.getVisibility()==View.GONE) {
                    upregnancyCausesArrow.setText(R.string.up_arrow);
                    upregnancyCausesDetail.setVisibility(View.VISIBLE);
                }
            }
        });

        upregnancyConsequencesHeader = view.findViewById(R.id.upregnancy_consequences_header);
        upregnancyConsequencesDetail = view.findViewById(R.id.upregnancy_consequences_details);
        upregnancyConsequencesArrow = view.findViewById(R.id.upregnancy_consequences_arrow);

        upregnancyConsequencesHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(upregnancyConsequencesDetail);

                if(upregnancyConsequencesDetail.getVisibility()==View.VISIBLE){
                    upregnancyConsequencesArrow.setText(R.string.down_arrow);
                    upregnancyConsequencesDetail.setVisibility(View.GONE);
                }else if(upregnancyConsequencesDetail.getVisibility()==View.GONE) {
                    upregnancyConsequencesArrow.setText(R.string.up_arrow);
                    upregnancyConsequencesDetail.setVisibility(View.VISIBLE);
                }
            }
        });

        unsafeAbortionHeader = view.findViewById(R.id.unsafe_abortion_header);
        unsafeAbortionArrow = view.findViewById(R.id.unsafe_abortion_arrow);
        unsafeAbortionDetail = view.findViewById(R.id.unsafe_abortion_details);

        unsafeAbortionHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(unsafeAbortionDetail);

                if(unsafeAbortionDetail.getVisibility()==View.VISIBLE){
                    unsafeAbortionArrow.setText(R.string.down_arrow);
                    unsafeAbortionDetail.setVisibility(View.GONE);
                }else if(upregnancyConsequencesDetail.getVisibility()==View.GONE) {
                    unsafeAbortionArrow.setText(R.string.up_arrow);
                    unsafeAbortionDetail.setVisibility(View.VISIBLE);
                }
            }
        });

        unsafeAbortionMethodHeader = view.findViewById(R.id.unsafe_abortion_methods_header);
        unsafeAbortionMethodArrow = view.findViewById(R.id.unsafe_abortion_methods_arrow);
        unsafeAbortionMethodDetail = view.findViewById(R.id.unsafe_abortion_methods_details);

        unsafeAbortionMethodHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(unsafeAbortionMethodDetail);

                if(unsafeAbortionMethodDetail.getVisibility()==View.VISIBLE){
                    unsafeAbortionMethodArrow.setText(R.string.down_arrow);
                    unsafeAbortionMethodDetail.setVisibility(View.GONE);
                }else if(unsafeAbortionMethodDetail.getVisibility()==View.GONE) {
                    unsafeAbortionMethodArrow.setText(R.string.up_arrow);
                    unsafeAbortionMethodDetail.setVisibility(View.VISIBLE);
                }
            }
        });

        safeAbortionMethodHeader = view.findViewById(R.id.safe_method_abortion_header);
        safeAbortionMethodArrow = view.findViewById(R.id.safe_method_abortion_arrow);
        safeAbortionMethodDetail = view.findViewById(R.id.safe_method_abortion_details);

        safeAbortionMethodHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(safeAbortionMethodDetail);

                if(safeAbortionMethodDetail.getVisibility()==View.VISIBLE){
                    safeAbortionMethodArrow.setText(R.string.down_arrow);
                    safeAbortionMethodDetail.setVisibility(View.GONE);
                }else if(safeAbortionMethodDetail.getVisibility()==View.GONE) {
                    safeAbortionMethodArrow.setText(R.string.up_arrow);
                    safeAbortionMethodDetail.setVisibility(View.VISIBLE);
                }
            }
        });

        unsafeAbortionIssuesHeader = view.findViewById(R.id.unsafe_abortion_issues_header);
        unsafeAbortionIssuesArrow = view.findViewById(R.id.unsafe_abortion_issues_arrow);
        unsafeAbortionIssuesDetail = view.findViewById(R.id.unsafe_abortion_issues_details);

        unsafeAbortionIssuesHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(unsafeAbortionIssuesDetail);

                if(unsafeAbortionIssuesDetail.getVisibility()==View.VISIBLE){
                    unsafeAbortionIssuesArrow.setText(R.string.down_arrow);
                    unsafeAbortionIssuesDetail.setVisibility(View.GONE);
                }else if(unsafeAbortionIssuesDetail.getVisibility()==View.GONE) {
                    unsafeAbortionIssuesArrow.setText(R.string.up_arrow);
                    unsafeAbortionIssuesDetail.setVisibility(View.VISIBLE);
                }
            }
        });

        return view;
    }
}
