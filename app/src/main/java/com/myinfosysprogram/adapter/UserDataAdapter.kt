package com.myinfosysprogram.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.myinfosysprogram.R
import com.myinfosysprogram.databinding.ItemUserRvBinding
import com.myinfosysprogram.interfaces.OnItemClickInterfaces
import com.myinfosysprogram.model.response.UserRows

class UserDataAdapter(
    private val item: ArrayList<UserRows>,
    context: Context,
    mInterface: OnItemClickInterfaces
) :
    RecyclerView.Adapter<UserDataViewHolder>(){

    private var ctx: Context? = null
    private var mInterface: OnItemClickInterfaces

    init {
        this.ctx = context
        this.mInterface = mInterface
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserDataViewHolder {
        val layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)
        val itemUserRvBinding: ItemUserRvBinding =
            DataBindingUtil.inflate(layoutInflater, R.layout.item_user_rv, parent, false)

        return UserDataViewHolder(
            itemUserRvBinding, mInterface
        )
    }

    override fun getItemCount(): Int {
        return if (item.size > 0) item.size else 0
    }

    override fun onBindViewHolder(holder: UserDataViewHolder, position: Int) {
        holder.bind(item[position], ctx)
    }
}