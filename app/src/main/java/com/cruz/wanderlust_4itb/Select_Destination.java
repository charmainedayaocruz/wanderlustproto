package com.cruz.wanderlust_4itb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;


public class Select_Destination extends AppCompatActivity {

    private SharedPreferences preferences;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select__destination);
        preferences = PreferenceManager.getDefaultSharedPreferences(this);
        editor = preferences.edit();
    }

    public void hotel_baguio(View view){
        preferences = PreferenceManager.getDefaultSharedPreferences(this);
        editor = preferences.edit();
        editor.putString("destination", "Baguio");
        editor.commit();
        editor.apply();
        Intent intent2 = new Intent(this, Baguio.class);
        startActivity(intent2);
    }

    public void hotel_pampanga(View view){
        preferences = PreferenceManager.getDefaultSharedPreferences(this);
        editor = preferences.edit();
        editor.putString("destination", "Pampanga");
        editor.commit();
        editor.apply();
        Intent intent2 = new Intent(this, Pampanga.class);
        startActivity(intent2);
    }

    public void hotel_laguna(View view){
        preferences = PreferenceManager.getDefaultSharedPreferences(this);
        editor = preferences.edit();
        editor.putString("destination", "Laguna");
        editor.commit();
        editor.apply();
        Intent intent2 = new Intent(this, Laguna.class);
        startActivity(intent2);
    }

    public void hotel_cebu(View view){
        preferences = PreferenceManager.getDefaultSharedPreferences(this);
        editor = preferences.edit();
        editor.putString("destination", "Cebu");
        editor.commit();
        editor.apply();
        Intent intent2 = new Intent(this, Cebu.class);
        startActivity(intent2);
    }
}
