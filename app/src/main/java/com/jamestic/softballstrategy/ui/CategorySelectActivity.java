package com.jamestic.softballstrategy.ui;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.jamestic.softballstrategy.R;
import com.jamestic.softballstrategy.model.Categories;
import com.jamestic.softballstrategy.model.Cat_SelectPage;

public class CategorySelectActivity extends AppCompatActivity {

    private Categories mCategory = new Categories();
    private Button mChoice1;
    private Button mChoice2;
    private Button mChoice3;
    private Button mChoice4;
    private Button mChoice5;
    private TextView mHeadTextView;
    private TextView mHeadSubTextView;
    private Cat_SelectPage mCurrentPage;
    private int mPageNumber;
    private String mPositionName;
    private Typeface myCustomFont1;
    private Typeface myCustomFont2;
    private Typeface myCustomFont3;
    private Typeface myCustomFont4;
    private Typeface myCustomFont5;
    private Typeface myCustomFont6;
    private Typeface myCustomFont7;
    private Typeface myCustomFont8;
    private Typeface myCustomFont9;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_select);

        Intent intent = getIntent();
        mPageNumber = intent.getIntExtra(getString(R.string.backNumber), 0);
        mPositionName = intent.getStringExtra("PositionName");

        myCustomFont1 = Typeface.createFromAsset(getAssets(), "fonts/playball_regular.ttf");
        myCustomFont2 = Typeface.createFromAsset(getAssets(), "fonts/LoveYaLikeASister.ttf");
        myCustomFont3 = Typeface.createFromAsset(getAssets(), "fonts/Merienda_Regular.ttf");
        myCustomFont4 = Typeface.createFromAsset(getAssets(), "fonts/IMFeFCsc28P.ttf");
        myCustomFont5 = Typeface.createFromAsset(getAssets(), "fonts/Gabriela_Regular.ttf");
        myCustomFont6 = Typeface.createFromAsset(getAssets(), "fonts/JustAnotherHand.ttf");
        myCustomFont7 = Typeface.createFromAsset(getAssets(), "fonts/Delius_Regular.ttf");

        mHeadTextView = (TextView) findViewById(R.id.selectCategoryView);
        mHeadTextView.setTypeface(myCustomFont1);
        mHeadSubTextView = (TextView) findViewById(R.id.selectSubCategoryView);
        mHeadSubTextView.setTypeface(myCustomFont4);

        mChoice1 = (Button) findViewById(R.id.choice1Button);
        mChoice2 = (Button) findViewById(R.id.choice2Button);
        mChoice3 = (Button) findViewById(R.id.choice3Button);
        mChoice4 = (Button) findViewById(R.id.choice4Button);
        mChoice5 = (Button) findViewById(R.id.choiceBackButton);

        mChoice1.setTypeface(myCustomFont3);
        mChoice2.setTypeface(myCustomFont3);
        mChoice3.setTypeface(myCustomFont3);
        mChoice4.setTypeface(myCustomFont3);
        mChoice5.setTypeface(myCustomFont4);

        loadSelectPage(mPageNumber);
    }


    private void loadSelectPage(int choice) {
        mCurrentPage = mCategory.getPages(choice);

        String headText = mCurrentPage.getHeadText();
        if (headText == "Begin Training") {
            mHeadTextView.setText(headText);
        }
        else {
            mHeadTextView.setText(headText + ": "+mPositionName);
        }

        String subHeadText = mCurrentPage.getSubHeadText();
        mHeadSubTextView.setText(subHeadText);

        if (headText == "") {
            mHeadTextView.setVisibility(View.GONE);
        } else {
            mHeadTextView.setVisibility(View.VISIBLE);
        }

        //put if is final here eventually

        mChoice1.setText(mCurrentPage.getChoice1().getChoiceText());
        mChoice2.setText(mCurrentPage.getChoice2().getChoiceText());
        mChoice3.setText(mCurrentPage.getChoice3().getChoiceText());
        mChoice4.setText(mCurrentPage.getChoice4().getChoiceText());
        mChoice5.setText(mCurrentPage.getChoice5().getChoiceText());

    // Button Visibility if Statements
        //Choice 3
        if ((mCurrentPage.getChoice3().getChoiceText()) == "") {
            mChoice3.setVisibility(View.INVISIBLE);
        }
        else {
            mChoice3.setVisibility(View.VISIBLE);
        }
        //Choice 4
        if ((mCurrentPage.getChoice4().getChoiceText()) == "") {
            mChoice4.setVisibility(View.INVISIBLE);
        }
        else {
            mChoice4.setVisibility(View.VISIBLE);
        }
        //Choice 5
        if ((mCurrentPage.getChoice5().getChoiceText()) == "") {
            mChoice5.setVisibility(View.INVISIBLE);
        }
        else {
            mChoice5.setVisibility(View.VISIBLE);
        }

    // Button On Click Listeners
        mChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nextCategory = mCurrentPage.getChoice1().getNextCategory();

                if (nextCategory == 33) {
                    startExplanation(0);
                }
                else if (nextCategory >= 10) {
                    startTraining(nextCategory);
                }
                else {
                    loadSelectPage(nextCategory);
                }
            }
        });

        mChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nextCategory = mCurrentPage.getChoice2().getNextCategory();
                if (nextCategory >= 11) {
                    startTraining(nextCategory);
                }
                else {
                    loadSelectPage(nextCategory);
                }
            }
        });

        mChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nextCategory = mCurrentPage.getChoice3().getNextCategory();
                if (nextCategory >= 11) {
                    startTraining(nextCategory);
                }
                else {
                    loadSelectPage(nextCategory);
                }
            }
        });

        mChoice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nextCategory = mCurrentPage.getChoice4().getNextCategory();
                if (nextCategory >= 11) {
                    startTraining(nextCategory);
                }
                else {
                    loadSelectPage(nextCategory);
                }
            }
        });

        mChoice5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nextCategory = mCurrentPage.getChoice5().getNextCategory();
                if (nextCategory >= 11) {
                    startTraining(nextCategory);
                }
                else {
                    loadSelectPage(nextCategory);
                }
            }
        });

    }

    private void startTraining(int sitNumber) {
        Intent intent2 = new Intent(this, SituationActivity.class);
        intent2.putExtra(getString(R.string.situationNumber), sitNumber);
        intent2.putExtra("PositionName", mPositionName);
        startActivity(intent2);
    }

    private void startExplanation(int sitNumber) {
        Intent intentB = new Intent(this, ExplainSituationActivity.class);
        intentB.putExtra("0", sitNumber);
        intentB.putExtra("PositionName", mPositionName);
        startActivity(intentB);
    }

}
