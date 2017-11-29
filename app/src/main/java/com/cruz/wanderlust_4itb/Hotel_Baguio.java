package com.cruz.wanderlust_4itb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v4.content.SharedPreferencesCompat;

public class Hotel_Baguio extends AppCompatActivity {

    String hotelName;
    String hotelRate;
    String destination;
    private SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel__baguio);
        preferences = PreferenceManager.getDefaultSharedPreferences(this);
    }

    public void baguioactivity(View view){
        CheckBox hotel1Checkbox = (CheckBox)findViewById(R.id.checkBox);
        CheckBox hotel2Checkbox = (CheckBox)findViewById(R.id.checkBox3);
        CheckBox hotel3Checkbox = (CheckBox)findViewById(R.id.checkBox4);
        SharedPreferences.Editor editor = preferences.edit();
        if(hotel1Checkbox.isChecked()){
            editor.putString("hotelName", "Athena Rose's Hotel");
            editor.putString("hotelRate", "3000");
            editor.commit();
            editor.apply();
        }else if(hotel2Checkbox.isChecked()){
            editor.putString("hotelName", "Grand Forest Resort");
            editor.putString("hotelRate", "4000");
            editor.commit();
            editor.apply();
        }
        else if(hotel3Checkbox.isChecked()){
            editor.putString("hotelName", "Eden's Garden Hotel");
            editor.putString("hotelRate", "5000");
            editor.commit();
            editor.apply();
        }
        destination = preferences.getString("destination", "");
        editor.putString("destination", destination);
        Intent intent4 = new Intent(this, Activities_Baguio.class);
        startActivity(intent4);
    }




    public void hotelone(View view){
        Intent intent5 = new Intent(this, HotelOne.class);
        startActivity(intent5);
    }



    public void backtodestination(View view){
        Intent intent8 = new Intent(this, Baguio.class);
        startActivity(intent8);
    }

}
