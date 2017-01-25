package com.jamestic.softballstrategy.model;

/**
 * Created by BILLYJ on 10/7/2016.
 */

public class SitPage {
    //private int mSitNumber;
    private String mSituationText;
    private String mSubSituationText;
    private int mImageId;
    //private String mSitAnswer;
    private int mSitAnswerInt;
    private int mBackPage;
    private String[] mPosArray;


    public SitPage(String situationText, String subSituationText, int imageId, int sitAnswerInt, int backPage) {
        mSituationText = situationText;
        mSubSituationText = subSituationText;
        mImageId = imageId;
        //mSitAnswer = sitAnswer;
        mSitAnswerInt = sitAnswerInt;
        mBackPage = backPage;
    }

    /*
    public SitPage(String situationText, String subSituationText, int imageId, String[] posArray, int backPage) {
        mSituationText = situationText;
        mSubSituationText = subSituationText;
        mImageId = imageId;
        //mSitAnswer = sitAnswer;
        mPosArray = posArray;
        mBackPage = backPage;
    }
    */

    public String[] getPosArray() {
        return mPosArray;
    }

    public void setPosArray(String[] posArray) {
        mPosArray = posArray;
    }

    public String getSituationText() {
        return mSituationText;
    }

    public void setSituationText(String situationText) {
        mSituationText = situationText;
    }

    public String getSubSituationText() {
        return mSubSituationText;
    }

    public void setSubSituationText(String subSituationText) {
        mSubSituationText = subSituationText;
    }

    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int imageId) {
        mImageId = imageId;
    }

    /*public String getSitAnswer() {
        return mSitAnswer;
    }

    public void setSitAnswer(String sitAnswer) {
        mSitAnswer = sitAnswer;
    }
    */
    public int getBackPage() {
        return mBackPage;
    }

    public void setBackPage(int backPage) {
        mBackPage = backPage;
    }

    public int getSitAnswerInt() {
        return mSitAnswerInt;
    }

    public void setSitAnswerInt(int sitAnswerInt) {
        mSitAnswerInt = sitAnswerInt;
    }
}
