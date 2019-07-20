package com.ardakazanci.popularmoviesmvvm.model.videos

import com.google.gson.annotations.SerializedName

data class MovieVideoResponse(

    @SerializedName("id")
    var id: Int,

    @SerializedName("results")
    var results: List<MovieVideoResults>

)