/*
 * Created by Saurabh Agrawal on 11/2/19 9:19 AM
 *  Copyright (c) 2019 . All rights reserved.
 *  Last modified 10/2/19 5:42 PM
 */

package com.saurabh.volleyhelper;

import android.content.Context;

import java.util.Map;

public interface IPostRequest {

    void request(Context context,String URL);

    void getResponse(String res);

    Map setParams();

    void onError(String err);
}
