package com.example.chaptertwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.TextView;

public class ThirteenthTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FrameLayout frameLayout = new FrameLayout(this);
        TextView textView = new TextView(this);
        textView.setText("Hello World!");

        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams
                (FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.gravity = Gravity.CENTER_HORIZONTAL | Gravity.TOP;

        textView.setLayoutParams(layoutParams);
        textView.setTextSize(26);
        frameLayout.addView(textView);
        setContentView(frameLayout);
    }
}