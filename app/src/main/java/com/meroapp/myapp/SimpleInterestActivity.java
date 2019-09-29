package com.meroapp.myapp;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SimpleInterestActivity extends AppCompatActivity  {

    private EditText EditText1;
    private EditText EditText2;
    private EditText EditText3;
    private Button Btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_interest);

        EditText1= findViewById(R.id.et1);
        EditText2= findViewById(R.id.et2);
        EditText3= findViewById(R.id.et3);
        Btn=findViewById(R.id.btn);

        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(EditText1.getText().toString().length() == 0){
                    EditText1.setText("0");
                }

                if(EditText2.getText().toString().length() == 0){
                    EditText2.setText("0");
                }
                if(EditText3.getText().toString().length() == 0){
                    EditText3.setText("0");
                }
                int num1 = Integer.parseInt(EditText1.getText().toString());
                int num2 = Integer.parseInt(EditText2.getText().toString());
                int num3 = Integer.parseInt(EditText3.getText().toString());

                int si= num1 * num2 * num3/100;
                Toast.makeText(SimpleInterestActivity.this, "SI is " +si, Toast.LENGTH_SHORT).show();

            }
        });

    }
}
