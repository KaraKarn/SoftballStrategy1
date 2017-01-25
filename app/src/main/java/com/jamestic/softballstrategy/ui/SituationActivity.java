package com.jamestic.softballstrategy.ui;

import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.jamestic.softballstrategy.R;
import com.jamestic.softballstrategy.model.SitPage;
import com.jamestic.softballstrategy.model.Situations;

import java.util.Arrays;

public class SituationActivity extends AppCompatActivity {

    private SitPage[] mSitPages;

    private Situations mSituations = new Situations();
    private int mSitNumber;
    private String mPositionName;
    private TextView mSituationTextView;
    private TextView mSubSituationTextView;
    private ImageView mImageView;
    private TextView mSitAnswerTextView;
    private SitPage mCurrentSitPage;
    private Button mSitBackButton;
    private int mBackNumber;

    private Typeface mSitTextFont;
    private Typeface mSubSitTextFont;
    private Typeface mSitAnswerFont;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_situation);

        Intent intent2 = getIntent();
        mSitNumber = (intent2.getIntExtra(getString(R.string.situationNumber), 10)) - 10;
        mPositionName = intent2.getStringExtra("PositionName");

        mSitTextFont = Typeface.createFromAsset(getAssets(), "fonts/playball_regular.ttf");
        mSubSitTextFont = Typeface.createFromAsset(getAssets(), "fonts/IMFeFCsc28P.ttf");
        mSitAnswerFont = Typeface.createFromAsset(getAssets(), "fonts/Gabriela_Regular.ttf");

        mSituationTextView = (TextView) findViewById(R.id.situationTitleText);
        mSubSituationTextView = (TextView) findViewById(R.id.subSituationTitleText);
        mImageView = (ImageView) findViewById(R.id.sitImageView);
        mSitAnswerTextView = (TextView) findViewById(R.id.sitAnswerTextView);
        mSitBackButton = (Button) findViewById(R.id.sitBackButton);

        mSituationTextView.setTypeface(mSitTextFont);
        mSubSituationTextView.setTypeface(mSubSitTextFont);
        mSitAnswerTextView.setTypeface(mSitAnswerFont);

        loadSituation(mSitNumber);
    }

    private void loadSituation(int sitNumber) {
        mCurrentSitPage = mSituations.getSitPage(sitNumber);

        Drawable drawable = getResources().getDrawable(mCurrentSitPage.getImageId());
        mImageView.setImageDrawable(drawable);

        String sitText = mCurrentSitPage.getSituationText();
        mSituationTextView.setText(sitText);

        String subSitText = mCurrentSitPage.getSubSituationText();
        mSubSituationTextView.setText(subSitText+": "+mPositionName);

        /*
        String sitAnswerText = mCurrentSitPage.getSitAnswer();
        if (sitAnswerText == ""){
            int sitAnswerInt = mCurrentSitPage.getSitAnswerInt();
            mSitAnswerTextView.setText(getText(sitAnswerInt));
        } else{
            mSitAnswerTextView.setText(sitAnswerText);
        }
        */

        //working int sitAnswer Way
        /*
        int sitAnswerInt = mCurrentSitPage.getSitAnswerInt();
        mSitAnswerTextView.setText(getText(sitAnswerInt));
        */

        //Start Try Working with Array
        int sitAnswerInt = mCurrentSitPage.getSitAnswerInt();
        if (sitAnswerInt ==0) {
            String[] mAnswerArray = getResources().getStringArray(R.array.cutoffNoRunLeftField);
            String tempArray = "\t \t \t" + mAnswerArray[0]+ "\n \n \t \t \t" + mAnswerArray[1]+ "\n \n \t \t \t" + mAnswerArray[2]+ "\n \n \t \t \t"
                    + mAnswerArray[3]+ "\n \n \t \t \t" + mAnswerArray[4]+ "\n \n \t \t \t" + mAnswerArray[5]+ "\n \n \t \t \t"
                    + mAnswerArray[6]+ "\n \n \t \t \t" + mAnswerArray[7]+ "\n \n \t \t \t" + mAnswerArray[8]+ "\n \n \t \t \t"
                    + mAnswerArray[9];
            mSitAnswerTextView.setText(tempArray);
        }
        else {
            mSitAnswerTextView.setText(getText(sitAnswerInt));
        }
        // End of Array Work

        mBackNumber = mCurrentSitPage.getBackPage();

        mSitBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backSituation(mBackNumber);
            }
        });
    }

    private void backSituation (int backPageNumber) {
        Intent intent3 = new Intent(this, CategorySelectActivity.class);
        intent3.putExtra(getString(R.string.backNumber), backPageNumber);
        intent3.putExtra("PositionName", mPositionName);
        startActivity(intent3);
    }
}
