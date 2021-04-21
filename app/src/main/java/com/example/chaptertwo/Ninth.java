package com.example.chaptertwo.;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Ninth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        ConstraintLayout constraintLayout = new ConstraintLayout(this);

        EditText editText = new EditText(this);
        editText.setHint("Введите Email");
        editText.setId(View.generateViewId());

        Button button = new Button(this);
        button.setText("Отправить");
        button.setId(View.generateViewId());

        ConstraintLayout.LayoutParams editTextLayout = new ConstraintLayout.LayoutParams
                (ConstraintLayout.LayoutParams.WRAP_CONTENT , ConstraintLayout.LayoutParams.WRAP_CONTENT);
        editTextLayout.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        editTextLayout.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        editTextLayout.rightToLeft = button.getId();
        editText.setLayoutParams(editTextLayout);
        constraintLayout.addView(editText);

        ConstraintLayout.LayoutParams buttonLayout = new ConstraintLayout.LayoutParams
                (ConstraintLayout.LayoutParams.WRAP_CONTENT , ConstraintLayout.LayoutParams.WRAP_CONTENT);
        buttonLayout.leftToRight = editText.getId();
        buttonLayout.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        button.setLayoutParams(buttonLayout);
        constraintLayout.addView(button);

        setContentView(constraintLayout);
    }
}


// НЕ ПОЙМУ ПОЧЕМУ У МЕНЯ ОШИБКА, Я СЛЕДОВАЛА ПО НИЖНЕМУ НАПИСАНИЮ:

/*
    При расположении одного элемента относительно другого, нам нужно знать id вторрого элемента.
    Если элемент определен в коде Java, то вначале надо сгенерировать идентификатор:
        editText.setId(View.generateViewId());
        button.setId(View.generateViewId());

        Затем можно применять идентификаторы элементов для установки позиционирования.
        Так, левая граница EditText выравнивается по правой границе кнопки:
        editTextLayout.rightToLeft = button.getId();

        А правая граница кнопки выравнивается по левой границе элемента EditText:
        buttonLayout.leftToRight = editText.getId();*/