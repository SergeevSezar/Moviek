package movieapp.moviek.data.repository

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import movieapp.moviek.data.database.MovieAppDatabase
import movieapp.moviek.data.mapper.MovieMapper
import movieapp.moviek.data.network.ApiFactory
import movieapp.moviek.data.network.ApiService
import movieapp.moviek.domain.Movie
import movieapp.moviek.domain.MovieRepository

class MovieRepositoryImpl(application: Application): MovieRepository {

    private val movieInfoDao = MovieAppDatabase.getInstance(application).movieInfoDao()
    private val mapper = MovieMapper()
    private val apiService = ApiFactory.apiService

    override fun getMovieList(): LiveData<List<Movie>> {
        return Transformations.map(movieInfoDao.getAllMovies()) { it ->
            it.map {
                mapper.mapDbModelToEntity(it)
            }
        }
    }

    override fun getMovie(id: Int): LiveData<Movie> {
        return Transformations.map(movieInfoDao.getMovieInfo(id)) {
            mapper.mapDbModelToEntity(it)
        }
    }

    override fun loadData() {
        val popularMovies = apiService.getPopularMovieList(page = 1)
    }
}