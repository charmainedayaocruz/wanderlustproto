package com.cruz.wanderlust_4itb;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Destination extends AppCompatActivity {

    private SharedPreferences preferences;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destination);
        preferences = PreferenceManager.getDefaultSharedPreferences(this);
        editor = preferences.edit();
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, "edited", duration);
        toast.show();
    }

    public void hotel_baguio(View view){
        preferences = PreferenceManager.getDefaultSharedPreferences(this);
        editor = preferences.edit();
        editor.putString("destination", "Baguio");
        editor.commit();
        editor.apply();

//        Intent intent2 = new Intent(this, Baguio.class);
  //      startActivity(intent2);
    }

    public void hotel_cebu(View view){
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("destination", "Cebu");
        editor.commit();
        editor.apply();
        Intent intent2 = new Intent(this, Baguio.class);
        startActivity(intent2);
    }

    public void hotel_laguna(View view){
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("destination", "Laguna");
        editor.commit();
        editor.apply();
        Intent intent2 = new Intent(this, Baguio.class);
        startActivity(intent2);
    }

    public void hotel_pampanga(View view){
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("destination", "Pampanga");
        editor.commit();
        editor.apply();
        Intent intent2 = new Intent(this, Baguio.class);
        startActivity(intent2);
    }
}
