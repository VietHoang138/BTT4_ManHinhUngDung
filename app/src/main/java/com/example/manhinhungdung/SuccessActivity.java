package com.example.manhinhungdung;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
public class SuccessActivity extends AppCompatActivity {

    Button btnContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        btnContinue = findViewById(R.id.btnContinue);

        //btnContinue.setOnClickListener(v -> {
        //    Intent intent = new Intent(SuccessActivity.this, MainActivity.class);
        //    startActivity(intent);
        //});
    }
}
