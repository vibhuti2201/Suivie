package com.example.suivie;

import androidx.appcompat.app.AppCompatActivity;

import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class ShowSavedLocationList extends AppCompatActivity {

    ListView lv_savedLocations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_saved_location_list);

        getSupportActionBar().hide();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow().setStatusBarColor(getResources().getColor(R.color.dark_grey, this.getTheme()));
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(getResources().getColor(R.color.dark_grey));
        }

        lv_savedLocations = findViewById(R.id.lv_wayPoints);

        MyApplication myApplication = (MyApplication)getApplicationContext();
        List<Location> savedLocations = myApplication.getMyLocations();

        lv_savedLocations.setAdapter(new ArrayAdapter<Location>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,savedLocations));
    }
}