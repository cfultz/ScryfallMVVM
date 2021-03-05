package dev.fultz.scryfall.domain.util

import android.content.Entity

interface DomainMapper <T, DomainModel> {

    fun mapToDomainModel(model: T):DomainModel

    fun mapFromDomainModel(domainModel: DomainModel): T

}