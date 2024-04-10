package com.example.wewatch.API

import com.example.wewatch.Model.SearchResponse
import retrofit2.http.GET
import retrofit2.http.Query

private const val TAG = "ClientAPI"
interface ClientAPI {
    @GET("/")
    suspend fun fetchResponse(@Query("apikey") api_key: String, @Query("s") s: String): SearchResponse
}