package com.example.manhinhungdung;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreateAccountActivity extends AppCompatActivity {

    EditText editTextFirstName, editTextLastName, editTextEmail, editTextPassword;
    Button btnCreateAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        // Ánh xạ view
        editTextFirstName = findViewById(R.id.editTextFirstName);
        editTextLastName = findViewById(R.id.editTextLastName);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        btnCreateAccount = findViewById(R.id.btnCreateAccount);

        // Xử lý sự kiện khi nhấn Create Account
        btnCreateAccount.setOnClickListener(v -> {
            String firstName = editTextFirstName.getText().toString().trim();
            String lastName = editTextLastName.getText().toString().trim();
            String email = editTextEmail.getText().toString().trim();
            String password = editTextPassword.getText().toString().trim();

            if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Tạo tài khoản thành công (giả lập)", Toast.LENGTH_SHORT).show();

                // Sau khi tạo tài khoản xong, chuyển sang màn hình SetPaymentActivity (màn 3)
                // Nếu chưa code màn 3 thì tạm thời quay lại WelcomeActivity
                Intent intent = new Intent(CreateAccountActivity.this, WelcomeActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
