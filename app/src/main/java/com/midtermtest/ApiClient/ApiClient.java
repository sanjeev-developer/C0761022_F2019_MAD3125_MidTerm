package com.midtermtest.ApiClient;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    public static final String BASE_URL = "http://www.mocky.io/v2/";
    private static Retrofit retrofit = null;

    public static Retrofit getRetrofit() {


