package com.jamestic.softballstrategy.model;

/**
 * Created by BILLYJ on 10/4/2016.
 */

public class Cat_SelectPage {
    private String mHeadText;
    private String mSubHeadText;
    private Choice mChoice1;
    private Choice mChoice2;
    private Choice mChoice3;
    private Choice mChoice4;
    private Choice mChoice5;
    private Boolean mIsFinal;


    public boolean isFinal() {
        return mIsFinal;
    }

    public Cat_SelectPage(String headText, String subHeadText, Choice choice1, Choice choice2, Choice choice3, Choice choice4, Choice choice5) {
        mHeadText = headText;
        mSubHeadText = subHeadText;
        mChoice1 = choice1;
        mChoice2 = choice2;
        mChoice3 = choice3;
        mChoice4 = choice4;
        mChoice5 = choice5;
    }

    public String getHeadText() {
        return mHeadText;
    }

    public void setHeadText(String headText) {
        mHeadText = headText;
    }

    public String getSubHeadText() {
        return mSubHeadText;
    }

    public void setSubHeadText(String subHeadText) {
        mSubHeadText = subHeadText;
    }

    public Choice getChoice1() {
        return mChoice1;
    }

    public void setChoice1(Choice choice1) {
        mChoice1 = choice1;
    }

    public Choice getChoice2() {
        return mChoice2;
    }

    public void setChoice2(Choice choice2) {
        mChoice2 = choice2;
    }

    public Choice getChoice3() {
        return mChoice3;
    }

    public void setChoice3(Choice choice3) {
        mChoice3 = choice3;
    }

    public Choice getChoice4() {
        return mChoice4;
    }

    public void setChoice4(Choice choice4) {
        mChoice4 = choice4;
    }

    public Choice getChoice5() {
        return mChoice5;
    }

    public void setChoice5(Choice choice5) {
        mChoice5 = choice5;
    }

    public Boolean getFinal() {
        return mIsFinal;
    }

    public void setFinal(Boolean aFinal) {
        mIsFinal = aFinal;
    }
}
