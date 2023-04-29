package co.misw4203.grupo7.vinilos.models

import java.util.Date

data class Musician(
    override val id: Int,
    override val name: String,
    override val image: String,
    override val description: String,
    val birthDate: String
): Performer
