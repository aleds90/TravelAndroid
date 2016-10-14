package com.ds.travel.travelandroid.service;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.ActivityCompat;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.ds.travel.travelandroid.activity.MainActivity;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by estia on 14/10/16.
 */
public class UrlFactory {

    public static final String URL_PREFIX   = "http://192.168.1.105:8080/TravelServices/";


}
