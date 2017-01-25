package com.jamestic.softballstrategy.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

import com.jamestic.softballstrategy.R;
import com.jamestic.softballstrategy.model.ExplainCatPage;
import com.jamestic.softballstrategy.model.Explanations;

public class ExplainSituationActivity extends AppCompatActivity{

    private Explanations mExplanations = new Explanations();
    private ExplainCatPage mCurrentPage;
    private Button mBackButton;
    private Button mStartButton;
    private TextView mHeadTextView;
    private TextView mSubHeadTextView;
    private TextView mExplainTextView;
    private TextView mSelectPosTextView;
    private int mPageNumber;
    private int mBackNumber;
    private int mStartNumber;
    private String mPrevSelectPos;
    private Typeface myHeadTextFont;
    private Typeface myButtonTextFont;
    private Typeface mySubHeadTextFont;
    private Typeface mySitExplainTextFont;
    private Typeface mySelPosTextFont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_situation_explain);

        Intent intent = getIntent();
        mPageNumber = intent.getIntExtra("0", 0);
        mPrevSelectPos = intent.getStringExtra("PositionName");

        myHeadTextFont = Typeface.createFromAsset(getAssets(), "fonts/playball_regular.ttf");
        mySubHeadTextFont = Typeface.createFromAsset(getAssets(), "fonts/IMFeFCsc28P.ttf");
        mySitExplainTextFont = Typeface.createFromAsset(getAssets(), "fonts/Gabriela_Regular.ttf");
        mySelPosTextFont = Typeface.createFromAsset(getAssets(), "fonts/IMFeFCsc28P.ttf");
        myButtonTextFont = Typeface.createFromAsset(getAssets(), "fonts/IMFeFCsc28P.ttf");

        mHeadTextView = (TextView) findViewById(R.id.catExplainHeadView);
        mHeadTextView.setTypeface(myHeadTextFont);
        mSubHeadTextView = (TextView) findViewById(R.id.subCatExpHeadView);
        mSubHeadTextView.setTypeface(mySubHeadTextFont);
        mExplainTextView = (TextView) findViewById(R.id.sitInfoTextView);
        mExplainTextView.setTypeface(mySitExplainTextFont);
        mSelectPosTextView = (TextView) findViewById(R.id.selectPosTextView);
        mSelectPosTextView.setTypeface(mySelPosTextFont);

        mBackButton = (Button) findViewById(R.id.sit2BackButton);
        mBackButton.setTypeface(myButtonTextFont);
        mStartButton = (Button) findViewById(R.id.sitStartButton);
        mStartButton.setTypeface(myButtonTextFont);

        //Spinner
        Spinner spinner = (Spinner) findViewById(R.id.posSelectSpinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.position_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinnner
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int pos, long id) {
                // An item was selected. You can retrieve the selected item using
                // parent.getItemAtPosition(pos)
                String posSelected = parent.getItemAtPosition(pos).toString();
                // Showing selected spinner item
                //Toast.makeText(parent.getContext(), "Selected: " + posSelected, Toast.LENGTH_LONG).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Another interface callback
            }
        });
        // End of Spinner


        if (mPrevSelectPos != null) {
            int spinnerPosition = adapter.getPosition(mPrevSelectPos);
            spinner.setSelection(spinnerPosition);
        }

        loadExplainPage(mPageNumber);
    }


    private void loadExplainPage(int choice) {
        mCurrentPage = mExplanations.getExpPages(choice);

        String headText = mCurrentPage.getHeadText();
        mHeadTextView.setText(headText);

        int expTextInt = mCurrentPage.getExpText();
        mExplainTextView.setText(getText(expTextInt));

        mBackNumber = mCurrentPage.getBackPage();
        mBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backAPage(mBackNumber);
            }
        });

        mStartNumber = mCurrentPage.getStartPage();
        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startPage(mStartNumber);
            }
        });



    }

    private void backAPage(int backPageNumber) {
        Intent intent4 = new Intent(this, CategorySelectActivity.class);
        intent4.putExtra("0", backPageNumber);
        startActivity(intent4);
    }

    private void startPage (int startPageNumber) {
        Spinner spinner2 = (Spinner) findViewById(R.id.posSelectSpinner);
        String positionName = spinner2.getSelectedItem().toString();
        Intent intent5 = new Intent(this, CategorySelectActivity.class);
        intent5.putExtra("0", startPageNumber);
        intent5.putExtra("PositionName", positionName);
        startActivity(intent5);
    }

}
