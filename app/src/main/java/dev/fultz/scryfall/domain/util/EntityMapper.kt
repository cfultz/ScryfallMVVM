package dev.fultz.scryfall.domain.util

import android.content.Entity

interface EntityMapper <Entity, DomainModel> {

    fun mapFromEntity(entity: Entity):DomainModel

    fun mapToEntity(domainModel: DomainModel): Entity

}