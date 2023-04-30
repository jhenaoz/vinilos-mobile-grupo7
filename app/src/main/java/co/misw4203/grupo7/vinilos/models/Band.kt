package co.misw4203.grupo7.vinilos.models

import java.util.Date

data class Band(
    override val id: Int,
    override val name: String,
    override val image: String,
    override val description: String,
    val creationDate: String): Performer
