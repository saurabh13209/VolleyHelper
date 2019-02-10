package com.saurabh.volleyhelper;

import android.content.Context;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import java.util.Map;

public abstract class GetRequest {
    public void Request(Context context, String URL){
        StringRequest postRequest = new StringRequest(Request.Method.GET, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                getResponse(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        RequestMaker.getInstance(context.getApplicationContext()).addToRequestQueue(postRequest);
    }

    abstract void getResponse(String res);
}
