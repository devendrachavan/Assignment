package com.innofied.assignment.data.repository

import com.innofied.assignment.data.api.ApiHelper
import javax.inject.Inject

class MainRepository @Inject constructor(private val apiHelper: ApiHelper) {

    suspend fun getUsers(page:Int) =  apiHelper.getUsers(page)

}