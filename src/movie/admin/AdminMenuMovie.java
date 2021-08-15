package movie.admin;

import movie.resource.Movie;

public class AdminMenuMovie {

	Movie movie;
	
	public void addMovie(String branch, String mName, String movieDate, String movieTime, String mPrice) {
		
		movie = new Movie(branch, mName, movieDate, movieTime, mPrice);
		
	}
}
