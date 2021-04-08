package com.example.gitprojecttest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnSingIn, getBtnSingUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSingIn = findViewById(R.id.bnt_singIn);
        getBtnSingUp = findViewById(R.id.btn_singUp);

    }
}