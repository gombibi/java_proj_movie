package movie.producer.view;

import java.text.SimpleDateFormat;
import java.util.Date;

import movie.producer.data.Movie;

public class ProducerDisplay {

	public void showMenu() {
		System.out.println("===영화 제작===");
		System.out.println("메뉴선택");
		System.out.println(ProducerMenuConst.MENU_MOVIE_CREATE + ".영화 등록");
		System.out.println(ProducerMenuConst.MENU_SHOW_MOVIE_LIST + ".영화 리스트 보기");
		System.out.println("=============");
	}
	
	public void showMenuError() {
		System.out.println("잘못된 선택입니다.");
	}
	
	public void showCreateMovieTitle() {
		System.out.println("영화제목을 입력해주세요.");
	}
	
	public void showCreateMovieRunningTime() {
		System.out.println("런닝시간(분)을 입력해주세요.");
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
