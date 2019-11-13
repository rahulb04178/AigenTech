package com.example.aigentech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CarDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_details);
        Intent intent = getIntent();
        String name = intent.getStringExtra("Name");
        String customer_name = intent.getStringExtra("Customer");
        int image = intent.getIntExtra("Image",0);
        String contact = intent.getStringExtra("Contact");
        String address = intent.getStringExtra("Address");
        setTitle(name);
        ImageView img = findViewById(R.id.car_img);
        TextView txtname1 = findViewById(R.id.car_customer_name);
        TextView txtcontact1 = findViewById(R.id.car_conact_no);
        TextView txtaddress1 = findViewById(R.id.car_address_name);

        img.setImageResource(image);
        txtname1.setText(customer_name);
        txtcontact1.setText(contact);
        txtaddress1.setText(address);


    }
}
