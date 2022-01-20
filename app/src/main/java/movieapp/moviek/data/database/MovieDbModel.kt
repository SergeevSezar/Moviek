package movieapp.moviek.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "movie_list")
data class MovieDbModel(
    @PrimaryKey(autoGenerate = true)
    val uniqueId: Int,
    val id: Int,
    val title: String,
    val originalTitle: String,
    val overView: String,
    val posterPath: String,
    val backDropPath: String,
    val releaseDate: String,
    val voteCount: Int,
    val voteAverage: Double,
    val bigPosterPath: String
)
