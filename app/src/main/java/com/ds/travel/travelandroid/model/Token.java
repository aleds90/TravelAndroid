package com.ds.travel.travelandroid.model;

import java.io.Serializable;

/**
 * Created by estia on 14/10/16.
 */
public class Token implements Serializable{

    private String access_token;
    private String refresh_token;

    public Token(String refresh_token, String access_token) {
        this.refresh_token = refresh_token;
        this.access_token = access_token;
    }

    public Token(){}

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }
}
