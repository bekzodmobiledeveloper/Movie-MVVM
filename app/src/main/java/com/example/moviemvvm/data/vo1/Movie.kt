package com.example.moviemvvm.data.vo1

import com.google.gson.annotations.SerializedName

data class Movie(
    val id:Int,
    @SerializedName("poster_path")
    val posterPath: String,
    @SerializedName("release_date")
    val releaseDate:String,
    val title:String
)
