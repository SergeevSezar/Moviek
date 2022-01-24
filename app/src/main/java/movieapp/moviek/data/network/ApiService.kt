package movieapp.moviek.data.network

import io.reactivex.rxjava3.core.Single
import movieapp.moviek.data.network.model.MovieListDto
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("popular")
    fun getPopularMovieList(
        @Query(QUERY_PARAM_API_KEY) apiKey: String = "485fbc212ab76526edb2699c29b0657d",
        @Query(QUERY_PARAM_LANGUAGE) language: String = "ru-RU",
        @Query(QUERY_PARAM_PAGE) page: Int = 1
    ): Single<MovieListDto>

    @GET("top_rated")
    fun getTopRatedMovieList(
        @Query(QUERY_PARAM_API_KEY) apiKey: String = "485fbc212ab76526edb2699c29b0657d",
        @Query(QUERY_PARAM_LANGUAGE) language: String = "ru-RU",
        @Query(QUERY_PARAM_PAGE) page: Int = 1
    ): Single<MovieListDto>

    companion object{
        private const val QUERY_PARAM_API_KEY = "api_key"
        private const val QUERY_PARAM_LANGUAGE = "language"
        private const val QUERY_PARAM_PAGE = "page"
    }
}