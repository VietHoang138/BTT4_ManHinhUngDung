package com.example.manhinhungdung;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class WelcomeActivity extends AppCompatActivity {

    EditText editTextEmail, editTextPassword;
    Button btnSignIn, btnCreateAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        // Ánh xạ view
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        btnSignIn = findViewById(R.id.btnSignIn);
        btnCreateAccount = findViewById(R.id.btnCreateAccount);

        // Xử lý sự kiện nút Sign In
        btnSignIn.setOnClickListener(v -> {
            String email = editTextEmail.getText().toString().trim();
            String password = editTextPassword.getText().toString().trim();

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Vui lòng nhập đầy đủ Email và Password", Toast.LENGTH_SHORT).show();
            } else {
                // Chưa có backend nên chỉ giả lập
                Toast.makeText(this, "Đăng nhập thành công (giả lập)", Toast.LENGTH_SHORT).show();

                // Chuyển sang màn hình SetPaymentActivity (sẽ làm sau)
                // startActivity(new Intent(WelcomeActivity.this, SetPaymentActivity.class));
            }
        });

        // Xử lý sự kiện nút Create Account
        btnCreateAccount.setOnClickListener(v -> {
            // Chuyển sang màn hình CreateAccountActivity (sẽ code sau)
            startActivity(new Intent(WelcomeActivity.this, CreateAccountActivity.class));
            Toast.makeText(this, "Đi tới Create Account (giả lập)", Toast.LENGTH_SHORT).show();
        });
    }
}
