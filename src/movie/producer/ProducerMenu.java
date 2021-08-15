package movie.producer;

import java.util.ArrayList;

import movie.producer.data.Movie;
import movie.producer.source.ProducerDataSource;
import movie.producer.view.ProducerDisplay;
import movie.producer.view.ProducerMenuConst;
import movie.utils.InputUtils;

public class ProducerMenu {

	private ProducerDisplay display = new ProducerDisplay();
	private ProducerDataSource source = new ProducerDataSource();
	public void run() {
		while (true) {
			display.showMenu();
			switch (InputUtils.getInt()) {
			case ProducerMenuConst.MENU_MOVIE_CREATE:
				createMovie();
				break;
			case ProducerMenuConst.MENU_SHOW_MOVIE_LIST:
				showMovieList();
				break;
			default:
				display.showMenuError();
			}
		}
	}

	private void createMovie() {
		String title;
		int runningTime;

		display.showCreateMovieTitle();
		title = InputUtils.getString();
		display.showCreateMovieRunningTime(title);
		runningTime = InputUtils.getInt();
		
		source.addMovie(title, runningTime);
	}
	
	private void showMovieList() {
		display.showMovieListSubject();
		ArrayList<Movie> list = source.getMovieList();
		for (int i = 0; i < list.size(); i++) {
			display.showMovieInfo(i +1, list.get(i));
		}
		display.showMovieListEnd();
		InputUtils.getString();
	}
}
