package movie.admin.manage.view;

public class AdminManageDisplay {
	public void showMenu() {
		System.out.println("Thank you for visiting BIBIMOVIE");
		System.out.println("관리자님, 원하는 메뉴를 선택하세요");
		System.out.println("-----------------------------------------------");
		System.out.println(AdminManageMenuConst.MENU_MOVIE_REGISTER + ". 영화 관리");
		System.out.println(AdminManageMenuConst.MENU_MANAGE_SALES + ". 매출 관리");
		System.out.println(AdminManageMenuConst.MENU_LOGOUT + ". 로그아웃");
		System.out.println(AdminManageMenuConst.MENU_WITHDRAW + ". 회원 탈퇴");
		System.out.println("-----------------------------------------------");
	}
	
	public void showMenuError() {
		System.out.println("잘못된 선택입니다.");
	}
	
	public void showlogout() {
		System.out.println("로그아웃되셨습니다.");
	}
	
	public void showWithdraw() {
		System.out.println("탈퇴 되셨습니다.");
	}
}
