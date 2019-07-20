package com.ardakazanci.popularmoviesmvvm.data.remote

import com.ardakazanci.popularmoviesmvvm.util.Constants
import okhttp3.Interceptor
import okhttp3.Response


/**
 * Her defasında URL ' nin sonuna api key geleceği için bir Interceptor tanımladık.
 * Her defasında yazdırmak yerine Interceptor aracılığıyla istek URL ' ni düzenledik.
 */

class RequestInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {

        val originalRequest = chain.request() // Api-Key ' siz request

        val originalHttpUrl = originalRequest.url

        val url = originalHttpUrl.newBuilder()
            .addQueryParameter("api_key", Constants.API_KEY)
            .build()

        val request = originalRequest.newBuilder().url(url).build()

        return chain.proceed(request)


    }


}