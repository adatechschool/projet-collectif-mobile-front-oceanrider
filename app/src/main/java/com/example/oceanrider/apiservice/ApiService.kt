package com.example.oceanrider.apiservice

import com.example.oceanrider.model.SurfResponse
import retrofit2.http.GET

interface ApiService {
    @GET("appEksYm9WhIjEtus/Surf%20Destinations")
    suspend fun getSurfSpots(): SurfResponse.SurfSpotsResponse

}