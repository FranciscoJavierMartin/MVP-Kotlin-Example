package com.example.mvpkotlin.network

import com.example.mvpkotlin.model.Post
import io.reactivex.Observable
import retrofit2.http.GET

interface PostApi{

    @GET("/posts")
    fun getPosts(): Observable<List<Post>>
}