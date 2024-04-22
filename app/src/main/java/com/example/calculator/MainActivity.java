package com.example.calculator;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etnd;
    int counter = 0;
    Boolean clickedEtnd = false;
    Double answer, num ,num2,answer2;
    String str;
    char mode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etnd = findViewById(R.id.etnd);
    }
    public void clickedBtnPlus(View view)
    {
        counter = (counter + 1) % 2;
        str = etnd.getText().toString();
        mode = '+';
        if(!str.equals("") )
            num = Double.parseDouble(str);
        else
            Toast.makeText(this, "error,enter a number ", Toast.LENGTH_SHORT).show();
        etnd.setText("");
    }

    public void clickedBtnMinus(View view)
    {
        counter = (counter + 1) % 2;
        str = etnd.getText().toString();
        mode = '-';
        if(!str.equals(""))
            num = Double.parseDouble(str);
        else
            Toast.makeText(this, "error,enter a number ", Toast.LENGTH_SHORT).show();
        etnd.setText("");
    }
    public double readNumber(double num){
        if(!str.equals(""))
            if (num == 0)
                return 0;
        else
            Toast.makeText(this, "error,enter a number ", Toast.LENGTH_SHORT).show();
        etnd.setText("");
        return num;
    }
    public void clickedBtnCefel(View view)
    {
        counter = (counter + 1) % 2;
        str = etnd.getText().toString();
        mode = '*';
        if(!str.equals(""))
            num = Double.parseDouble(str);
        else
            Toast.makeText(this, "error,enter a number ", Toast.LENGTH_SHORT).show();
        etnd.setText("");
    }
    public void clickedBtnDiv(View view)
    {
        counter = (counter + 1) % 2;
        str = etnd.getText().toString();
        mode = '/';
        if(!str.equals(""))
            num = Double.parseDouble(str);
        else
            Toast.makeText(this, "error,enter a number ", Toast.LENGTH_SHORT).show();
        etnd.setText("");
    }
    public void clickedBtnReset(View view)
    {
        etnd.setText("");
        num = 0.0;
        num2 = 0.0;
        clickedEtnd = false;
    }
    public void clickedBtnResult(View view)
    {
        str = etnd.getText().toString();
        if(str == null)
        {
            Toast.makeText(this, "you need to enter another number", Toast.LENGTH_SHORT).show();
        }
        if(!str.isEmpty() && str != null)
        {
            num2 = Double.parseDouble(str);
            if (mode == '+')
                answer = num + num2;
            else if (mode == '-')
                answer = num - num2;
            else if (mode == '*')
                answer = num * num2;
            else if (mode == '/')
            {
                if (num2 == 0)
                {
                    Toast.makeText(this, "Can not divide by zero!!", Toast.LENGTH_SHORT).show();

                }
                else
                    answer = num / num2;
            }
            answer2 = answer;
            etnd.setText("" + answer);
        }
    }
    public void clickedBtnCredits(View view)
    {
        Intent ioeohad = new Intent(this,calculator2.class);
        ioeohad.putExtra("369",answer2);
        startActivity(ioeohad);
    }

    public void clickedEt(View view) {
        Toast.makeText(this, "you cannot press the edit text", Toast.LENGTH_SHORT).show();
    }
}