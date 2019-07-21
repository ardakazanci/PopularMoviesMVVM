package com.ardakazanci.popularmoviesmvvm.ui.main.popular

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.ardakazanci.popularmoviesmvvm.model.movie.MovieResults
import com.ardakazanci.popularmoviesmvvm.ui.main.MainRepository

class PopularMoviesViewModel : ViewModel() {

    private val repository: MainRepository by lazy { MainRepository() }

    fun getPopularMovies(): LiveData<List<MovieResults>>? = repository.getPopularMovies()


}