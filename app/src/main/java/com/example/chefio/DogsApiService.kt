package com.example.chefio

import retrofit2.Call
import retrofit2.http.GET

interface DogsApiService {
    @GET("api/facts")
    fun dogsFacts(): Call<DogsFactsResponse>

}

class DogsFactsResponse(val facts: Array<String>, val success: Boolean){

}