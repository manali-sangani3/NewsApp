package com.example.newsapp.screens

import androidx.compose.runtime.Composable
import com.example.newsapp.viewmodel.PostViewModel

@Composable
fun PostScreen(viewModel: PostViewModel){

    // no need for observeAsState, we're not using LiveData
    // we're using MutableStateOf

    // Any change in 'post' state var, it'll trigger an
    // automatic recomposition to this 'PostScreen' Composable
    val posts = viewModel.posts
    PostList(posts = posts)


}