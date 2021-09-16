package com.netorong.todomovie3.movie.details

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.netorong.todomovie3.R

class MovieDetails : AppCompatActivity() {

    private lateinit var viewModel: MovieViewModel
    private lateinit var movieRepository: MovieDetailsRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie)
    }
}
