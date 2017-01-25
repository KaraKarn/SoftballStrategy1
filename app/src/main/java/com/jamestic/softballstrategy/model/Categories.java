package com.jamestic.softballstrategy.model;

/**
 * Created by BILLYJ on 10/4/2016.
 */

public class Categories {
    private Cat_SelectPage[] mPages;

    public Categories() {
        mPages = new Cat_SelectPage[11];

        mPages[0] = new Cat_SelectPage(
                "Begin Training",
                "Select Strategy Situation:",
                new Choice("Cut-Off Situation", 33),
                new Choice("Double Cut Situation", 2),
                new Choice("1st and 3rd Situation", 3),
                new Choice("Sacrifice Bunt Defense", 4),
                new Choice("", 0)
        );

        mPages[1] = new Cat_SelectPage(
                "Cut-Offs",
                "Runner Location:",
                new Choice("No Runners On", 5),
                new Choice("Runner on 1st", 6),
                new Choice("Runner on 2nd", 7),
                new Choice("Runner on 3rd", 8),
                new Choice("Back", 0)
        );

        // Goes straight to Situation Page
        mPages[2] = new Cat_SelectPage(
                "Double Cuts",
                "Runner Location:",
                new Choice("No Runners On", 0),
                new Choice("Runner on 1st", 0),
                new Choice("", 0),
                new Choice("", 0),
                new Choice("Back", 0)
        );

        mPages[3] = new Cat_SelectPage(
                "1st and 3rd Situation",
                "Throw Location:",
                new Choice("Throw Through to 2nd", 0),
                new Choice("Throw to 3rd", 0),
                new Choice("Throw to Shortstop", 0),
                new Choice("Walk-Off", 0),
                new Choice("Back", 0)
        );

        // Goes straight to Situation Page
        mPages[4] = new Cat_SelectPage(
                "Sacrifice Bunt",
                "Runner Location:",
                new Choice("Runner on 1st", 0),
                new Choice("Runner on 1st and 2nd", 0),
                new Choice("", 0),
                new Choice("", 0),
                new Choice("Back", 0)
        );

    // Cut Off Situations
        mPages[5] = new Cat_SelectPage(
                "Cut-Offs",
                "No Runners On:",
                new Choice("Single to Left Field", 11),
                new Choice("Single to Center Field", 12),
                new Choice("Single to Right Field", 13),
                new Choice("", 0),
                new Choice("Back", 1)
        );

        mPages[6] = new Cat_SelectPage(
                "Cut-Offs",
                "Runner On 1st:",
                new Choice("Single to Left Field", 14),
                new Choice("Single to Center Field", 15),
                new Choice("Single to Right Field", 16),
                new Choice("", 0),
                new Choice("Back", 1)
        );

        mPages[7] = new Cat_SelectPage(
                "Cut-Offs",
                "Runner On 2nd",
                new Choice("Single to Left Field", 17),
                new Choice("Single to Center Field", 18),
                new Choice("Single to Right Field", 19),
                new Choice("", 0),
                new Choice("Back", 1)
        );

        mPages[8] = new Cat_SelectPage(
                "Cut-Offs",
                "Runner On 3rd:",
                new Choice("Single to Left Field", 20),
                new Choice("Single to Center or Right Field", 21),
                new Choice("", 0),
                new Choice("", 0),
                new Choice("Back", 1)
        );

    // Double Cut Situations
        mPages[9] = new Cat_SelectPage(
                "Double Cut Situation",
                "No Runners On:",
                new Choice("Hit to Left-Center Field", 0),
                new Choice("Hit to Right-Center Field", 0),
                new Choice("", 0),
                new Choice("", 0),
                new Choice("Back", 1)
        );

        mPages[10] = new Cat_SelectPage(
                "Double Cut Situation",
                "Runner On 1st:",
                new Choice("Hit down Left Field Line", 0),
                new Choice("Hit to Left-Center Field", 0),
                new Choice("Hit to Right-Center Field", 0),
                new Choice("Hit down Right Field Line", 0),
                new Choice("Back", 1)
        );
    // 1st and 3rd Situations
        // Goes straight to situation page.

    // Sacrifice Bunt Situations
        // Goes straight to Situation Page
    }

    public Cat_SelectPage getPages(int pageNumber) {
        return mPages[pageNumber];
    }

}
