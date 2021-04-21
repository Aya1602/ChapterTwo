package com.example.chaptertwo.;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TenthTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        LinearLayout linearLayout = new LinearLayout(this);
        // горизонтальная ориентация
        linearLayout.setOrientation(LinearLayout.HORIZONTAL);

        TextView textView = new TextView(this);
        textView.setText("Hello");
        textView.setTextSize(30);
        // создаем параметры позиционирования для элемента
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams
                (LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        // устанавливаем отступы
        layoutParams.setMargins(100, 100, 0, 0);
        textView.setLayoutParams(layoutParams);
        // добавляем элемент в LinearLayout
        linearLayout.addView(textView);

        setContentView(linearLayout);
    }
}

// ошибка та же.
