package com.jamestic.softballstrategy.model;

import android.content.Context;

import com.jamestic.softballstrategy.R;

/**
 * Created by BILLYJ on 12/14/2016.
 */

public class positionSitAnswer {
    private int mArrayNumber;
    private String mPositionSel;
    private String mSitAnswer;
    private String[] mAnswerArray;

    //use intents to get position, but for now
    public String positionSitAnswer(int arrayNumber, String positionSel, String sitAnswer, String[] answerArray) {
        mArrayNumber = arrayNumber;
        mPositionSel = positionSel;
        mSitAnswer = sitAnswer;
        mAnswerArray =answerArray;

        // 10 position answers.
        if (mArrayNumber == 0) {
            if (mPositionSel == "All") {
                mSitAnswer = mAnswerArray[0] + mAnswerArray[1] + mAnswerArray[2]
                        + mAnswerArray[3] + mAnswerArray[4] + mAnswerArray[5]
                        + mAnswerArray[6] + mAnswerArray[7] + mAnswerArray[8]
                        + mAnswerArray[9];
            }
            else if (mPositionSel == "Pitcher") {
                mSitAnswer = mAnswerArray[0] + mAnswerArray[1]
                        + mAnswerArray[4] + mAnswerArray[5]
                        + mAnswerArray[6] + mAnswerArray[7];
            }
            else if (mPositionSel == "Catcher") {
                mSitAnswer = mAnswerArray[0] + mAnswerArray[2]
                        + mAnswerArray[3]+ mAnswerArray[4] + mAnswerArray[5]
                        + mAnswerArray[6] + mAnswerArray[7];
            }
            else if (mPositionSel == "1st Base") {
                mSitAnswer = mAnswerArray[0] + mAnswerArray[3]
                        + mAnswerArray[4] + mAnswerArray[5]
                        + mAnswerArray[7];
            }
            else if (mPositionSel == "2nd Base") {
                mSitAnswer = mAnswerArray[0] + mAnswerArray[4]
                        + mAnswerArray[3] + mAnswerArray[5]
                        + mAnswerArray[6] + mAnswerArray[7];
            }


        }


        return mSitAnswer;
    }

}
