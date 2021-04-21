package com.example.chaptertwo.;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class EleventhTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RelativeLayout relativeLayout = new RelativeLayout(this);

        EditText editText = new EditText(this);
        editText.setId(EditText.generateViewId());

        Button button = new Button(this);
        button.setText("Отправить");

        // устанавливаем параметры положения для EditText
        RelativeLayout.LayoutParams editTextParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        // выравнивание по центру родительского контейнера
        editTextParams.addRule(RelativeLayout.CENTER_IN_PARENT);
        // добавляем в RelativeLayout
        relativeLayout.addView(editText, editTextParams);

        // устанавливаем параметры положения для Button
        RelativeLayout.LayoutParams buttonParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        // выравнивание справа и снизу от поля EditText
        buttonParams.addRule(RelativeLayout.BELOW, editText.getId());
        buttonParams.addRule(RelativeLayout.ALIGN_RIGHT, editText.getId());
        // добавляем в RelativeLayout
        relativeLayout.addView(button, buttonParams);

        setContentView(relativeLayout);
    }
}