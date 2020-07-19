package com.layoutdesigns;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button nxt_btn_id;
    EditText editTextMobile;
    String customerMobile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nxt_btn_id = findViewById(R.id.nxt_btn_id);
        editTextMobile = findViewById(R.id.mobile_no);
        customerMobile = editTextMobile.getText().toString();

        nxt_btn_id.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.nxt_btn_id:
                Intent intent  =  new Intent(MainActivity.this,  VerificationActivity_1.class);
                intent.putExtra("MOBILE_NO", customerMobile);
                startActivity(intent);
                break;
        }
    }
}
