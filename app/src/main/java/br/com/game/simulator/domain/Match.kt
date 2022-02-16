package br.com.game.simulator.domain

data class Match(
    val description: String,
    val place: Place,
    val homeTeam: Team,
    val AwayTeam: Team
)
