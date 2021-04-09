package com.example.gitprojecttest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Operations extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operations);

        int a = 10;
        int b = 5;

    }

    public static int sum(int nr1, int nr2)
    {
        return nr1 + nr2;
    }

    public static int dif(int nr1, int nr2)
    {
        return nr1 - nr2;
    }

    public static int imul(int nr1, int nr2)
    {
        return nr1 * nr2;
    }




}