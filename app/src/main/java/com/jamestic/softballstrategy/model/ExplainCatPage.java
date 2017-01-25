package com.jamestic.softballstrategy.model;

/**
 * Created by BILLYJ on 10/21/2016.
 */

public class ExplainCatPage {
    private String mHeadText;
    private int mExpText;
    private int mBackPage;
    private int mStartPage;


    public ExplainCatPage(String headText, int expText, int backPage, int startPage) {
        mHeadText = headText;
        mExpText = expText;
        mBackPage = backPage;
        mStartPage = startPage;
    }

    public String getHeadText() {
        return mHeadText;
    }

    public void setHeadText(String headText) {
        mHeadText = headText;
    }

    public int getExpText() {
        return mExpText;
    }

    public void setExpText(int expText) { mExpText = expText; }

    public int getBackPage() {
        return mBackPage;
    }

    public void setBackPage(int backPage) {
        mBackPage = backPage;
    }

    public int getStartPage() {
        return mStartPage;
    }

    public void setStartPage(int startPage) {
        mStartPage = startPage;
    }
}
