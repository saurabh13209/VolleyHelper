package com.saurabh.volleyhelper;

public interface IDecoder {
    void decode(String response);

    void getBody(String body);

    void  getHead(String head);
}
