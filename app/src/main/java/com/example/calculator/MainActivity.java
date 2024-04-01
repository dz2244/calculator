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
    String str, str2;
    char mode;
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
        counter = (counter + 1) % 2;
        str = etnd.getText().toString();
        mode = '+';
        if(!str.equals("") && clickedEtnd == true )
            num = Double.parseDouble(str);
        else
            Toast.makeText(this, "error,enter a number ", Toast.LENGTH_SHORT).show();
        etnd.setText("");
    }

    public void clickedBtnMinus(View view)
    {
        counter++;
        str = etnd.getText().toString();
        if(!str.isEmpty() && clickedEtnd == true )
        {
            if (counter % 2 == 1) {
                num = Double.parseDouble(str);
            }
            else
            {
                num2 = Double.parseDouble(str2);
                answer = num - num2;
            }
        }
        else
            Toast.makeText(this, "error,enter a number ", Toast.LENGTH_SHORT).show();
    }
    public double readNumber(double num){
        if(!str.equals("") && clickedEtnd == true )
            if (num == 0)
                return 0;
        else
            Toast.makeText(this, "error,enter a number ", Toast.LENGTH_SHORT).show();
        etnd.setText("");
        return num;
    }
    public void clickedBtnCefel(View view)
    {
        counter++;
        str = etnd.getText().toString();
        if(!str.isEmpty() && clickedEtnd == true )
        {
            if (counter % 2 == 1) {
                num = Double.parseDouble(str);
            }
            else
            {
                num2 = Double.parseDouble(str2);
                answer = num * num2;
            }
        }
        else
            Toast.makeText(this, "error,enter a number ", Toast.LENGTH_SHORT).show();
    }


    public void clickedBtnDiv(View view)
    {
        counter++;
        str = etnd.getText().toString();
        if(!str.isEmpty() && clickedEtnd == true )
        {
            if (counter % 2 == 1)
            {
                num = Double.parseDouble(str);
            }
            else
            {
                num2 = Double.parseDouble(str2);
                answer = num + num2;
            }
        }
        else
            Toast.makeText(this, "error,enter a number ", Toast.LENGTH_SHORT).show();
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
        num2 = Double.parseDouble(str);
        Toast.makeText(this, "1: "+num+"; 2: "+num2, Toast.LENGTH_SHORT).show();
        if (mode == '+')
            answer = num + num2;
        else if (mode == '-')
            answer = num - num2;
        else if (mode == '*')
            answer = num * num2;
        else if (mode == '/'){
            if (num2 == 0) {
                Toast.makeText(this, "Can not divide by zero!!", Toast.LENGTH_SHORT).show();
                answer = 0.0;
            }
            else
                answer = num / num2;
        }
        Toast.makeText(this, ""+answer, Toast.LENGTH_SHORT).show();
        etnd.setText(""+answer);
    }
    public void clickedBtnCredits(View view)
    {

    }
}