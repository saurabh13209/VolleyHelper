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

        new PostRequest() {
            @Override
            void getResponse(String res) {
                new JWT_Decoder() {
                    @Override
                    void getHeader(String head) {
                    }

                    @Override
                    void getBody(String body) throws Exception {
                        JSONObject jsonObject = new JSONObject(body);
                        Log.v("Tag",jsonObject.getString(""));
                    }
                }.Decode("");
            }

            @Override
            Map setParams() {
                return null;
            }
        }.Request(MainActivity.this , "");

    }
}
