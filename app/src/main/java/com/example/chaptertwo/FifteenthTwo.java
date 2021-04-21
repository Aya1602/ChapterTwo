package com.example.chaptertwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

public class FifteenthTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        ScrollView scrollView = new ScrollView(this);

        TextView textView = new TextView(this);
        textView.setText("Lorem Ipsum is simply dummy text of the printing and typesetting industry...like Aldus PageMaker including versions of Lorem Ipsum.");
        textView.setLayoutParams(new ViewGroup.LayoutParams
                (ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        textView.setTextSize(26);
        scrollView.addView(textView);
        setContentView(scrollView);
    }
}