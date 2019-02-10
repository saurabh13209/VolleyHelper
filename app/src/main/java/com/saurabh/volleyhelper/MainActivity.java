package com.saurabh.volleyhelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.json.JSONObject;

import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new VolleyHelper() {
            @Override
            public void getResponse(String s) {

            }
        }.Request(MainActivity.this,"");
    }
}
