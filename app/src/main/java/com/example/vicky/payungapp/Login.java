package com.example.vicky.payungapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    public static final String EXTRA_TEXT = "com.example.vicky.payungapp.EXTRA_TEXT";

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        button = findViewById(R.id.Daftar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDaftar();
            }
        });

        Button loginButton = findViewById(R.id.login2);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeScreen();
            }
        });
    }

    private void openHomeScreen() {
        Intent intent = new Intent(this, Homescreen.class);
        startActivity(intent);
    }

    private void openDaftar() {
        Intent intent = new Intent(this, Daftar.class);
        startActivity(intent);
    }
}
