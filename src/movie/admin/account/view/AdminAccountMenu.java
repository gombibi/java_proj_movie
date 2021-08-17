package movie.admin.account.view;

import movie.admin.account.source.AdminAccountDataSource;
import movie.admin.account.source.Session;
import movie.utils.InputUtils;

public class AdminAccountMenu {

	private AdminAccountDisplay aDisplay = new AdminAccountDisplay();
	private AdminAccountDataSource adSource = new AdminAccountDataSource();

	public void run() {
		while (true) {
			aDisplay.showMenu();
			switch (InputUtils.getInt()) {
			case AdminAccountMenuConst.MENU_ADMIN_LOGIN: {
				boolean result = login();
				if(result) {
					return;
				}
				break;
			}
			case AdminAccountMenuConst.MENU_ADMIN_JOININ: {
				boolean result = joinin();
				if(result) {
					return;
				}
				break;
			}
			default:
				aDisplay.showMenuError();
			}
		}
	}

	private boolean login() {
		String id = "";
		String pw = "";
		boolean loginSuccess;
		
		aDisplay.requestID();
		id = InputUtils.getString();
		
		aDisplay.requestPW();
		pw = InputUtils.getString();
		loginSuccess = adSource.login(id, pw);
		
		if(loginSuccess) {
			Session.getInstance().login(id, pw);
			System.out.println(id + "님! 로그인되셨습니다.");
			return true;
		}else {
			aDisplay.showMenuError();
			return false;
		}
	}

	private boolean joinin() {
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
			Session.getInstance().login(id, pw);
			//회원 메뉴로 연결
			return true;
		} else {
			System.out.println(id + "는 이미 있는 id입니다");
			return false;
		}
	}

}
