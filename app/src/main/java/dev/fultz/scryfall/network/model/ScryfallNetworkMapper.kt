package dev.fultz.scryfall.network.model

import dev.fultz.scryfall.domain.Scryfall
import dev.fultz.scryfall.domain.util.EntityMapper

class ScryfallNetworkMapper : EntityMapper<ScryfallNetworkEntity, Scryfall> {
    override fun mapFromEntity(entity: ScryfallNetworkEntity): Scryfall {
        return Scryfall(
            q = entity.q,
            id = entity.id,
            name = entity.name,
            png = entity.png,
            oracle_text = entity.oracle_text,
            legalities = entity.legalities as ArrayList<String>?,
            set_name = entity.set_name
        )
    }

    override fun mapToEntity(domainModel: Scryfall): ScryfallNetworkEntity {
        return ScryfallNetworkEntity(
        q = domainModel.q,
        id = domainModel.id,
        name = domainModel.name,
        png = domainModel.png,
        oracle_text = domainModel.oracle_text,
        legalities = domainModel.legalities as ArrayList<String>?,
        set_name = domainModel.set_name
        )
    }

    fun toEntityList(initial: List<ScryfallNetworkEntity>): List<Scryfall>{
        return initial.map {mapFromEntity(it)}
    }
    fun fromEntityList(initial: List<Scryfall>): List<ScryfallNetworkEntity>{
        return initial.map {mapToEntity(it)}
    }

}