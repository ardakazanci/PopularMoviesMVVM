package com.ardakazanci.popularmoviesmvvm.ui.main

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.ardakazanci.popularmoviesmvvm.data.remote.ApiClient
import com.ardakazanci.popularmoviesmvvm.data.remote.ApiService
import com.ardakazanci.popularmoviesmvvm.model.movie.MovieResponse
import com.ardakazanci.popularmoviesmvvm.model.movie.MovieResults
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainRepository {

    private val apiService: ApiService by lazy { ApiClient.getApiService() }

    fun getPopularMovies(): LiveData<List<MovieResults>>? {

        val moviesLiveData: MutableLiveData<List<MovieResults>> = MutableLiveData()

        apiService.getPopularMovies().enqueue(object : Callback<MovieResponse> {
            override fun onFailure(call: Call<MovieResponse>, t: Throwable) {
                Log.e("getPopularMovies:", t.message)
            }

            override fun onResponse(call: Call<MovieResponse>, response: Response<MovieResponse>) {

                moviesLiveData.value = response.body()?.results

            }


        })

        return moviesLiveData

    }

    fun getTopRatedMovies() {

    }

}