package com.myinfosysprogram.model.response

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "list_rows")
class PhotoRows {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0

    var title: String? = ""

    var url: String? = ""

    var thumbnailUrl: String? = ""
}