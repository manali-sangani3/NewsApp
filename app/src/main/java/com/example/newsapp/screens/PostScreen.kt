package com.example.newsapp.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.newsapp.viewmodel.PostViewModel

@Composable
fun PostScreen(viewModel: PostViewModel) {

    // no need for observeAsState, we're not using LiveData
    // we're using MutableStateOf

    // Any change in 'post' state var, it'll trigger an
    // automatic recomposition to this 'PostScreen' Composable
    val posts = viewModel.posts
    if (viewModel.isLoading) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            CircularProgressIndicator()
        }
    } else {
        PostList(posts = posts)
    }


}