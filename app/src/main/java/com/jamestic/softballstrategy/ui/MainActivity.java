package com.jamestic.softballstrategy.ui;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.jamestic.softballstrategy.R;

public class MainActivity extends AppCompatActivity {

    private ImageButton mStartButton;
    private TextView mStartText;
    private Typeface myCustomFont1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myCustomFont1 = Typeface.createFromAsset(getAssets(), "fonts/MeriendaOne_Regular.ttf");

        mStartText = (TextView) findViewById(R.id.startText);
        mStartText.setTypeface(myCustomFont1);

        mStartButton = (ImageButton) findViewById(R.id.startButton);
        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTraining();
            }
        });
    }

    private void startTraining() {
        Intent intent = new Intent(this, CategorySelectActivity.class);
        startActivity(intent);
    }

}
