package com.example.suivie;

import android.app.Application;
import android.location.Location;

import java.util.ArrayList;
import java.util.List;

public class MyApplication extends Application {

    private  static  MyApplication singleton;

    private List<Location> myLocations;


    public void setMyLocations(List<Location> myLocations){
        this.myLocations = myLocations;
    }


    public static MyApplication getInstance(){
        return  singleton;
    }

    @Override
    public void onCreate(){
        super.onCreate();
        singleton=this;
        myLocations = new ArrayList<>();
    }

    public List<Location> getMyLocations() {

        this.myLocations =myLocations;
        return  myLocations;
    }
}
