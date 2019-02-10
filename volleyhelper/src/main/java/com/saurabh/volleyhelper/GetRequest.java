package com.saurabh.volleyhelper;

import android.content.Context;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import java.util.Map;

interface GetRequest {
    void Request(Context context , String URL);

    void getResponse(String s);
}
