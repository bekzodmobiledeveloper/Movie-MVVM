package com.example.moviemvvm.data.vo1


import com.google.gson.annotations.SerializedName

data class MovieResponse(
    val page: Int,
    @SerializedName("total_pages")
    val total_pages: Int,
    @SerializedName("total_results")
    val totalResults: Int,
    @SerializedName("results")
    val movieList: List<Movie>
)