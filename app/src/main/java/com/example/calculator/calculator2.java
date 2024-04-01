package com.example.calculator;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class calculator2 extends AppCompatActivity {
    TextView answer;
    String x2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator2);

        answer = findViewById(R.id.answer);
        Intent get = getIntent();
        double x1 = get.getDoubleExtra("369", 1);
        answer.setText(""+x1);
    }

    public void clickedBtn(View view) {
        finish();


    }
}