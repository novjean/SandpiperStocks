package com.novatech.sandpiperstocks.data.remote

import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query

// https://www.alphavantage.co/documentation/

interface StockApi {

    @GET("query?function=LISTING_STATUS")
    suspend fun getListings(
        @Query("apikey") apiKey: String
    ) : ResponseBody

    companion object{
        const val API_KEY = "0HMW27LB7TDFYBZ7"
        const val BASE_URL = "https://alphavantage.co"
    }
}