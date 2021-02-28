package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity {


    TextView bmiTextView;
    TextView categoryTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


        Intent intent = getIntent();

        float BMI  = Math.round((intent.getFloatExtra("rawBMI", 0) * 100) / 100);
//        Log.i("mytag","Value of rawBMI from result : "+intent.getFloatExtra("rawBMI", 0));
//        Log.i("mytag","Value if BMI from result : "+BMI);


        bmiTextView = (TextView) findViewById(R.id.bmiTextView);
        categoryTextView = (TextView) findViewById(R.id.categoryTextView);


        bmiTextView.setText(Float.toString(BMI));
        categoryTextView.setText(Category.getCategory(BMI));
        bmiTextView.setTextColor(Color.parseColor(Category.getCategoryColor(BMI)));

    }
}