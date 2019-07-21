package com.ardakazanci.popularmoviesmvvm.binding

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.ardakazanci.popularmoviesmvvm.util.Constants
import com.bumptech.glide.Glide

object ImageBindingAdapter {

    @BindingAdapter("imageUrl")
    @JvmStatic
    fun loadImage(imageView: ImageView, url: String) {

        if (url.isNotEmpty()) {
            Glide.with(imageView.context)
                .load(Constants.IMAGE_BASE_URL + Constants.IMG_W342 + url)
                .into(imageView)
        }

    }

}