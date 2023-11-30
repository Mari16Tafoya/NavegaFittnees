package com.mkiperszmid.travelguideai.home.domain.model

data class HomeFilterSettings(
    val people: Int = 1,
    val gimnasios: Boolean = false,
    val centros: Boolean = false
)
