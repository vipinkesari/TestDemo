package com.myinfosysprogram.model.response

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

@Entity
data class ListResponse(@PrimaryKey val title: String = "") {

    @Ignore
    val rows: List<Rows>? = null
}