package com.jamestic.softballstrategy.model;

import com.jamestic.softballstrategy.R;

/**
 * Created by BILLYJ on 10/7/2016.
 */

public class Situations {
    private SitPage[] mSitPages;

    public Situations() {
        mSitPages = new SitPage[13];

        mSitPages[0] = new SitPage(
                "Error",
                "Yes, Error",
                R.drawable.cutoff_norunner_left,
                R.array.cutoffNoRunLeftField,
                0
        );

        mSitPages[1] = new SitPage(
                "Cut-Off: No Runners On:",
                "Single to Left Field",
                R.drawable.cutoff_norunner_left,
                0,
                5
        );

        mSitPages[2] = new SitPage(
                "Cut-Off: No Runners On:",
                "Single to Center Field",
                R.drawable.cutoff_norunner_center,
                R.string.cutOffNoRunSingCenter,
                5
        );

        mSitPages[3] = new SitPage(
                "Cut-Off: No Runners On:",
                "Single to Right Field",
                R.drawable.cutoff_norunner_right,
                R.string.cutOffNoRunSingRight,
                5
        );

        mSitPages[4] = new SitPage(
                "Cut-Off: Runner On 1st:",
                "Single to Left Field",
                R.drawable.cutoff_runner1_left,
                R.string.cutOffRun1SingLeft,
                6
        );

        mSitPages[5] = new SitPage(
                "Cut-Off: Runner On 1st:",
                "Single to Center Field",
                R.drawable.cutoff_runner1_center,
                R.string.cutOffRun1SingCenter,
                6
        );

        mSitPages[6] = new SitPage(
                "Cut-Off: Runner On 1st:",
                "Single to Right Field",
                R.drawable.cutoff_runner1_right,
                R.string.cutOffRun1SingRight,
                6
        );

        mSitPages[7] = new SitPage(
                "Cut-Off: Runner On 2nd:",
                "Single to Left Field",
                R.drawable.cutoff_runner2_3_left,
                R.string.cutOffRun2SingLeft,
                7
        );

        mSitPages[8] = new SitPage(
                "Cut-Off: Runner On 2nd:",
                "Single to Center Field",
                R.drawable.cutoff_runner2_3_rightcenter,
                R.string.cutOffRun2SingCenter,
                7
        );

        mSitPages[9] = new SitPage(
                "Cut-Off: Runner On 2nd:",
                "Single to Right Field",
                R.drawable.cutoff_runner2_3_rightcenter,
                R.string.cutOffRun2SingRight,
                7
        );

        mSitPages[10] = new SitPage(
                "Cut-Off: Runner On 3rd:",
                "Single to Left Field",
                R.drawable.cutoff_runner2_3_left,
                R.string.cutOffRun3SingLeft,
                8
        );

        mSitPages[11] = new SitPage(
                "Cut-Off: Runner On 3rd:",
                "Single to Center or Right Field",
                R.drawable.cutoff_runner2_3_rightcenter,
                R.string.cutOffRun3SingCenter,
                8
        );

        mSitPages[12] = new SitPage(
                "Cut-Off: Runner On 3rd:",
                "Single to Center or Right Field",
                R.drawable.cutoff_runner2_3_rightcenter,
                R.string.cutOffRun3SingRight,
                8
        );

    }

    public SitPage getSitPage(int sitPageNumber) {
        return mSitPages[sitPageNumber];
    }

}
