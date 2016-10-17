package com.ds.travel.travelandroid.service;

import com.ds.travel.travelandroid.model.Token;

/**
 * Created by estia on 14/10/16.
 */
public class UrlFactory {

    public static final String URL_PREFIX   = "http://192.168.1.104:8080/TravelServices/";

    public static String urlLogin(String username, String password){
        String url = UrlFactory.URL_PREFIX + "oauth/token?grant_type=password&client_id=restapp&client_secret=restapp&username="+username+"&password="+password;
        return url;
    }

    public static String urlRefresh(Token token){
        String url = UrlFactory.URL_PREFIX + "oauth/token?grant_type=refresh_token&client_id=restapp&client_secret=restapp&refresh_token="+token.getRefresh_token();
        return url;
    }

    public static String urlGetAllCategory(){
        String url = UrlFactory.URL_PREFIX + "category/";
        return url;
    }

    public static String urlGetCategoryByID(int id){
        String url = UrlFactory.URL_PREFIX + "category/"+id;
        return url;
    }

    public static String urlGetCategoryBySlug(String slug){
        String url = UrlFactory.URL_PREFIX + "category/byslug/"+slug;
        return url;
    }

    public static String urlGetAllCity(){
        String url = UrlFactory.URL_PREFIX + "city/";
        return url;
    }

    public static String urlGetCityByID(int id){
        String url = UrlFactory.URL_PREFIX + "city/"+id;
        return url;
    }

    public static String urlGetCityByCountry(String country){
        String url = UrlFactory.URL_PREFIX + "city/bycountry/"+country;
        return url;
    }
    public static String urlGetAllCountry(){
        String url = UrlFactory.URL_PREFIX + "country/";
        return url;
    }

    public static String urlGetCountryByCode(String code){
        String url = UrlFactory.URL_PREFIX + "country/"+code;
        return url;
    }

    public static String urlGetCountryByUser(int id){
        String url = UrlFactory.URL_PREFIX + "country/byuser/"+id;
        return url;
    }

    public static String urlInsertCountryUser(){
        String url = UrlFactory.URL_PREFIX + "countryUser/";
        return url;
    }

    public static String urlUpdateCountryUser(int id){
        String url = UrlFactory.URL_PREFIX + "countryUser/"+id;
        return url;
    }

    public static String urlDeleteCountryUser(int id){
        String url = UrlFactory.URL_PREFIX + "countryUser/"+id;
        return url;
    }

    public static String urlGetAllStage(){
        String url = UrlFactory.URL_PREFIX + "stage/";
        return url;
    }

    public static String urlGetStageByID(int id){
        String url = UrlFactory.URL_PREFIX + "stage/"+id;
        return url;
    }

    public static String urlGetStageByTravel(int id){
        String url = UrlFactory.URL_PREFIX + "stage/bytravel/"+id;
        return url;
    }

    public static String urlInsertStage(){
        String url = UrlFactory.URL_PREFIX + "stage/";
        return url;
    }

    public static String urlUpdateStage(int id){
        String url = UrlFactory.URL_PREFIX + "stage/"+id;
        return url;
    }

    public static String urlGetAllTag(){
        String url = UrlFactory.URL_PREFIX + "tag/";
        return url;
    }

    public static String urlGetTagByID(int id){
        String url = UrlFactory.URL_PREFIX + "tag/"+id;
        return url;
    }

    public static String urlGetTagByName(String name){
        String url = UrlFactory.URL_PREFIX + "tag/byname/"+name;
        return url;
    }

    public static String urlGetTagByTravel(int id){
        String url = UrlFactory.URL_PREFIX + "tag/bytravel/"+id;
        return url;
    }

    public static String urlInsertTag(){
        String url = UrlFactory.URL_PREFIX + "tag/";
        return url;
    }

    public static String urlGetTargetByID(int id){
        String url = UrlFactory.URL_PREFIX + "target/"+id;
        return url;
    }

    public static String urlGetAllTarget(){
        String url = UrlFactory.URL_PREFIX + "target/";
        return url;
    }

    public static String urlGetAllTravel(){
        String url = UrlFactory.URL_PREFIX + "travel/";
        return url;
    }

    public static String urlGetTravelByID(int id){
        String url = UrlFactory.URL_PREFIX + "travel/"+id;
        return url;
    }

    public static String urlInsertTravel(){
        String url = UrlFactory.URL_PREFIX + "travel/";
        return url;
    }

    public static String urlUpdateTravel(int id){
        String url = UrlFactory.URL_PREFIX + "travel/"+id;
        return url;
    }

    public static String urlGetTravelByProperties(String budget, String place, String category){
        if (budget!=null && !budget.equals("")){
            budget = "999999";
        }
        if (place == null){
            place = "";
        }
        if (category == null){
            category = "";
        }
        String url = UrlFactory.URL_PREFIX + "travel/search?budget="+budget+"&place="+place+"&category="+category;
        return url;
    }

    public static String urlGetTravelByUser(int id){
        String url = UrlFactory.URL_PREFIX + "travel/byuser/"+id;
        return url;
    }

    public static String urlGetAllUser(){
        String url = UrlFactory.URL_PREFIX + "user/";
        return url;
    }

    public static String urlGetUserByID(int id){
        String url = UrlFactory.URL_PREFIX + "user/"+id;
        return url;
    }

    public static String urlInsertUser(){
        String url = UrlFactory.URL_PREFIX + "user/";
        return url;
    }

    public static String urlUpdateUser(int id){
        String url = UrlFactory.URL_PREFIX + "user/" + id;
        return url;
    }
}
