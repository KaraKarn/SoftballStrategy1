package com.jamestic.softballstrategy.model;

import com.jamestic.softballstrategy.R;

/**
 * Created by BILLYJ on 10/21/2016.
 */

public class Explanations {
    private ExplainCatPage[] mExplainCatPages;

    public Explanations() {
        mExplainCatPages = new ExplainCatPage[2];

        mExplainCatPages[0] = new ExplainCatPage(
                "Cut-Offs",                 // Head Text
                R.string.whatAreCutOffs,    // Explanation
                0,  // Back Page
                1   // Start Page
        );

        mExplainCatPages[1] = new ExplainCatPage(
                "Doublt Cuts:",
                R.string.doubleCutRun1Info,
                0,
                1
        );

    }

    public ExplainCatPage getExpPages(int pageNumber) {
        return mExplainCatPages[pageNumber];
    }

}
