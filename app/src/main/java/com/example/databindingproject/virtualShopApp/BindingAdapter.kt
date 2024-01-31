package com.example.databindingproject.virtualShopApp

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.databindingproject.R

@BindingAdapter("loadImage") //Class'ımızın bir databinding adapteri olduğunu belirttik.

//yazdığım fonksiyon url'i parametre olarak alır ve bu url'den gelen görüntüyü tanımlı imageView'e aktarır.
fun ImageView.loadImage(url: String?) {
    if (!url.isNullOrEmpty()) {
        //CircularProgressDrawable, resmin yüklenme sürecinde kullanıcının bir yükleniyor göstergesi görmesini sağlayan java class'ıdır.
        val circularProgressDrawable = CircularProgressDrawable(context).apply {
            strokeWidth = 8f
            centerRadius = 40f
            start()
        }
        val options = RequestOptions()
            .placeholder(circularProgressDrawable)
            .error(R.mipmap.ic_launcher_round)

        Glide.with(context)
            .setDefaultRequestOptions(options)
            .load(url).into(this)
        return
    }
    this.background=resources.getDrawable((R.mipmap.ic_launcher_round))
}