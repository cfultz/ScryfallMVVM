package dev.fultz.scryfall.network.model

import com.google.gson.annotations.SerializedName

class ScryfallNetworkEntity (
        @SerializedName("q")
        var q: String? = null,
        @SerializedName("id")
        var id: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("png")
        var png: String? = null,
        @SerializedName("oracle_text")
        var oracle_text: String? = null,
        @SerializedName("legalitites")
        var legalities: List<String>? = null,
        @SerializedName("set_name")
        var set_name: String? = null
        )