package com.myinfosysprogram.adapter

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.myinfosysprogram.R
import com.myinfosysprogram.databinding.ItemHomeRvBinding
import com.myinfosysprogram.model.response.Rows

class ListDataViewHolder(private val itemHomeRvBinding: ItemHomeRvBinding) :
    RecyclerView.ViewHolder(itemHomeRvBinding.root) {

    fun bind(res: Rows, context: Context?) {
        itemHomeRvBinding.titleTv.text = (res.title)
        itemHomeRvBinding.descTv.text = (res.description)

        var imgPath = res.imageHref?:""
        if (imgPath.isEmpty()) {
            itemHomeRvBinding.newsIv.visibility = View.GONE
        } else {
            itemHomeRvBinding.newsIv.visibility = View.VISIBLE
            if (imgPath.contains("http:"))
                imgPath = imgPath.replace("http", "https")

            if (context != null) {
                Glide.with(context).load(imgPath).placeholder(R.drawable.placeholder)
                    .into(itemHomeRvBinding.newsIv)
            } else {
                itemHomeRvBinding.newsIv.visibility = View.GONE
            }
        }
    }
}