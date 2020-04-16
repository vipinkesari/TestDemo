package com.myinfosysprogram.model.response

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "list_rows")
class Rows {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0

    var title: String? = ""

    var description: String? = ""

    @ColumnInfo(name = "image_href")
    var imageHref: String? = ""
}