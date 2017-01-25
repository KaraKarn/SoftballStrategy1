package com.jamestic.softballstrategy.model;

/**
 * Created by BILLYJ on 10/4/2016.
 */

public class Choice {
    private String mChoiceText;
    private int mNextCategory;

    public Choice(String choiceText, int nextCategory) {
        mChoiceText = choiceText;
        mNextCategory = nextCategory;
    }

    public String getChoiceText() {
        return mChoiceText;
    }

    public void setChoiceText(String choiceText) {
        mChoiceText = choiceText;
    }

    public int getNextCategory() {
        return mNextCategory;
    }

    public void setNextCategory(int nextCategory) {
        mNextCategory = nextCategory;
    }
}
