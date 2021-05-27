package com.myinfosysprogram.adapter

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.myinfosysprogram.R
import com.myinfosysprogram.databinding.ItemUserRvBinding
import com.myinfosysprogram.interfaces.OnItemClickInterfaces
import com.myinfosysprogram.model.response.UserRows

class UserDataViewHolder(private val itemUserRvBinding: ItemUserRvBinding, mInterface: OnItemClickInterfaces) :
    RecyclerView.ViewHolder(itemUserRvBinding.root), View.OnClickListener {

    private var mInterface: OnItemClickInterfaces = mInterface

    fun bind(res: UserRows, context: Context?) {
        with(itemUserRvBinding) {
            titleTv.text = (res.name)
            companyNameTv.text = res.company?.name
            emailTv.text = res.email
            websiteTv.text = res.website

            res.address?.let {
                addressTv.text = "${it.suite}, ${it.street}, ${it.city}, ${it.zipcode}"
            }
            contactTv.text = res.phone
        }
        itemUserRvBinding.parentView.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.parentView -> {
                mInterface.onUserItemClick(adapterPosition)
            }
        }
    }
}