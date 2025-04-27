package com.example.chefio

import retrofit2.Call
import retrofit2.http.GET




interface WhatDaDogDoin {

    @GET("api/facts")
    fun DogDoin(): Call<DogsFactsResponse>

}

class DogsFactsResponse(val facts: Array<String>, val success: Boolean) {

}