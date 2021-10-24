package com.pmdp.aplikasimodul1kel31;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import com.pmdp.aplikasimodul1kel31.R;

public class RegisterActivity extends AppCompatActivity {

    private EditText etUsernameRegister;
    private EditText etPasswordRegister;
    private Button btRegister;
    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        initView();
        back();
    }



    private void initView() {
        etUsernameRegister = findViewById(R.id.etUsernameRegister);
        etPasswordRegister = findViewById(R.id.etPasswordRegister);
        btRegister = findViewById(R.id.btRegister);
        btnBack = findViewById(R.id.btBack);
    }
    private void back() {
        btnBack.setOnClickListener(V -> {
            Intent back = new Intent(this, LoginActivity.class);
            startActivity(back);
            finish();}
        );
    }
}