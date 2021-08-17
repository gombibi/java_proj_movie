package movie.admin.manage.view;

import movie.admin.account.source.Session;
import movie.admin.account.view.AdminAccountMenu;
import movie.admin.manage.source.AdminManageDataSource;
import movie.utils.InputUtils;


public class AdminManageMenu {
	
	private AdminManageDataSource amdSource = new AdminManageDataSource();
	private AdminManageDisplay amDisplay = new AdminManageDisplay();
	private AdminAccountMenu accountMenu = new AdminAccountMenu();

	public void run(){
		while (true) {
			if(Session.getInstance().isLogined()) {
				amDisplay.showMenu();

				switch (InputUtils.getInt()) {
				case AdminManageMenuConst.MENU_MOVIE_REGISTER:
					
					break;
				
				case AdminManageMenuConst.MENU_MANAGE_SALES:
					
					break;
					
				case AdminManageMenuConst.MENU_LOGOUT:
					amDisplay.showlogout();
					Session.getInstance().logout();
					break;
					
				case AdminManageMenuConst.MENU_WITHDRAW:
					withdraw();
					amDisplay.showWithdraw();
					break;
					
				default:amDisplay.showMenuError();
					
				}				
			} else {
				accountMenu.run();
			}
		}
	}
	
	private void withdraw() {
		String id = "";
		boolean removeSuccess;

		id = InputUtils.getString();
		removeSuccess = amdSource.removeAdminAccount(id);

		if (removeSuccess) {
			System.out.println(id + "님, 탈퇴되었습니다.");
		} else {
			System.out.println(id + "는 없는 id입니다.");
		}
	}

}
