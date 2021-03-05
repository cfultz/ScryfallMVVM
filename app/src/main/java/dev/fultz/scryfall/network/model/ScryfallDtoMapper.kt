package dev.fultz.scryfall.network.model

import dev.fultz.scryfall.domain.Scryfall
import dev.fultz.scryfall.domain.util.DomainMapper

class ScryfallDtoMapper : DomainMapper<ScryfallDto, Scryfall> {
    override fun mapToDomainModel(model: ScryfallDto): Scryfall {
        return Scryfall(
            q = model.q,
            id = model.id,
            name = model.name,
            png = model.png,
            oracle_text = model.oracle_text,
            set_name = model.set_name
        )
    }

    override fun mapFromDomainModel(domainModel: Scryfall): ScryfallDto {
        return ScryfallDto(
        q = domainModel.q,
        id = domainModel.id,
        name = domainModel.name,
        png = domainModel.png,
        oracle_text = domainModel.oracle_text,
        set_name = domainModel.set_name
        )
    }

    fun ToDomainList(initial: List<ScryfallDto>): List<Scryfall>{
        return initial.map {mapToDomainModel(it)}
    }
    fun fromDomainList(initial: List<Scryfall>): List<ScryfallDto>{
        return initial.map {mapFromDomainModel(it)}
    }

}