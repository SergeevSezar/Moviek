package movieapp.moviek.data.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface MovieInfoDao {
    @Query("SELECT * FROM movie_list")
    fun getAllMovies(): LiveData<List<MovieDbModel>>

    @Query("SELECT * FROM movie_list WHERE id == :id")
    fun getMovieInfo(id: Int): LiveData<MovieDbModel>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMovieList(movieList: List<MovieDbModel>)
}