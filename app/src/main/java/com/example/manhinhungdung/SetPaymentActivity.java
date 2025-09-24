package com.example.manhinhungdung;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import androidx.cardview.widget.CardView;

public class SetPaymentActivity extends AppCompatActivity {

    CardView btnBank, cardPaypal, cardStripe, cardCreditCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_payment);

        btnBank = findViewById(R.id.btnBank);
        cardPaypal = findViewById(R.id.cardPaypal);
        cardStripe = findViewById(R.id.cardStripe);
        cardCreditCard = findViewById(R.id.cardCreditCard);

        // Nhấn Bank -> chuyển sang màn chọn ngân hàng
        btnBank.setOnClickListener(v -> {
            Intent intent = new Intent(SetPaymentActivity.this, BankSelectionActivity.class);
            startActivity(intent);
        });

        // Các phương thức khác -> chuyển sang tạo tài khoản với extra
        cardPaypal.setOnClickListener(v -> {
            Intent intent = new Intent(SetPaymentActivity.this, CreateAccountActivity.class);
            intent.putExtra("paymentMethod", "Paypal");
            startActivity(intent);
        });

        cardStripe.setOnClickListener(v -> {
            Intent intent = new Intent(SetPaymentActivity.this, CreateAccountActivity.class);
            intent.putExtra("paymentMethod", "Stripe");
            startActivity(intent);
        });

        cardCreditCard.setOnClickListener(v -> {
            Intent intent = new Intent(SetPaymentActivity.this, CreateAccountActivity.class);
            intent.putExtra("paymentMethod", "Credit Card");
            startActivity(intent);
        });

    }
}
