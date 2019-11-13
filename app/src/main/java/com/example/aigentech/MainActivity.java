package com.example.aigentech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText edtEmail = findViewById(R.id.edt_email);
        final EditText edtPass = findViewById(R.id.edt_password);
        Button btnLogin = findViewById(R.id.btn_submit);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtEmail.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter Email Id", Toast.LENGTH_SHORT).show();
                }else if (edtPass.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter Password", Toast.LENGTH_SHORT).show();
                }else if (!edtEmail.getText().toString().equals("test@aigen.tech") && !edtPass.getText().toString().equals("AigenTech")){
                    Toast.makeText(MainActivity.this, "Invalid Email Id & Password", Toast.LENGTH_SHORT).show();
                }else if (edtEmail.getText().toString().equals("test@aigen.tech") && edtPass.getText().toString().equals("AigenTech")){
                    Intent intent = new Intent(MainActivity.this,HomeActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
