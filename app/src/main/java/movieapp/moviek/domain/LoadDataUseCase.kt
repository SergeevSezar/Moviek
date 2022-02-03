package movieapp.moviek.domain

class LoadDataUseCase(private val repository: MovieRepository) {

    operator fun invoke() = repository.loadData()
}