package movieapp.moviek.presentation.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.squareup.picasso.Picasso
import movieapp.moviek.databinding.MoviePosterBinding
import movieapp.moviek.domain.Movie

class MovieInfoAdapter(
    private val context: Context
    ): ListAdapter<Movie, MovieInfoViewHolder>(MovieInfoDiffCallBack) {

        var onMoviePosterClickListener: OnMoviePosterClickListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieInfoViewHolder {
        val binding = MoviePosterBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieInfoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MovieInfoViewHolder, position: Int) {
        val movie = getItem(position)
        with(holder.binding) {
            with(movie) {
                Picasso.get().load(posterPath).into(ivMainPoster)
                root.setOnClickListener{
                    onMoviePosterClickListener?.onClick(movie)
                }
            }
        }
    }
}

interface OnMoviePosterClickListener {
    fun onClick(movieInfo: Movie)
}