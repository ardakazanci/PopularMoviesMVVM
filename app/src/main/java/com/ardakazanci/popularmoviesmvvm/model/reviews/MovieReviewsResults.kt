package com.ardakazanci.popularmoviesmvvm.model.reviews

import com.google.gson.annotations.SerializedName

data class MovieReviewsResults(

    @SerializedName("id")
    var id: String,

    @SerializedName("author")
    var author: String,

    @SerializedName("content")
    var content: String

)