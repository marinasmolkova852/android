package com.example.clickbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ButtonActivity extends AppCompatActivity {

    TextView textView;
    Button btnOk;
    Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        btnOk = findViewById(R.id.button);
        btnCancel = findViewById(R.id.button2);

        View.OnClickListener oclBtnOk = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                textView.setText("Нажата кнопка ОК");
            }
        };
        View.OnClickListener oclBtnCancel = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                textView.setText("Нажата кнопка Cancel");
            }
        };

        btnOk.setOnClickListener(oclBtnOk);
        btnCancel.setOnClickListener(oclBtnCancel);
    }
}