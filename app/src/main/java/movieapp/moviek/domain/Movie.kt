package movieapp.moviek.domain

data class Movie(
    val id: Int,
    val title: String,
    val originalTitle: String,
    val overView: String,
    val posterPath: String,
    val backDropPath: String,
    val releaseDate: String,
    val voteCount: Int,
    val voteAverage: Double,
)
