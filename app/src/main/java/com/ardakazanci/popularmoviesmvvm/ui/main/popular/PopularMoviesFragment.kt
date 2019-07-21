package com.ardakazanci.popularmoviesmvvm.ui.main.popular


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager

import com.ardakazanci.popularmoviesmvvm.R
import com.ardakazanci.popularmoviesmvvm.common.BaseVMFragment
import com.ardakazanci.popularmoviesmvvm.ui.main.MovieAdapter
import com.ardakazanci.popularmoviesmvvm.util.gone
import com.ardakazanci.popularmoviesmvvm.util.visible
import kotlinx.android.synthetic.main.fragment_popular_movies.*

/**
 * DataBinding i olmayacak
 */
class PopularMoviesFragment : BaseVMFragment<PopularMoviesViewModel>() {


    private lateinit var adapter: MovieAdapter

    override fun getViewModel(): Class<PopularMoviesViewModel> = PopularMoviesViewModel::class.java

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_popular_movies, container, false)
    }

    // Normalde Fragment larda ViewTanımlama işlemi yaparken onCreateView içinde variable tanımlayarak yapardık.
    // direkt olarak id ' yi çağraraı yapıyoruz.
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = MovieAdapter()
        popular_recyclerview.layoutManager = GridLayoutManager(activity, 2)

        viewModel.getPopularMovies()?.observe(this, Observer {

            // Recyclerview işlemleri yapılacak

            adapter.submitList(it)
            popular_recyclerview.adapter = adapter
            popular_progressbar.gone()
            popular_recyclerview.visible()
        })

    }


}
