package movie.admin.account.view;

public class AdminAccountDisplay {
	
	public void showMenu() {
		System.out.println("Thank you for visiting BIBIMOVIE");
		System.out.println("원하는 메뉴를 선택하세요");
		System.out.println("-----------------------------------------------");
		System.out.println(AdminAccountMenuConst.MENU_ADMIN_LOGIN + ". 로그인");
		System.out.println(AdminAccountMenuConst.MENU_ADMIN_JOININ + ". 회원가입");
		System.out.println("-----------------------------------------------");
	}
	
	public void showMenuError() {
		System.out.println("잘못된 선택입니다.");
	}
	
	public void requestID() {
		System.out.println("ID를 입력해주세요");
	}
	
	public void requestPW() {
		System.out.println("PW를 입력해주세요");
	}

}
