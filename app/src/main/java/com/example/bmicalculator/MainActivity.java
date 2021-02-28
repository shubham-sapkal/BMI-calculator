package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private RadioGroup genderRadioGroup;
    private EditText heightEditText;
    private EditText ageEditText;
    private EditText weightEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        genderRadioGroup = (RadioGroup) findViewById(R.id.genderRadioGroup);
        heightEditText = (EditText) findViewById(R.id.heightEditText);
        ageEditText = (EditText) findViewById(R.id.ageEditText);
        weightEditText = (EditText) findViewById(R.id.weightEditText);

    }

    public void onCalculate(View view){


        if(heightEditText.getText().toString()!=null && ageEditText.getText().toString()!=null && weightEditText.getText().toString()!=null){

            switch (genderRadioGroup.getCheckedRadioButtonId()){

                case R.id.maleRadioButton :
                    calulateBMI("Male",
                            Float.parseFloat(heightEditText.getText().toString()),
                            Integer.parseInt(ageEditText.getText().toString()),
                            Float.parseFloat(weightEditText.getText().toString()));
                    break;

                case R.id.femaleRadioButton :
                    calulateBMI("Fale",
                            Float.parseFloat(heightEditText.getText().toString()),
                            Integer.parseInt(ageEditText.getText().toString()),
                            Float.parseFloat(weightEditText.getText().toString()));
                    break;

                default:
                    Toast.makeText(this, "Please Select Your Gender", Toast.LENGTH_LONG).show();
            }

        }
        else{

            Toast.makeText(this, "oops! You missed something ... ", Toast.LENGTH_LONG).show();

        }



    }

    private void calulateBMI(String gender,float Height,int age,float weight){


        Height = Height/100;

        float rawBMI = weight / (Height * Height);
        //Log.i("mytag","Value of rawBMI from MainActivity : "+rawBMI);
        Intent intent = new Intent(MainActivity.this,ResultActivity.class);
        intent.putExtra("rawBMI",rawBMI);
        startActivity(intent);


    }


}