package com.example.movieview.api


import com.example.movieview.helper.Constants
import com.example.movieview.Models.TvShowResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService
{
    @GET(Constants.END_POINT)
    suspend fun getTvShows():Response<TvShowResponse>
}