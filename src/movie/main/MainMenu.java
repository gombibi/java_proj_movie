package movie.main;

import movie.admin.account.view.AdminAccountMenu;
import movie.customer.CustomerMenu;
import movie.producer.ProducerMenu;
import movie.utils.InputUtils;

public class MainMenu {

	MainMenuDisplay mDisplay = new MainMenuDisplay();
	CustomerMenu cMenu = new CustomerMenu();
	ProducerMenu pMenu = new ProducerMenu();
	AdminAccountMenu aMenu = new AdminAccountMenu();

	// 메인 메뉴

	public void run() {
		mDisplay.showMainMenu();
		while (true) {
			switch (InputUtils.getInt()) {
			case MainMenuConst.MENU_CUSTOMER:
				cMenu.run();
				break;

			case MainMenuConst.MENU_ADMINISTRATOR:
						
				aMenu.run();
				break;

			case MainMenuConst.MENU_PRODUCTION:
				pMenu.run();
				break;

			default:
				System.out.println("잘못된 입력입니다. 다시 입력해주세요");
			}
		}

	}

	// User 메뉴
	public String showUserMenu() {
		String selectMenuNum = "";
		// Scanner sc = new Scanner(System.in);

		System.out.println("Thank you for visiting BIBIMOVIE");
		System.out.println("Please select menu");
		System.out.println("--------------------------------------------");
		System.out.println("1. Buy Ticket 2. Cancellation");
		System.out.println("--------------------------------------------");

		try {
			// selectMenuNum = sc.nextLine();

		} catch (Exception e) {
			System.out.println("잘못된 입력입니다" + e.getMessage());
		}
		return selectMenuNum;
	}

	public void runUserMenu() {
		switch (showUserMenu()) {
		case "1":

		case "2":

		default:
			System.out.println("잘못된 입력입니다. 다시 입력해주세요");
		}
	}


}
