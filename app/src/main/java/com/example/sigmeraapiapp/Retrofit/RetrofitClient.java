package com.example.sigmeraapiapp.Retrofit;

import com.example.sigmeraapiapp.Model.Post;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface RetrofitClient {
    @GET("posts")
    Observable<List<Post>> getPostfromWeb();
}
