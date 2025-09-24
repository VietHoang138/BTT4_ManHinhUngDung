package com.example.manhinhungdung;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
public class BankSelectionActivity extends AppCompatActivity {

    Button btnBank1, btnBank2, btnBank3, btnBank4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_selection);

        btnBank1 = findViewById(R.id.btnBank1);
        btnBank2 = findViewById(R.id.btnBank2);
        btnBank3 = findViewById(R.id.btnBank3);
        btnBank4 = findViewById(R.id.btnBank4);

        btnBank1.setOnClickListener(v -> goToNext("Vietcombank"));
        btnBank2.setOnClickListener(v -> goToNext("Techcombank"));
        btnBank3.setOnClickListener(v -> goToNext("BIDV"));
        btnBank4.setOnClickListener(v -> goToNext("VPBank"));
    }

    private void goToNext(String bankName) {
        Intent intent = new Intent(BankSelectionActivity.this, AccountVerificationActivity.class);
        intent.putExtra("BANK_NAME", bankName);
        startActivity(intent);
    }
}
