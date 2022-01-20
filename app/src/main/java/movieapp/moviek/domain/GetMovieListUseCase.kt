package movieapp.moviek.domain

class GetMovieListUseCase(private val repository: MovieRepository) {

    operator fun invoke() = repository.getMovieList()
}