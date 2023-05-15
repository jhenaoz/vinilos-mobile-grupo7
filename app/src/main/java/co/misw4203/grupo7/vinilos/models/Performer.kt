package co.misw4203.grupo7.vinilos.models

interface Performer {
    val id: Int
    val name: String
    val image: String
    val description: String
    val albums: List<Album>
}
