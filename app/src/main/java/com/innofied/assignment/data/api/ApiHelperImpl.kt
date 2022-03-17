package com.innofied.assignment.data.api

import com.innofied.assignment.data.model.Result
import retrofit2.Response
import javax.inject.Inject

class ApiHelperImpl @Inject constructor(private val apiService: ApiService) : ApiHelper {

    override suspend fun getUsers(page:Int): Response<Result> = apiService.getUsers(page)

}