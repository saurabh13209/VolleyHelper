package com.saurabh.volleyhelper;

import android.util.Base64;

import java.io.UnsupportedEncodingException;

public abstract class JWT_Decoder {

    public void Decode(String res) {
        String[] split = res.split("\\.");
        getHeader(getJson(split[0]));
        try {
            getBody(getJson(split[1]));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    abstract void getHeader(String head);
    abstract void getBody(String body) throws Exception;

    private String getJson(String strEncoded) {
        byte[] decodedBytes = Base64.decode(strEncoded, Base64.URL_SAFE);
        try {
            return new String(decodedBytes, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

}
