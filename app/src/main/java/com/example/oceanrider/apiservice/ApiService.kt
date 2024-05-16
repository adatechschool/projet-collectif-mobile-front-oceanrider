package com.example.oceanrider.apiservice

import com.example.oceanrider.model.SurfResponse
import retrofit2.http.GET

interface ApiService {
    @GET("api/spots")
    suspend fun getSurfSpots(): SurfResponse.SurfSpotsResponse

}