package com.example.newnewproject.api.services


import com.example.newnewproject.api.ReqResData
import com.example.newnewproject.api.User
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ReqResService {
    @GET("users")
    fun getUsers(@Query("page") page: Int): Call<ReqResData<List<User>>>

    @GET("users/{id}")
    fun getUser(@Path("id") id: Long): Call<ReqResData<User>>
}