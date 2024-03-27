package com.example.calculator;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    EditText etnd;
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
    public void clickedBtnPlus(View view) {
        str = etnd.getText().toString();
        if (!str.isEmpty() && clickedEtnd == true)
        {
            int num = Integer.parseInt(str);
            num2 = (double) num;
            answer += num;
            etnd.setText(String.valueOf(answer));
        }
        else
        {
            etnd.setText("try again");
        }
    }

    public void clickedBtnMinus(View view)
        {
            str = etnd.getText().toString();
            if (!str.isEmpty() && clickedEtnd == true)
            {
                int num = Integer.parseInt(str);
                num2 = (double) num;
                answer -= num;
                etnd.setText(String.valueOf(answer));
            }
            else
            {
                etnd.setText("try again");
            }
        }

    public void clickedBtnCefel(View view)
        {
            str = etnd.getText().toString();
            if (!str.isEmpty() && clickedEtnd == true)
            {
                int num = Integer.parseInt(str);
                num2 = (double) num;
                answer *= num;
                etnd.setText(String.valueOf(answer));
            }
            else
            {
                etnd.setText("try again");
            }
        }


    public void clickedBtnDiv(View view)
    {
        str = etnd.getText().toString();
        if (!str.isEmpty() && clickedEtnd == true )
        {
            int num = Integer.parseInt(str);
            num2 = (double) num;
            answer /= num;
            etnd.setText(String.valueOf(answer));
        }
        else
        {
            etnd.setText("try again");
        }


    public void clickedBtnReset(View view)
    {
        etnd.setText("");
        num = 0.0;
    }

    }

    public void clickedBtnResult(View view)
    {

    }
    public void clickedBtnCredits(View view)
    {

    }
}