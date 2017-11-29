package com.cruz.wanderlust_4itb;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import static com.cruz.wanderlust_4itb.R.id.textView;

public class Summary extends AppCompatActivity {

    private SharedPreferences preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
        preferences = PreferenceManager.getDefaultSharedPreferences(this);
        TextView dest = (TextView)findViewById(R.id.textView22);
        TextView act1 = (TextView)findViewById(R.id.textView14);
        TextView act2 = (TextView)findViewById(R.id.textView15);
        TextView act3 = (TextView)findViewById(R.id.textView16);
        TextView tv13 = (TextView)findViewById(R.id.textView13);
        TextView tv17 = (TextView)findViewById(R.id.textView17);
        String destination = preferences.getString("destination", "");
        dest.setText(destination);
        String temp001 = preferences.getString("act1Rate", "");
        String temp002 = preferences.getString("act2Rate", "");
        String temp003 = preferences.getString("act3Rate", "");
        String temp004 = preferences.getString("hotelRate", "");
        tv13.setText(preferences.getString("hotelName", ""));
        tv17.setText(preferences.getString("hotelRate", ""));
        int temp01 = Integer.parseInt(temp001);
        int temp02 = Integer.parseInt(temp002);
        int temp03 = Integer.parseInt(temp003);
        int temp04 = Integer.parseInt(temp004);
//
        int total = 0;
        total = (Integer)temp01 + temp02 + temp03 + temp04;
        String temp1, temp2, temp3;
        temp1 = preferences.getString("act1", "");
        temp2 = preferences.getString("act2", "");
        temp3 = preferences.getString("act3", "");

        act1.setText(temp1);
        act2.setText(temp2);
        act3.setText(temp3);
//
        TextView summary = (TextView)findViewById(R.id.summary);
        summary.setText(Integer.toString(total));


    }

    public void thankyou(View view){
        Intent intent6 = new Intent(this, Thanks.class);
        startActivity(intent6);

    }



    public void gotoactivities(View view){
        Intent intent7 = new Intent(this, Activities_Baguio.class);
        startActivity(intent7);

    }
}
