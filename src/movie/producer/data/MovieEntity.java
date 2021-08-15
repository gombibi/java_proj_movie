package movie.producer.data;

import java.util.ArrayList;

public class MovieEntity {
	private ArrayList<Movie> movies = new ArrayList<>();
	
	public ArrayList<Movie> getMovies() {
		return movies;
	}

	public void setMovies(ArrayList<Movie> movies) {
		this.movies = movies;
	}
}
