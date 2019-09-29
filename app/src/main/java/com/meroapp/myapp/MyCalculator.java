package com.meroapp.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MyCalculator extends AppCompatActivity implements View.OnClickListener {

    TextView txt;
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnsum, btnsub, btnmulti, btndiv, btnper, btnequal;
    String txtget, first, second, output;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_calculator);

        txt = findViewById(R.id.txt);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnsum = findViewById(R.id.btnsum);
        btnsub = findViewById(R.id.btnsub);
        btnmulti = findViewById(R.id.btnmulti);
        btndiv = findViewById(R.id.btndiv);
        btnper = findViewById(R.id.btnper);
        btnequal = findViewById(R.id.btnequal);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnsum.setOnClickListener(this);
        btnsub.setOnClickListener(this);
        btnmulti.setOnClickListener(this);
        btndiv.setOnClickListener(this);
        btnper.setOnClickListener(this);
        btnequal.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btn0:
                txt.setText(txt.getText() + "0");
                break;
            case R.id.btn1:
                txt.setText(txt.getText() + "1");
                break;
            case R.id.btn2:
                txt.setText(txt.getText() + "2");
                break;
            case R.id.btn3:
                txt.setText(txt.getText() + "3");
                break;
            case R.id.btn4:
                txt.setText(txt.getText() + "4");
                break;
            case R.id.btn5:
                txt.setText(txt.getText() + "5");
                break;
            case R.id.btn6:
                txt.setText(txt.getText() + "6");
                break;
            case R.id.btn7:
                txt.setText(txt.getText() + "7");
                break;
            case R.id.btn8:
                txt.setText(txt.getText() + "8");
                break;
            case R.id.btn9:
                txt.setText(txt.getText() + "9");
                break;

            case R.id.btnper:
                txt.setText("");
                break;

            case R.id.btnsum:
                txtget = "Sum";
                if (txt.getText().toString() != null && txt.getText().length() > 0) {
                    first = txt.getText().toString();
                    txt.setText("");
                }
                break;

            case R.id.btnsub:
                txtget = "Substract";
                if (txt.getText().toString() != null && txt.getText().length() > 0) {
                    first = txt.getText().toString();
                    txt.setText("");
                }
                break;
            case R.id.btnmulti:
                txtget = "Multiply";
                if (txt.getText().toString() != null && txt.getText().length() > 0) {
                    first = txt.getText().toString();
                    txt.setText("");
                }
                break;
            case R.id.btndiv:
                txtget = "Divide";
                if (txt.getText().toString() != null && txt.getText().length() > 0) {
                    first = txt.getText().toString();
                    txt.setText("");
                }
                break;

            case R.id.btnequal:
                if (txt.getText().toString() != null && !first.equals("")) {
                    second = txt.getText().toString();
                    calculate(first, second, txtget);
                    txt.setText(output);
                    first = output;
                }
                break;

        }
    }

    public void calculate(String first, String second, String output) {
        switch (txtget) {

            case "Sum":
                output = (Integer.parseInt(first) + Integer.parseInt(second)) + "";
                break;

            case "Substract":
                output = (Integer.parseInt(first) - Integer.parseInt(second)) + "";
                break;

            case "Multiply":
                output = (Integer.parseInt(first) * Integer.parseInt(second)) + "";
                break;

            case "Divide":
                output = (Integer.parseInt(first) / Integer.parseInt(second)) + "";
                break;

        }
        Toast.makeText(this, "The result is"+output, Toast.LENGTH_LONG).show();
    }

}