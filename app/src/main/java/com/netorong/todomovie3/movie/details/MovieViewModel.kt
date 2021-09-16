package com.netorong.todomovie3.movie.details

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.netorong.todomovie3.data.api.repository.vo.NetworkState
import io.reactivex.disposables.CompositeDisposable

class MovieViewModel (private val movieRepository : MovieDetailsRepository, movieId: Int)  : ViewModel() {

    private val compositeDisposable = CompositeDisposable()

    val  movieDetails : LiveData<MovieDetails> by lazy {
        movieRepository.fetchSingleMovieDetails(compositeDisposable,movieId)
    }

    val networkState : LiveData<NetworkState> by lazy {
        movieRepository.getMovieDetailsNetworkState()
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }



}