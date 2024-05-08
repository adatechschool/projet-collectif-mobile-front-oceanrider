package com.example.oceanrider.apiservice

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {
    private const val BASE_URL = "https://api.airtable.com/v0/"
//    private const val API_KEY = BuildConfig.API_KEY
    private val gson : Gson by lazy {
        GsonBuilder().setLenient().create()
    }

    private val client = OkHttpClient.Builder()
            .addInterceptor(Interceptor { chain ->
                val request = chain.request()
                    .newBuilder()
                    .addHeader("Authorization", "Bearer patwyiox2JC09U1wV.38d40b439459d865d84641a4e5964f7fd458cde499e4505abd213ef82cf314ee")
                    .build()
                chain.proceed(request)
            })
            .build()


    val apiService: ApiService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
            .create(ApiService::class.java)
    }


}