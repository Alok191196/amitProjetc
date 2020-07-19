package com.layoutdesigns;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class VerificationActivity_1 extends AppCompatActivity {

    EditText et1;
    EditText et2;
    EditText et3;
    EditText et4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification_1);

        String mobileNo = getIntent().getStringExtra("MOBILE_NO");

        Intent intent = new Intent(VerificationActivity_1.this, ChatActivity.class);
        startActivity(intent);


    }
}
