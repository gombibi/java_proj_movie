package movie.resource;

public class Movie {
	
	private String branch;
	private String mName;
	private String movieDate;
	private String movieTime;
	private String mPrice;
	
	
	public Movie(String branch, String mName, String movieDate, String movieTime, String mPrice) {
		this.branch = branch;
		this.mName = mName;
		this.movieDate = movieDate;
		this.movieTime = movieTime;
		this.mPrice = mPrice;
	}

	@Override
	public String toString() {
		return "Movie [branch=" + branch + ", mName=" + mName + ", movieDate=" + movieDate + ", movieTime=" + movieTime
				+ ", mPrice=" + mPrice + "]";
	}
	
	
	

}
