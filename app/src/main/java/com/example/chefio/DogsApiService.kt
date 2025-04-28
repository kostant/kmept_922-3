package com.example.chefio

import retrofit2.Call
import retrofit2.http.GET
// https://dog-api.kinduff.com/api/facts
public interface DogsApiService {
    @GET("api/facts")
    fun DogsFacts(): Call<DogsFactsResponse>
}

class DogsFactsResponse(val facts: Array<String>, val success: Boolean) {

}