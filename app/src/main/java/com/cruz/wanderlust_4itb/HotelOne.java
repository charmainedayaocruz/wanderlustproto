package com.cruz.wanderlust_4itb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HotelOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_one);
    }

    public void backtohotels(View view) {
        Intent intent5 = new Intent(this, Hotel_Baguio.class);
        startActivity(intent5);
    }
}
