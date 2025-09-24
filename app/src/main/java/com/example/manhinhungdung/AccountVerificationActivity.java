package com.example.manhinhungdung;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AccountVerificationActivity extends AppCompatActivity {

    TextView txtSelectedBank;
    EditText edtAccountNumber, edtOtp;
    Button btnVerify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_verification);

        txtSelectedBank = findViewById(R.id.txtSelectedBank);
        edtAccountNumber = findViewById(R.id.edtAccountNumber);
        edtOtp = findViewById(R.id.edtOtp);
        btnVerify = findViewById(R.id.btnVerify);

        String bankName = getIntent().getStringExtra("BANK_NAME");
        if (bankName != null) {
            txtSelectedBank.setText("Selected Bank: " + bankName);
        }

        btnVerify.setOnClickListener(v -> {
            Intent intent = new Intent(AccountVerificationActivity.this, SuccessActivity.class);
            startActivity(intent);
        });
    }
}
