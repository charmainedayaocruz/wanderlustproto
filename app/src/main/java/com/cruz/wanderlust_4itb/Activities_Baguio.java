package com.cruz.wanderlust_4itb;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class Activities_Baguio extends AppCompatActivity {

    private SharedPreferences preferences;
    String destination, hotelName, hotelRate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activities_baguio);
        preferences = PreferenceManager.getDefaultSharedPreferences(this);


    }

    public void summary(View view){
        CheckBox act1Checkbox = (CheckBox)findViewById(R.id.checkBox2);
        CheckBox act2Checkbox = (CheckBox)findViewById(R.id.checkBox5);
        CheckBox act3Checkbox = (CheckBox)findViewById(R.id.checkBox6);

        SharedPreferences.Editor editor = preferences.edit();

        if(act1Checkbox.isChecked()){
            editor.putString("act1", "HorseBack Riding");
            editor.putString("act1Rate", "150");
            editor.commit();
            editor.apply();
        }
        else{
            editor.putString("act1", "");
            editor.putString("act1Rate", "0");
            editor.commit();
            editor.apply();
        }
        if(act2Checkbox.isChecked()){
            editor.putString("act2", "Boat Ride");
            editor.putString("act2Rate", "250");
            editor.commit();
            editor.apply();
        }
        else{
            editor.putString("act2", "");
            editor.putString("act2Rate", "0");
            editor.commit();
            editor.apply();
        }
        if(act3Checkbox.isChecked()){
            editor.putString("act3", "Local Museum");
            editor.putString("act3Rate", "200");
            editor.commit();
            editor.apply();
        }
        else{
            editor.putString("act3", "");
            editor.putString("act3Rate", "0");
            editor.commit();
            editor.apply();
        }
        Intent intent5 = new Intent(this, Summary.class);
        startActivity(intent5);
    }

    public void gotoactivityone(View view){
        Intent intent6 = new Intent(this, ActivityOne.class);
        startActivity(intent6);
    }



    public void gotohotels(View view){
        Intent intent7 = new Intent(this, Hotel_Baguio.class);
        startActivity(intent7);
    }

}
