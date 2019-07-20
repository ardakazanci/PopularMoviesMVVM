package com.ardakazanci.popularmoviesmvvm.data.remote

import com.ardakazanci.popularmoviesmvvm.util.Constants
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {

    fun getApiService(): ApiService {

        val retrofit = Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(getOkHttpClient()) // döndürülen nesneyi alıp retrofit ' te kullandık.
            .build()

        return retrofit.create(ApiService::class.java)

    }

    // Interceptor ' ü çağırıp , nesne döndürdük.
    private fun getOkHttpClient(): OkHttpClient {

        val client = OkHttpClient.Builder()
        client.addInterceptor(RequestInterceptor())
        return client.build()


    }

}