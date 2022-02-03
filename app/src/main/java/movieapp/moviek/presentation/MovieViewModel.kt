package movieapp.moviek.presentation

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import movieapp.moviek.data.repository.MovieRepositoryImpl
import movieapp.moviek.domain.GetMovieListUseCase
import movieapp.moviek.domain.GetMovieUseCase
import movieapp.moviek.domain.LoadDataUseCase

class MovieViewModel(application: Application): AndroidViewModel(application) {

    private val repository = MovieRepositoryImpl(application)

    private val getMovieListUseCase = GetMovieListUseCase(repository)
    private val getMovieUseCase = GetMovieUseCase(repository)
    private val loadDataUseCase = LoadDataUseCase(repository)

    val movieList = getMovieListUseCase()
    fun getMovieInfo(id: Int) = getMovieUseCase(id)

    init {
        loadDataUseCase()
    }
}