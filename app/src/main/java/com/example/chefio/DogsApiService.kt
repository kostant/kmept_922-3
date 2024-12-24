package com.example.chefio

import retrofit2.Call
import retrofit2.http.GET



interface DogsApiService {
    @GET("api/facts")
    fun dogsFacts(): Call<DogsFactsResponce>
}

class DogsFactsResponce(val facts: Array<String>, val success: Boolean) {

}
