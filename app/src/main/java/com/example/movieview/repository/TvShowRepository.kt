package com.example.movieview.repository

import com.example.movieview.api.ApiService
import javax.inject.Inject

class TvShowRepository
@Inject
constructor(private val apiService: ApiService) {
    suspend fun getTvShows() = apiService.getTvShows()
}