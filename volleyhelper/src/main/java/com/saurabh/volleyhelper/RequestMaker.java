package com.saurabh.volleyhelper;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class RequestMaker {

    private static Context ctxt;
    private RequestQueue requestQueue;
    private static RequestMaker mySending;

    private RequestMaker(Context context) {
        ctxt = context;
        requestQueue = getRequestQueue();
    }

    public RequestQueue getRequestQueue() {
        if (requestQueue == null) {
            requestQueue = Volley.newRequestQueue(ctxt.getApplicationContext());
        }
        return requestQueue;
    }

    public static synchronized RequestMaker getInstance(Context context) {
        if (mySending == null) {
            mySending = new RequestMaker(context);
        }
        return mySending;
    }

    public <T> void addToRequestQueue(Request<T> request) {
        getRequestQueue().add(request);
    }

}
