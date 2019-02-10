package com.saurabh.volleyhelper;

import android.content.Context;

import java.util.Map;

public interface IPostRequest {

    void request(Context context,String URL);

    void getResponse(String res);

    Map setParams();

    void onError(String err);
}
