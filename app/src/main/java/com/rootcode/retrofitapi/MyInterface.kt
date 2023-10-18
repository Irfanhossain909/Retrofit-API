package com.rootcode.retrofitapi

import retrofit2.http.GET

interface MyInterface {
    @GET("/quotes")
    suspend fun getQuoates():retrofit2.Response<QuateList>

}