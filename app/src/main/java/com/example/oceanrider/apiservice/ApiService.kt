package com.example.oceanrider.apiservice

import com.example.oceanrider.model.Spot
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("appEksYm9WhIjEtus/Surf%20Destinations")
    suspend fun getSpots(): Response<MutableList<Spot>>

}