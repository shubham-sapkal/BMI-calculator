package com.example.bmicalculator;

import android.graphics.Color;

public class Category {

    public static String getCategory (float result) {
        String category;
        if (result < 15) {
            category = "very severely underweight";
        } else if (result >=15 && result <= 16) {
            category = "severely underweight";
        } else if (result >16 && result <= 18.5) {
            category = "underweight";
        } else if (result >18.5 && result <= 25) {
            category = "normal (healthy weight)";
        } else if (result >25 && result <= 30) {
            category = "overweight";
        } else if (result >30 && result <= 35) {
            category = "moderately obese";
        } else if (result >35 && result <= 40) {
            category = "severely obese";
        } else {
            category ="very severely obese";
        }
        return category;
    }

    public static String getCategoryColor (float result) {
        String color;

        if (result < 15) {
            color = "#C62828";
            //color = Color.valueOf()Color.parseColor("#C62828");
        } else if (result >=15 && result <= 16) {
            color = "#E53935";
        } else if (result >16 && result <= 18.5) {
            color = "#FFFF8D";
        } else if (result >18.5 && result <= 25) {
            color = "#388E3C";
        } else if (result >25 && result <= 30) {
            color = "#FFFF8D";
        } else if (result >30 && result <= 35) {
            color = "#EF5350";
        } else if (result >35 && result <= 40) {
            color = "#E53935";
        } else {
            color ="#B71C1C";
        }
        return color;
    }

}
