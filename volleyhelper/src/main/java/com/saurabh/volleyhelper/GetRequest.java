/*
 * Created by Saurabh Agrawal on 11/2/19 9:19 AM
 *  Copyright (c) 2019 . All rights reserved.
 *  Last modified 11/2/19 9:07 AM
 */

package com.saurabh.volleyhelper;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;


public abstract class GetRequest implements IGetRequest {
    @Override
    public void request(Context context, String URL) {
        StringRequest stringRequest = new StringRequest(Request.Method.GET, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                getResponse(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                onError(error.toString());
            }
        });
        RequestMaker.getInstance(context).addToRequestQueue(stringRequest);
    }
}