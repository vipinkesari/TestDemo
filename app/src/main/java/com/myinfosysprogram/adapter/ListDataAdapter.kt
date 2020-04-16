package com.myinfosysprogram.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.myinfosysprogram.R
import com.myinfosysprogram.databinding.ItemHomeRvBinding
import com.myinfosysprogram.model.response.Rows

class ListDataAdapter(private val item: ArrayList<Rows>, context: Context) :
    RecyclerView.Adapter<ListDataViewHolder>() {

    private var ctx: Context? = null

    init {
        this.ctx = context
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListDataViewHolder {
        val layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)
        val itemHomeRvBinding: ItemHomeRvBinding =
            DataBindingUtil.inflate(layoutInflater, R.layout.item_home_rv, parent, false)

        return ListDataViewHolder(
            itemHomeRvBinding
        )
    }

    override fun getItemCount(): Int {
        return if (item.size > 0) item.size else 0
    }

    override fun onBindViewHolder(holder: ListDataViewHolder, position: Int) {
        holder.bind(item[position], ctx)
    }
}