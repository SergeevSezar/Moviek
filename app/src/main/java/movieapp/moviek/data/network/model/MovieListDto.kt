package movieapp.moviek.data.network.model

import com.google.gson.annotations.Expose

data class MovieListDto(
    val movieList: List<MovieInfoDto>
)
