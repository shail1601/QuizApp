package com.example.android.quizapp02;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;

import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.quizapp02.R;

import java.text.NumberFormat;


public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioGroup radioGroup01;
    Button submit, clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        * Author:geeksforgeeks
        * Availability: https://www.geeksforgeeks.org/android-how-to-add-radio-buttons-in-an-android-application/
        */
        submit = (Button) findViewById(R.id.submit);
        clear = (Button) findViewById(R.id.clear);
        radioGroup = (RadioGroup) findViewById(R.id.groupradio);


        radioGroup.clearCheck();


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                    public void onCheckedChanged(RadioGroup group,int checkedId) {

                        RadioButton radioButton = (RadioButton) group.findViewById(checkedId);
                    }
                });

        submit.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {

                int selectedId = radioGroup.getCheckedRadioButtonId();
                int radioAnswer = R.id.radio_q1_id2;
                if (selectedId == -1) {
                    Toast.makeText(MainActivity.this, "No answer has been selected", Toast.LENGTH_SHORT).show();
                } else if (selectedId == radioAnswer){
                    Toast.makeText(MainActivity.this, "Correct Answer: USA", Toast.LENGTH_SHORT).show();
                }else{
                    // incorrect Toast
                    Toast.makeText(MainActivity.this, "Your Q1 answer is incorrect", Toast.LENGTH_SHORT).show();
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                radioGroup.clearCheck();
            }
        });

        submit = (Button) findViewById(R.id.submit01);
        clear = (Button) findViewById(R.id.clear02);
        radioGroup01 = (RadioGroup) findViewById(R.id.groupradio01);


        radioGroup01.clearCheck();


        radioGroup01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                    public void onCheckedChanged(RadioGroup group,int checkedId) {
                        RadioButton radioButton = (RadioButton) group.findViewById(checkedId);
                    }
                });

        submit.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {

                int selectedId = radioGroup01.getCheckedRadioButtonId();
                if (selectedId == -1) {
                    Toast.makeText(MainActivity.this, "No attempt to the question",Toast.LENGTH_SHORT).show();
                }
                else {
                    RadioButton radioButton = (RadioButton) radioGroup01.findViewById(selectedId);
                    Toast.makeText(MainActivity.this, "Correct Answer: A basket", Toast.LENGTH_SHORT).show();
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                radioGroup01.clearCheck();
            }
        });
    }
    public void clearCheckboxQuestion (View view){
        CheckBox stephCurryCheckBox = (CheckBox) findViewById(R.id.radia_id5);
        stephCurryCheckBox.setChecked(false);
        CheckBox jamesHardenCheckBox = (CheckBox) findViewById(R.id.radia_id6);
        jamesHardenCheckBox.setChecked(false);
    }

    public void clearTextQuestion (View view){
        EditText answer = (EditText) findViewById(R.id.quantity_view);
        answer.setText("");
    }
    public void submitOrder(View view) {

        CheckBox stephCurryCheckBox = (CheckBox) findViewById(R.id.radia_id5);
        boolean stephCurry = stephCurryCheckBox.isChecked();
        CheckBox jamesHardenCheckBox = (CheckBox) findViewById(R.id.radia_id6);
        boolean jamesHarden = jamesHardenCheckBox.isChecked();;
        Toast.makeText(getApplicationContext(),"No attempt to the question",Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(),"Correct Answer: Both",Toast.LENGTH_SHORT).show();
        EditText answer = (EditText) findViewById(R.id.quantity_view);
        String answerStr = answer.getText().toString();

        if ((TextUtils.isEmpty(answerStr))){
            // display an empty answer Toast
            Toast.makeText(getApplicationContext(),"No attempt to the question",Toast.LENGTH_SHORT).show();
        }else if(answerStr.equalsIgnoreCase("5")){
            // display a correct Toast
        }else{
            // display an incorrect Toast
        }



      /*
      *Author: Android Developers
      *Availability: https://developer.android.com/guide/topics/ui/controls/radiobutton
      */
        switch (view.getId()) {
            case R.id.clear01:
                if (stephCurry) ;

                else
                    break;
            case R.id.submit02:
                if (jamesHarden) ;

                else
                    break;
        }
        if(!stephCurry && !jamesHarden){
            // display an empty answer Toast
            Toast.makeText(getApplicationContext(),"No attempt to the question",Toast.LENGTH_SHORT).show();
        }else if(stephCurry && jamesHarden){
            // display a toast, correct
            Toast.makeText(getApplicationContext(),"Your Q2 answer is incorrect",Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(getApplicationContext(),"Your Q2 answer is incorrect",Toast.LENGTH_SHORT).show();
            // display a toast, incorrect
        }
    }
}
