package com.myinfosysprogram.model.response

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity (tableName = "list_rows")
class Rows {
    var title = ""
    var description = ""

    @ColumnInfo(name = "image_href")
    var imageHref: String? = ""
}