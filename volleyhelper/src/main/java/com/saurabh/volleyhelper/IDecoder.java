/*
 * Created by Saurabh Agrawal on 11/2/19 9:19 AM
 *  Copyright (c) 2019 . All rights reserved.
 *  Last modified 10/2/19 6:08 PM
 */

package com.saurabh.volleyhelper;

public interface IDecoder {
    void decode(String response);

    void getBody(String body);

    void  getHead(String head);
}
