package com.myinfosysprogram.model.response

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

@Entity(tableName = "user_rows")
class UserRows {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
    var name: String? = null
    var username: String? = null
    var email: String? = null

    @Ignore
    var address: Address? = null
    var phone: String? = null
    var website: String? = null

    @Ignore
    var company: Company? = null

    class Geo {
        var lat: String? = null
        var lng: String? = null
    }

    class Address {
        var street: String? = null
        var suite: String? = null
        var city: String? = null
        var zipcode: String? = null
        var geo: Geo? = null
    }

    class Company {
        var name: String? = null
        var catchPhrase: String? = null
        var bs: String? = null
    }
}