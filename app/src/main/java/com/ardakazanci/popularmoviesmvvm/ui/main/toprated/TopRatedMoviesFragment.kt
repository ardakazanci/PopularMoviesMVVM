package com.ardakazanci.popularmoviesmvvm.ui.main.toprated


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.ardakazanci.popularmoviesmvvm.R

class TopRatedMoviesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_top_rated_movies, container, false)
    }


}
