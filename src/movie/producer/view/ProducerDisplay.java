package movie.producer.view;

import java.text.SimpleDateFormat;
import java.util.Date;

import movie.producer.data.Movie;

public class ProducerDisplay {

	public void showMenu() {
		System.out.println("Thank you for visiting BIBIMOVIE");
		System.out.println("담당자님, 원하는 메뉴를 선택하세요");
		System.out.println("-----------------------------------------------");
		System.out.println(ProducerMenuConst.MENU_MOVIE_CREATE + ". 영화 등록");
		System.out.println(ProducerMenuConst.MENU_SHOW_MOVIE_LIST + ". 영화 리스트 보기");
		System.out.println("-----------------------------------------------");
	}
	
	public void showMenuError() {
		System.out.println("잘못된 선택입니다.");
	}
	
	public void showCreateMovieTitle() {
		System.out.println("Please type a movie info you want to register");
		System.out.println("What is the movie title?");
	}
	
	public void showCreateMovieRunningTime(String title) {
		System.out.println("2. what is the running time(min) of " + title + " ?");
	}
	
	public void showMovieListSubject() {
		System.out.println("===등록된 영화 리스트===");
	}
	
	public void showMovieListEnd() {
		System.out.println("===================");
	}
	
	public void showMovieInfo(int index, Movie movie) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		Date date = new Date(movie.getCreateBy());
		System.out.printf("%d. %s (%d분) 등록시간 : %s \n", index, movie.getTitle(), movie.getRunningTime(), sdf.format(date));
	}
}
