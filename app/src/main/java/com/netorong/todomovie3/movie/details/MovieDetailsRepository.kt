package com.netorong.todomovie3.movie.details

import androidx.lifecycle.LiveData
import com.netorong.todomovie3.data.api.repository.vo.MovieDetailsNetworkDataSource
import com.netorong.todomovie3.data.api.repository.vo.NetworkState
import com.netorong.todomovie3.data.api.repository.vo.TheMovieDBInterface
import io.reactivex.disposables.CompositeDisposable

class MovieDetailsRepository (private val apiService : TheMovieDBInterface) {

    private lateinit var movieDetailsNetworkDataSource: MovieDetailsNetworkDataSource

    fun fetchSingleMovieDetails (compositeDisposable: CompositeDisposable, movieId: Int) : LiveData<MovieDetails> {

        movieDetailsNetworkDataSource = MovieDetailsNetworkDataSource(apiService,compositeDisposable)
        movieDetailsNetworkDataSource.fetchMovieDetails(movieId)

        return movieDetailsNetworkDataSource.downloadedMovieResponse

    }

    fun getMovieDetailsNetworkState(): LiveData<NetworkState> {
        return movieDetailsNetworkDataSource.networkState
    }



}