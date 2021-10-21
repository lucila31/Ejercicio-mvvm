package dev.cardoso.quotesmvvm.core

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("http://192.168.42.29")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}