package com.myinfosysprogram.adapter

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.myinfosysprogram.R
import com.myinfosysprogram.databinding.ItemHomeRvBinding
import com.myinfosysprogram.model.response.PhotoRows
import com.squareup.picasso.Picasso

class ListDataViewHolder(private val itemHomeRvBinding: ItemHomeRvBinding) :
    RecyclerView.ViewHolder(itemHomeRvBinding.root) {

    fun bind(res: PhotoRows, context: Context?) {
        itemHomeRvBinding.titleTv.text = (res.title)

        var imgPath = res.thumbnailUrl?:""
        if (imgPath.isNotEmpty()) {
            itemHomeRvBinding.photoIv.visibility = View.VISIBLE
            if (imgPath.contains("http:"))
                imgPath = imgPath.replace("http", "https")
            if (context != null) {
                Picasso.get()
                    .load(imgPath)
                    .placeholder(R.drawable.placeholder)
                    .error(R.drawable.placeholder)
                    .into(itemHomeRvBinding.photoIv);
            }
        }
    }
}