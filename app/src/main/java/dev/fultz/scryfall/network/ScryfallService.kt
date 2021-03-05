package dev.fultz.scryfall.network

import dev.fultz.scryfall.network.responses.ScryfallSearchResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ScryfallService {
    @GET(value = "cards/search")
    suspend fun search(
        @Query(value = "q") q: String,
    ): ScryfallSearchResponse

    @GET("cards/{id}")
    suspend fun get(
        @Path(value = "id") id: String,
    ): ScryfallSearchResponse


}