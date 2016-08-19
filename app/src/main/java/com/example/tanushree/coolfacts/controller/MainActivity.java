package com.example.tanushree.coolfacts.controller;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.tanushree.coolfacts.R;
import com.example.tanushree.coolfacts.model.ColorWheel;
import com.example.tanushree.coolfacts.model.FactBook;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;
    private Button mButton;
    private RelativeLayout mRelativeLayout;

    private ColorWheel mColorWheel = new ColorWheel();
    private FactBook mFactBook = new FactBook();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.tvFact);
        mButton = (Button) findViewById(R.id.bShowFact);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.rlMain);

        // the listener is implemented as an anonymous inner class.
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fact = mFactBook.getFact();
                int color = mColorWheel.getColor();

                mTextView.setText(fact);
                mRelativeLayout.setBackgroundColor(color);
                mButton.setTextColor(color);
            }
        });
    }
}