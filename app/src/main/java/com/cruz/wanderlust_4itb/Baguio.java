package com.cruz.wanderlust_4itb;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Baguio extends AppCompatActivity {


    String destination;
    private SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baguio);
        preferences = PreferenceManager.getDefaultSharedPreferences(this);
        destination = preferences.getString("destination", "");

    }

    public void gotohotel(View view){
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("destination", destination);
        editor.commit();
        editor.apply();
        Intent intent3 = new Intent(this, Hotel_Baguio.class);
        startActivity(intent3);
    }

    public void backtodestination(View view){
        Intent intent8 = new Intent(this, Select_Destination.class);
        startActivity(intent8);
    }
}
