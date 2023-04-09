package com.example.suivie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;
import android.window.SplashScreen;

public class IntroductoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introductory);

        getSupportActionBar().hide();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow().setStatusBarColor(getResources().getColor(R.color.white, this.getTheme()));
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(getResources().getColor(R.color.white));
        }
        TextView textView = findViewById(R.id.text);

        Thread thread = new Thread(){
            public void run(){
                try {
                    Thread.sleep(4000);
                }
                catch (Exception e){
                    e.printStackTrace();
                }

                finally {
                    Intent intent = new Intent(IntroductoryActivity.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        };
        thread.start();
    }
}