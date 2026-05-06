package com.example.newsapp.repository

import com.example.newsapp.retrofit.Post
import com.example.newsapp.retrofit.RetrofitInstance

class PostRepository {

    // Repository: Acts as a mediator between
    // the data source(network API) & the ViewModel

    private val apiService = RetrofitInstance.api


    suspend fun getPosts(): List<Post>{
        return apiService.getPosts()
    }

}