package com.saurabh.volleyhelper;

import android.util.Base64;

import java.io.UnsupportedEncodingException;

public abstract class JWT_Decoder implements IDecoder {
    @Override
    public void decode(String response) {
        String[] split = response.split("\\.");
        getHead(getJson(split[0]));
        try {
            getBody(getJson(split[1]));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

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
