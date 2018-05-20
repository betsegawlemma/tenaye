package com.betsegaw.tenaye.contraceptive;

import android.support.constraint.ConstraintLayout;
import android.support.transition.TransitionManager;
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

public class ContraceptiveContent extends Fragment {

    // Contraceptive introduction
    TextView contraIntroHeader;
    TextView contraIntroArrow;
    ConstraintLayout contraIntroDetail;

    // Contraceptive COC
    TextView contraCocsHeader;
    TextView contraCocsArrow;
    ConstraintLayout contraCocsDetail;

    // Contraceptive POP
    TextView contraPopsHeader;
    TextView contraPopsArrow;
    ConstraintLayout contraPopsDetail;

    // Contraceptive ECP
    TextView contraEcpsHeader;
    TextView contraEcpsArrow;
    ConstraintLayout contraEcpsDetail;

    // Contraceptive POI
    TextView contraPoiHeader;
    TextView contraPoiArrow;
    ConstraintLayout contraPoiDetail;

    // Contraceptive Implant
    TextView contraImplantsHeader;
    TextView contraImplantsArrow;
    ConstraintLayout contraImplantsDetail;

    // Contraceptive IUD
    TextView contraIudHeader;
    TextView contraIudArrow;
    ConstraintLayout contraIudDetail;

    // Contraceptive MC
    TextView contraMcsHeader;
    TextView contraMcsArrow;
    ConstraintLayout contraMcsDetail;

    // Contraceptive FC
    TextView contraFcsHeader;
    TextView contraFcsArrow;
    ConstraintLayout contraFcsDetail;

    // Contraceptive MS
    TextView contraMsHeader;
    TextView contraMsArrow;
    ConstraintLayout contraMsDetail;

    // Contraceptive FS
    TextView contraFsHeader;
    TextView contraFsArrow;
    ConstraintLayout contraFsDetail;

    // Contraception male condom
    TextView contraMaleCondomHeader;
    TextView contraMaleCondomArrow;
    ConstraintLayout contraMaleCondomDetails;

    // Contraception female condom
    TextView contraFemaleCondomHeader;
    TextView contraFemaleCondomArrow;
    ConstraintLayout contraFemaleCondomDetails;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.contraceptive_content_tab, container, false);

        // Contraceptive Introduction
        contraIntroHeader = view.findViewById(R.id.contra_intro_header);
        contraIntroDetail = view.findViewById(R.id.contra_intro_details);
        contraIntroArrow = view.findViewById(R.id.contra_intro_arrow);

        contraIntroHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TransitionManager.beginDelayedTransition(contraIntroDetail);

                if (contraIntroDetail.getVisibility() == View.VISIBLE) {
                    contraIntroArrow.setText(R.string.down_arrow);
                    setGone(contraIntroDetail);
                } else if (contraIntroDetail.getVisibility() == View.GONE) {
                    setVisible(contraIntroDetail);
                    contraIntroArrow.setText(R.string.up_arrow);

                }
            }
        });

        // Contraceptive COC

        contraCocsHeader = view.findViewById(R.id.contra_cocs_header);
        contraCocsArrow = view.findViewById(R.id.contra_cocs_arrow);
        contraCocsDetail = view.findViewById(R.id.contra_cocs_detail);

        contraCocsHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(contraCocsDetail);
                if (contraCocsDetail.getVisibility() == View.VISIBLE) {
                    contraCocsArrow.setText(R.string.down_arrow);
                    setGone(contraCocsDetail);
                } else if (contraCocsDetail.getVisibility() == View.GONE) {
                    setVisible(contraCocsDetail);
                    contraCocsArrow.setText(R.string.up_arrow);

                }
            }
        });

        // Contraceptive POP

        contraPopsHeader = view.findViewById(R.id.contra_pops_header);
        contraPopsArrow = view.findViewById(R.id.contra_pops_arrow);
        contraPopsDetail = view.findViewById(R.id.contra_pops_detail);

        contraPopsHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(contraPopsDetail);
                if (contraPopsDetail.getVisibility() == View.VISIBLE) {
                    contraPopsArrow.setText(R.string.down_arrow);
                    setGone(contraPopsDetail);
                } else if (contraPopsDetail.getVisibility() == View.GONE) {
                    setVisible(contraPopsDetail);
                    contraPopsArrow.setText(R.string.up_arrow);

                }
            }
        });

        // Contraceptive ECP
        contraEcpsHeader = view.findViewById(R.id.contra_ecps_header);
        contraEcpsArrow = view.findViewById(R.id.contra_ecps_arrow);
        contraEcpsDetail = view.findViewById(R.id.contra_ecps_detail);

        contraEcpsHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(contraEcpsDetail);
                if (contraEcpsDetail.getVisibility() == View.VISIBLE) {
                    contraEcpsArrow.setText(R.string.down_arrow);
                    setGone(contraEcpsDetail);
                } else if (contraEcpsDetail.getVisibility() == View.GONE) {
                    setVisible(contraEcpsDetail);
                    contraEcpsArrow.setText(R.string.up_arrow);

                }
            }
        });

        // Contraceptive POI
        contraPoiHeader = view.findViewById(R.id.contra_pois_header);
        contraPoiArrow = view.findViewById(R.id.contra_pois_arrow);
        contraPoiDetail = view.findViewById(R.id.contra_pois_detail);

        contraPoiHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(contraPoiDetail);
                if (contraPoiDetail.getVisibility() == View.VISIBLE) {
                    contraPoiArrow.setText(R.string.down_arrow);
                    setGone(contraPoiDetail);
                } else if (contraPoiDetail.getVisibility() == View.GONE) {
                    setVisible(contraPoiDetail);
                    contraPoiArrow.setText(R.string.up_arrow);

                }
            }
        });

        // Contraceptive Implant
        contraImplantsHeader = view.findViewById(R.id.contra_implants_header);
        contraImplantsArrow = view.findViewById(R.id.contra_implants_arrow);
        contraImplantsDetail = view.findViewById(R.id.contra_implants_detail);

        contraImplantsHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(contraImplantsDetail);
                if (contraImplantsDetail.getVisibility() == View.VISIBLE) {
                    contraImplantsArrow.setText(R.string.down_arrow);
                    setGone(contraImplantsDetail);
                } else if (contraImplantsDetail.getVisibility() == View.GONE) {
                    setVisible(contraImplantsDetail);
                    contraImplantsArrow.setText(R.string.up_arrow);

                }
            }
        });


        // Contraceptive IUD
        contraIudHeader = view.findViewById(R.id.contra_iud_header);
        contraIudArrow = view.findViewById(R.id.contra_iud_arrow);
        contraIudDetail = view.findViewById(R.id.contra_iud_detail);

        contraIudHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(contraIudDetail);
                if (contraIudDetail.getVisibility() == View.VISIBLE) {
                    contraIudArrow.setText(R.string.down_arrow);
                    setGone(contraIudDetail);
                } else if (contraIudDetail.getVisibility() == View.GONE) {
                    setVisible(contraIudDetail);
                    contraIudArrow.setText(R.string.up_arrow);

                }

            }
        });

        // Contraceptive MCS
        contraMcsHeader = view.findViewById(R.id.contra_mcs_header);
        contraMcsArrow = view.findViewById(R.id.contra_mcs_arrow);
        contraMcsDetail = view.findViewById(R.id.contra_mcs_detail);

        contraMcsHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(contraMcsDetail);
                if (contraMcsDetail.getVisibility() == View.VISIBLE) {
                    contraMcsArrow.setText(R.string.down_arrow);
                    setGone(contraMcsDetail);
                } else if (contraMcsDetail.getVisibility() == View.GONE) {
                    setVisible(contraMcsDetail);
                    contraMcsArrow.setText(R.string.up_arrow);

                }
            }
        });

        // Contraceptive FCS
        contraFcsHeader = view.findViewById(R.id.contra_fcs_header);
        contraFcsArrow = view.findViewById(R.id.contra_fcs_arrow);
        contraFcsDetail = view.findViewById(R.id.contra_fcs_detail);

        contraFcsHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(contraFcsDetail);
                if (contraFcsDetail.getVisibility() == View.VISIBLE) {
                    contraFcsArrow.setText(R.string.down_arrow);
                    setGone(contraFcsDetail);
                } else if (contraFcsDetail.getVisibility() == View.GONE) {
                    setVisible(contraFcsDetail);
                    contraFcsArrow.setText(R.string.up_arrow);
                }
            }
        });

        // Contraceptive MS
        contraMsHeader = view.findViewById(R.id.contra_ms_header);
        contraMsArrow = view.findViewById(R.id.contra_ms_arrow);
        contraMsDetail = view.findViewById(R.id.contra_ms_detail);

        contraMsHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(contraMsDetail);
                if (contraMsDetail.getVisibility() == View.VISIBLE) {
                    contraMsArrow.setText(R.string.down_arrow);
                    setGone(contraMsDetail);
                } else if (contraMsDetail.getVisibility() == View.GONE) {
                    setVisible(contraMsDetail);
                    contraMsArrow.setText(R.string.up_arrow);
                }
            }
        });

        // Contraceptive FS
        contraFsHeader = view.findViewById(R.id.contra_fs_header);
        contraFsArrow = view.findViewById(R.id.contra_fs_arrow);
        contraFsDetail = view.findViewById(R.id.contra_fs_detail);

        contraFsHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(contraFsDetail);
                if (contraFsDetail.getVisibility() == View.VISIBLE) {
                    setGone(contraFsDetail);
                    contraFsArrow.setText(R.string.down_arrow);
                } else if (contraFsDetail.getVisibility() == View.GONE) {
                    setVisible(contraFsDetail);
                    contraFsArrow.setText(R.string.up_arrow);
                }
            }
        });

        // ContraceptionHivAndSTIs Male Condom
        contraMaleCondomHeader = view.findViewById(R.id.contra_male_condom_header);
        contraMaleCondomArrow = view.findViewById(R.id.contra_male_condom_arrow);
        contraMaleCondomDetails = view.findViewById(R.id.contra_male_condom_details);

        contraMaleCondomHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(contraMaleCondomDetails);

                if(contraMaleCondomDetails.getVisibility()==View.VISIBLE){
                    contraMaleCondomArrow.setText(R.string.down_arrow);
                    setGone(contraMaleCondomDetails);
                }else if(contraMaleCondomDetails.getVisibility()==View.GONE) {
                    setVisible(contraMaleCondomDetails);
                    contraMaleCondomArrow.setText(R.string.up_arrow);

                }
            }
        });

        // Contraception Female Condom
        contraFemaleCondomHeader = view.findViewById(R.id.contra_female_condom_header);
        contraFemaleCondomArrow = view.findViewById(R.id.contra_female_condom_arrow);
        contraFemaleCondomDetails = view.findViewById(R.id.contra_female_condom_details);

        contraFemaleCondomHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(contraFemaleCondomDetails);

                if(contraFemaleCondomDetails.getVisibility()==View.VISIBLE){
                    contraFemaleCondomArrow.setText(R.string.down_arrow);
                    setGone(contraFemaleCondomDetails);
                }else if(contraFemaleCondomDetails.getVisibility()==View.GONE) {
                    setVisible(contraFemaleCondomDetails);
                    contraFemaleCondomArrow.setText(R.string.up_arrow);

                }
            }
        });

        return view;


    }

    void setVisible(ConstraintLayout constraintLayout) {

        contraIntroDetail.setVisibility(View.GONE);
        contraIntroArrow.setText(R.string.down_arrow);
        contraCocsDetail.setVisibility(View.GONE);
        contraCocsArrow.setText(R.string.down_arrow);
        contraPopsDetail.setVisibility(View.GONE);
        contraPopsArrow.setText(R.string.down_arrow);
        contraEcpsDetail.setVisibility(View.GONE);
        contraEcpsArrow.setText(R.string.down_arrow);
        contraPoiDetail.setVisibility(View.GONE);
        contraPoiArrow.setText(R.string.down_arrow);
        contraImplantsDetail.setVisibility(View.GONE);
        contraImplantsArrow.setText(R.string.down_arrow);
        contraIudDetail.setVisibility(View.GONE);
        contraIudArrow.setText(R.string.down_arrow);
        contraMcsDetail.setVisibility(View.GONE);
        contraMcsArrow.setText(R.string.down_arrow);
        contraFcsDetail.setVisibility(View.GONE);
        contraFcsArrow.setText(R.string.down_arrow);
        contraMsDetail.setVisibility(View.GONE);
        contraMsArrow.setText(R.string.down_arrow);
        contraFsDetail.setVisibility(View.GONE);
        contraFsArrow.setText(R.string.down_arrow);
        contraMaleCondomDetails.setVisibility(View.GONE);
        contraMaleCondomArrow.setText(R.string.down_arrow);

        constraintLayout.setVisibility(View.VISIBLE);

    }

    void setGone(ConstraintLayout constraintLayout) {
        constraintLayout.setVisibility(View.GONE);
    }
}
