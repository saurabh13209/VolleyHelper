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

        new PostRequest() {
            @Override
            void getResponse(String res) {
                Log.v("Tag",res);
            }

            @Override
            Map setParams() {
                return null;
            }
        }.Request(MainActivity.this , "");


    }
}
