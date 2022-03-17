package com.innofied.assignment.data.api

import com.innofied.assignment.data.model.Result
import retrofit2.Response

interface ApiHelper {

    suspend fun getUsers(page:Int): Response<Result>
}