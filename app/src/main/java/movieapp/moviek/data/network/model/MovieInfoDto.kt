package movieapp.moviek.data.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class MovieInfoDto(

    @SerializedName("id")
    @Expose
    val id: Int,

    @SerializedName("original_title")
    @Expose
    val originalTitle: String,

    @SerializedName("overview")
    @Expose
    val overview: String,

    @SerializedName("poster_path")
    @Expose
    val posterPath: String,

    @SerializedName("backdrop_path")
    @Expose
    val backdropPath: String,

    @SerializedName("release_date")
    @Expose
    val releaseDate: String,

    @SerializedName("title")
    @Expose
    val title: String,

    @SerializedName("vote_average")
    @Expose
    val voteAverage: Double,

    @SerializedName("vote_count")
    @Expose
    val voteCount: Int
)
