package com.atvss.marvellist.data
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Hero: Serializable {
    @SerializedName("name")
    var name: String

    @SerializedName("realname")
    var realName: String? = null

    @SerializedName("imageurl")
    var imageUrl: String? = null

    @SerializedName("createdby")
    var createdBy: String? = null

    constructor(name: String) {
        this.name = name
    }

    constructor(name: String, realName: String?, imageUrl: String?, createdBy: String?) {
        this.name = name
        this.realName = realName
        this.imageUrl = imageUrl
        this.createdBy = createdBy
    }
}