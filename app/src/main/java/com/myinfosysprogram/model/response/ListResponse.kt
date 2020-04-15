package com.myinfosysprogram.model.response

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore

@Entity
data class ListResponse(val title : String) {

    @Ignore
    val rows: List<Rows>? = null
}