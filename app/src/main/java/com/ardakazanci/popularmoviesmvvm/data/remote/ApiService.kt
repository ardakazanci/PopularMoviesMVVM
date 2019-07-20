package com.ardakazanci.popularmoviesmvvm.data.remote

import com.ardakazanci.popularmoviesmvvm.model.detail.MovieDetailResponse
import com.ardakazanci.popularmoviesmvvm.model.movie.MovieResponse
import com.ardakazanci.popularmoviesmvvm.model.reviews.MovieReviewResponse
import com.ardakazanci.popularmoviesmvvm.model.videos.MovieVideoResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    // Popular
    @GET("movie/popular")
    fun getPopularMovies(): Call<MovieResponse>

    // Top Rated
    @GET("movie/top_rated")
    fun getTopRatedMovies(): Call<MovieResponse>

    // Details
    @GET("movie/{id}")
    fun getMovieDetails(@Path("id") movieId: Int): Call<MovieDetailResponse>

    // Videos
    @GET("movie/{id}/videos")
    fun getMovieVideos(@Path("id") movieId: Int): Call<MovieVideoResponse>

    // Reviews
    @GET("movie/{id]/reviews")
    fun getMovieReviews(@Path("id") movieId: Int): Call<MovieReviewResponse>

}