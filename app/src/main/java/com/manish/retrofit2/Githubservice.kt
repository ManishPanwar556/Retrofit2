package com.manish.retrofit2

import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Path

interface github{
    @GET("/users")
    suspend fun getAllusers():Response<List<User>>

    @GET("/user/{id}")
    suspend fun getone(@Path("id") id:String = "aggarwalpulkit596"):Response<List<User>>


}