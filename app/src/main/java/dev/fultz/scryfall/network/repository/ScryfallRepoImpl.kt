package dev.fultz.scryfall.network.repository

import dev.fultz.scryfall.domain.Scryfall
import dev.fultz.scryfall.network.ScryfallService
import dev.fultz.scryfall.network.model.ScryfallDtoMapper

class ScryfallRepoImpl (
    private val scryfallService: ScryfallService,
    private val mapper: ScryfallDtoMapper
): ScryfallRepo {
    override suspend fun search(page: Int, q: String): List<Scryfall> {
        return mapper.ToDomainList(scryfallService.search(q).cards)
    }

    override suspend fun get(
        id: String,
        name: String,
        oracle_text: String,
        png: String,
        set_name: String,
        q: String
    ): Scryfall {
        TODO()
    }


}



