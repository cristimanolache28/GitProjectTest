package com.example.gitprojecttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnSingIn, btnBtnSingUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSingIn = findViewById(R.id.bnt_singIn);
        btnBtnSingUp = findViewById(R.id.btn_singUp);

        btnSingIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSingIn();
            }
        });

        btnBtnSingUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSingUp();
            }
        });

    }

    private void openSingUp() {
        Intent intent = new Intent(MainActivity.this, SingUp.class);
        startActivity(intent);
    }

    private void openSingIn() {
        Intent intent = new Intent(MainActivity.this, SingIn.class);
        startActivity(intent);
    }
}