package com.jin.pretty.net.api;

import com.squareup.okhttp.RequestBody;

import retrofit.http.GET;
import retrofit.http.Multipart;
import retrofit.http.POST;
import retrofit.http.Part;
import retrofit.http.Path;
import rx.Observable;

/**
 * Created by Jin on 12/3/15.
 */
public interface DemoService {
    @GET("/users/{user}/repos")
    Observable<String> list(@Path("user") String user);

    @Multipart
    @POST("/users/upload")
    Observable<Object> uploadFile(@Part("userId") String user, @Part("images") RequestBody file);
}
