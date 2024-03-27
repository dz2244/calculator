package com.example.calculator;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etnd;
    int counter = 0;
    Boolean clickedEtnd = false;
    Double answer, num ,num2;
    String str;
    Button btnResult ,btnCredits ,btnReset ,btnDiv ,btnCefel ,btnMinus ,btnPlus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnResult = findViewById(R.id.btnResult);
        btnReset = findViewById(R.id.btnReset);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnDiv = findViewById(R.id.btnDiv);
        btnCefel = findViewById(R.id.btnCefel);
        btnCredits = findViewById(R.id.btnCredits);
        etnd = findViewById(R.id.etnd);
    }
    public void clickedEtnd(View view) {clickedEtnd = true;}
    public void clickedBtnPlus(View view)
    {
        counter++;
        str = etnd.getText().toString();
        if (!str.isEmpty() && clickedEtnd == true && counter%2==0)
        {
            num = Double.parseDouble(str);
            answer = num+num2;
        }
        else
            Toast.makeText(this, "error,enter a number ", Toast.LENGTH_SHORT).show();
    }

    public void clickedBtnMinus(View view)
        {
            counter++;
            str = etnd.getText().toString();
            if (!str.isEmpty() && clickedEtnd == true && counter%2==0)
            {
                num = Double.parseDouble(str);
                answer = num-num2;
            }
            else
                Toast.makeText(this, "error,enter a number ", Toast.LENGTH_SHORT).show();
        }

    public void clickedBtnCefel(View view)
        {
            counter++;
            str = etnd.getText().toString();
            if (!str.isEmpty() && clickedEtnd == true && counter%2==0)
            {
                num = Double.parseDouble(str);
                answer = num*num2;
            }
            else
                Toast.makeText(this, "error,enter a number ", Toast.LENGTH_SHORT).show();
        }


    public void clickedBtnDiv(View view)
    {
        counter++;
        str = etnd.getText().toString();
        if (!str.isEmpty() && clickedEtnd == true && counter%2==0) {
            num = Double.parseDouble(str);
            answer = num/num2;
        }
        else
            Toast.makeText(this, "error,enter a number ", Toast.LENGTH_SHORT).show();
    }

    public void clickedBtnReset(View view)
    {
        etnd.setText("");
        num = 0.0;
        clickedEtnd = false;

    }


    public void clickedBtnResult(View view)
    {
        etnd.setText(String.valueOf(answer));
    }
    public void clickedBtnCredits(View view)
    {

    }
}