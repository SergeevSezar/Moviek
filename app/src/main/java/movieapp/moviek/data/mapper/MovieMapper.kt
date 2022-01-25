package movieapp.moviek.data.mapper

import movieapp.moviek.data.database.MovieDbModel
import movieapp.moviek.data.network.model.MovieInfoDto
import movieapp.moviek.domain.Movie

class MovieMapper {

    fun mapDtoToDbModel(dto: MovieInfoDto):MovieDbModel {
        return MovieDbModel(
            id = dto.id,
            title = dto.title,
            originalTitle = dto.originalTitle,
            overView = dto.overview,
            posterPath = dto.posterPath,
            backDropPath = dto.backdropPath,
            releaseDate = dto.releaseDate,
            voteCount = dto.voteCount,
            voteAverage = dto.voteAverage
        )
    }

    fun mapDbModelToEntity(dbModel: MovieDbModel): Movie {
        return Movie(
            id = dbModel.id,
            title = dbModel.title,
            originalTitle = dbModel.originalTitle,
            overView = dbModel.overView,
            posterPath = dbModel.posterPath,
            backDropPath = dbModel.backDropPath,
            releaseDate = dbModel.releaseDate,
            voteCount = dbModel.voteCount,
            voteAverage = dbModel.voteAverage
        )
    }
}