package com.saurabh.volleyhelper;

import android.content.Context;

public interface IGetRequest {

    void request(Context context, String URL);

    void getResponse(String res);
}
