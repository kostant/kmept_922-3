package com.example.chefio

import retrofit2.Call
import retrofit2.http.GET




interface DogsAppInterface {
    @GET("api/facts")
    fun dogFacts(): Call<DogsFactsResponse>
}
class DogsFactsResponse(val facts: Array<String>, val success: Boolean) {

}