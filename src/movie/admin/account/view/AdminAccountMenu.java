package movie.admin.account.view;

import movie.admin.account.source.AdminAccountDataSource;
import movie.admin.manage.view.AdminManageMenu;
import movie.utils.InputUtils;

public class AdminAccountMenu {

	private AdminAccountDisplay aDisplay = new AdminAccountDisplay();
	private AdminAccountDataSource adSource = new AdminAccountDataSource();

	public void run() {
		while (true) {
			aDisplay.showMenu();
			switch (InputUtils.getInt()) {
			case AdminAccountMenuConst.MENU_ADMIN_LOGIN: {
				login();
				break;
			}
			case AdminAccountMenuConst.MENU_ADMIN_JOININ: {
				joinin();
				break;
			}
			default:
				aDisplay.showMenuError();
			}
		}
	}

	private void login() {
		String id = "";
		String pw = "";
		boolean loginSuccess;
		
		aDisplay.requestID();
		id = InputUtils.getString();
		
		aDisplay.requestPW();
		pw = InputUtils.getString();
		loginSuccess = adSource.login(id, pw);
		
		if(loginSuccess) {
			System.out.println(id + "님! 로그인되셨습니다.");
			AdminManageMenu adminManageMenu = new AdminManageMenu();
			adminManageMenu.run();
			
		}else {
			aDisplay.showMenuError();
		}
	}

	private void joinin() {
		String id = "";
		String pw = "";
		boolean joinSuccess;
		
		aDisplay.requestID();
		id = InputUtils.getString();
		
		aDisplay.requestPW();
		pw = InputUtils.getString();
		joinSuccess = adSource.addAdminAccount(id, pw);

		if (joinSuccess) {
			System.out.println(id + "님! 회원가입 되셨습니다.");
			
			//회원 메뉴로 연결
			
		} else {
			System.out.println(id + "는 이미 있는 id입니다");
		}
	}

}
