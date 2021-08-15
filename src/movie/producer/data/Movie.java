package movie.producer.data;

public class Movie {

	private String title;
	private int runningTime;
	private long createBy;

	public Movie() {
		
	}
	
	public Movie(String title, int runningTime, long createBy) {
		super();
		this.title = title;
		this.runningTime = runningTime;
		this.createBy = createBy;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getRunningTime() {
		return runningTime;
	}

	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}

	public long getCreateBy() {
		return createBy;
	}

	public void setCreateBy(long createBy) {
		this.createBy = createBy;
	}
}
