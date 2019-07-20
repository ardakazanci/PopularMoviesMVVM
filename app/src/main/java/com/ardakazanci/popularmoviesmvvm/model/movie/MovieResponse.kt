package com.ardakazanci.popularmoviesmvvm.model.movie

import com.google.gson.annotations.SerializedName

data class MovieResponse(

    @SerializedName("results")
    var results: List<MovieResults>

)