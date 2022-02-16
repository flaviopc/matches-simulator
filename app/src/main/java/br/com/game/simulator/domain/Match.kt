package br.com.game.simulator.domain

import com.google.gson.annotations.SerializedName

data class Match(
    @SerializedName("descricao")
    val description: String,
    @SerializedName("local")
    val place: Place,
    @SerializedName("mandante")
    val homeTeam: Team,
    @SerializedName("visitante")
    val AwayTeam: Team
)
