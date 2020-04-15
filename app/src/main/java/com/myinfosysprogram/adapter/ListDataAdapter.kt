package com.myinfosysprogram.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.myinfosysprogram.R
import com.myinfosysprogram.databinding.ItemHomeRvBinding
import com.myinfosysprogram.model.response.Rows

class ListDataAdapter(private val item: ArrayList<Rows>, context: Context) :
    RecyclerView.Adapter<ListDataAdapter.ViewHolder>() {

    var ctx: Context? = null

    init {
        this.ctx = context
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)
        val itemHomeRvBinding: ItemHomeRvBinding =
            DataBindingUtil.inflate(layoutInflater, R.layout.item_home_rv, parent, false)

        return ViewHolder(
            itemHomeRvBinding
        )
    }

    override fun getItemCount(): Int {
        return if (item.size > 0) item.size else 0
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(item.get(position), ctx)
    }

    class ViewHolder(private val itemHomeRvBinding: ItemHomeRvBinding) :
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

}