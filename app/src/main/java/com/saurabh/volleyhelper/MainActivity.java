package com.saurabh.volleyhelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new GetRequest() {
            @Override
            public void getResponse(String res) {
                Log.v("TAG_MAIN",res);
            }
        }.request(MainActivity.this , "https://gurukulpro.herokuapp.com/api/students");
    }
}
