package com.example.wewatch.API

import com.example.wewatch.Model.SearchResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

private const val TAG = "RetrofitInterface"
interface RetrofitInterface {
    @GET("/")
    fun searchMovie(@Query("apikey") api_key: String, @Query("s") s: String): Observable<SearchResponse>

}