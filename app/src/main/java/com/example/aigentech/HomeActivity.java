package com.example.aigentech;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.aigentech.model.Cars;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity implements CarRecyclerView.onCarListener{

    RecyclerView recyclerView;
    ArrayList<Cars> cars;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        setTitle("List Of Cars");

        cars = new ArrayList<>();
        cars.add(new Cars("AUDI Q7",R.drawable.audi,"Rahul Bandgar","022 6686 1010","FT Tower, CTS No. 256 & 257, Suren Rd, Chakala, Andheri East, Mumbai, Maharashtra 400093"));
        cars.add(new Cars("TOYOTA INNOVA 2.5 V7",R.drawable.toyo,"Rohit Patil","022 66682020","C - 1/5, Sarathi, Khira Nagar, S. V. Road, Sanacruz(West), Mumbai, Maharashtra 400054"));
        cars.add(new Cars("MINI COOPER S",R.drawable.mini_coopers,"Saurbh Raut","022 66985245","Kensington 'B' Wing, Kensington Rear Exit Road, Hiranandani Gardens, Powai, Mumbai, Maharashtra 400076"));
        cars.add(new Cars("HYUNDAI I20",R.drawable.hundai,"Dinesh Bandgar","022 7895654","8, Mugalsan Rd, Sector 20 B, Sector 20, Airoli, Navi Mumbai, Maharashtra 400708"));
        cars.add(new Cars("MAHINDRA XUV500 W8",R.drawable.mahindra,"Dayanad Thorat","022 335651","Eastern Express Hwy, Kannamwar Nagar II, Vikhroli, Mumbai, Maharashtra 400079"));




        recyclerView = findViewById(R.id.recyclr_car);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(new CarRecyclerView(cars,this,this));


    }

    @Override
    public void oncarClick(int position) {
        Intent intent = new Intent(HomeActivity.this,CarDetailsActivity.class);
        intent.putExtra("Name",cars.get(position).getnName());
        intent.putExtra("Image",cars.get(position).getnImage());
        intent.putExtra("Customer",cars.get(position).getnCustomer());
        intent.putExtra("Contact",cars.get(position).getnContact());
        intent.putExtra("Address",cars.get(position).getnAddress());
        startActivity(intent);
    }
}
