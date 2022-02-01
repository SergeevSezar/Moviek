package movieapp.moviek.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import movieapp.moviek.databinding.ActivityMovieListBinding
import movieapp.moviek.domain.Movie
import movieapp.moviek.presentation.adapter.MovieInfoAdapter

class MovieListActivity : AppCompatActivity() {
    private lateinit var viewModel: MovieViewModel

    private val binding by lazy {
        ActivityMovieListBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val adapter = MovieInfoAdapter(this)
        adapter.onMoviePosterClickListener = object: MovieInfoAdapter.OnMoviePosterClickListener {
            override fun onClick(movieInfo: Movie) {
                TODO("Not yet implemented")
            }
        }
        binding.rvPoster.adapter = adapter

        viewModel = ViewModelProvider.AndroidViewModelFactory(application).create(MovieViewModel::class.java)
        viewModel.movieList.observe(this) {
            adapter.submitList(it)
        }
    }
}