package com.innofied.assignment.data.api

import com.innofied.assignment.data.model.Result
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("users/")
    suspend fun getUsers( @Query("page")page :Int): Response<Result>

}