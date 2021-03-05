package dev.fultz.scryfall.network.responses

import com.google.gson.annotations.SerializedName
import dev.fultz.scryfall.network.model.ScryfallDto

data class ScryfallSearchResponse (
    @SerializedName("total_cards")
    var total_cards: Int,

    @SerializedName("results")
    var cards: List<ScryfallDto>,

    @SerializedName("name")
    var name: String,

    )