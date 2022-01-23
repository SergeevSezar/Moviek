package movieapp.moviek.data.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class MovieListDto(

    @SerializedName("results")
    @Expose
    val results: List<MovieInfoDto>
)
