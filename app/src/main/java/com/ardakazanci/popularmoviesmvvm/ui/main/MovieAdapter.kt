package com.ardakazanci.popularmoviesmvvm.ui.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.ardakazanci.popularmoviesmvvm.databinding.ItemMovieBinding
import com.ardakazanci.popularmoviesmvvm.model.movie.MovieResults

class MovieAdapter : ListAdapter<MovieResults, MovieAdapter.ViewHolder>(DIFF_CALLBACK) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder.create(LayoutInflater.from(parent.context), parent)


    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(getItem(position))


    class ViewHolder(val binding: ItemMovieBinding) : RecyclerView.ViewHolder(binding.root) {

        companion object {

            fun create(inflate: LayoutInflater, parent: ViewGroup): ViewHolder {

                val itemMovieBinding = ItemMovieBinding.inflate(inflate, parent, false)
                return ViewHolder(itemMovieBinding)

            }

        }

        //OnBindViewHolder için
        fun bind(movieResults: MovieResults) {

            binding.movie = movieResults
            binding.executePendingBindings()

        }

    }


    companion object {
        // Recyclerview ' i değişiklikten haberdar etmek için.
        val DIFF_CALLBACK = object : DiffUtil.ItemCallback<MovieResults>() {
            //objeler aynı mı değil mi
            override fun areItemsTheSame(oldItem: MovieResults, newItem: MovieResults): Boolean =
                oldItem.movieId == newItem.movieId

            // içerik aynı mı değil mi
            override fun areContentsTheSame(oldItem: MovieResults, newItem: MovieResults): Boolean =
                oldItem.title == newItem.title


        }

    }


}