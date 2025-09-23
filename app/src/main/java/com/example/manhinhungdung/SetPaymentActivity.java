package com.example.manhinhungdung;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.cardview.widget.CardView;

public class SetPaymentActivity extends AppCompatActivity {

    CardView cardBank, cardPaypal, cardStripe, cardCreditCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_payment);

        cardBank = findViewById(R.id.cardBank);
        cardPaypal = findViewById(R.id.cardPaypal);
        cardStripe = findViewById(R.id.cardStripe);
        cardCreditCard = findViewById(R.id.cardCreditCard);

        cardBank.setOnClickListener(v -> {
            Intent intent = new Intent(SetPaymentActivity.this, CreateAccountActivity.class);
            intent.putExtra("paymentMethod", "Bank");
            startActivity(intent);
        });

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
