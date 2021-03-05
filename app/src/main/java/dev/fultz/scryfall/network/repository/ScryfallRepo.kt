package dev.fultz.scryfall.network.repository

import dev.fultz.scryfall.domain.Scryfall
import dev.fultz.scryfall.network.model.ScryfallDto

interface ScryfallRepo {
    suspend fun search ( page: Int, q: String): List<Scryfall>

    suspend fun get (id: String, name: String, oracle_text: String, png: String, set_name: String, q: String): Scryfall
}