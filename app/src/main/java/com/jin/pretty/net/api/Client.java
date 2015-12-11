package com.jin.pretty.net.api;


import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;

/**
 * Created by Jin on 12/3/15.
 */
public class Client {
    public static final String BASE_URL = "https://api.github.com/";
    public static final Retrofit REQUEST = new Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .baseUrl(BASE_URL)
            .build();

    public static <T> T getService(Class<T> cls) {
        return REQUEST.create(cls);
    }
}
