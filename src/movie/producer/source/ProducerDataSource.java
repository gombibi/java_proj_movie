package movie.producer.source;

import java.util.ArrayList;

import com.fasterxml.jackson.core.type.TypeReference;

import movie.producer.data.Movie;
import movie.producer.data.MovieEntity;
import movie.utils.IOUtils;

public class ProducerDataSource {
	private static final String FILE_NAME = "movie.txt";

	public boolean addMovie(String title, int runningTime) {
		Movie movie = new Movie(title, runningTime, System.currentTimeMillis());
		MovieEntity entity = getDbEntity();
		ArrayList<Movie> movieList = entity.getMovies();
		movieList.add(movie);
		entity.setMovies(movieList);
		IOUtils.fileWriter(entity, FILE_NAME);
		return true;
	}

	private MovieEntity getDbEntity() {
		MovieEntity api = IOUtils.fileReader(new TypeReference<MovieEntity>() {
		}, FILE_NAME);
		if (api == null) {
			api = new MovieEntity();
		}
		return api;
	}
	
	public ArrayList<Movie> getMovieList() {
		return getDbEntity().getMovies();
	}
}
