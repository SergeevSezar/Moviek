package movieapp.moviek.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [MovieDbModel::class], version = 1, exportSchema = false)
abstract class MovieAppDatabase: RoomDatabase() {
    companion object{
        private var db: MovieAppDatabase? = null
        private const val DB_NAME = "main.db"
        private val LOCK = Any()

        fun getInstance(context : Context) : MovieAppDatabase {
            synchronized(LOCK) {
                db?.let { return it }
                val instance = Room.databaseBuilder(
                    context,
                    MovieAppDatabase::class.java,
                    DB_NAME
                ).build()
                db = instance
                return instance
            }
        }
    }

    abstract fun movieInfoDao(): MovieInfoDao
}