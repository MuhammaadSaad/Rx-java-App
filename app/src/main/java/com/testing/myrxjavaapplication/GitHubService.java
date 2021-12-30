package com.testing.myrxjavaapplication;

import android.database.Observable;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Muhammad Saad Siddique on 12/30/2021.
 */
public interface GitHubService {
    @GET("users/{user}/starred")
    Observable<List<GitHubRepo>> getStarredRepositories(@Path("user") String userName);
}
