package com.ardakazanci.popularmoviesmvvm.model.reviews

import com.google.gson.annotations.SerializedName

data class MovieReviewResponse(

    @SerializedName("id")
    var id: Int,

    @SerializedName("results")
    var results: List<MovieReviewsResults>

)