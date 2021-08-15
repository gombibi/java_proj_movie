package movie.main;

import java.util.Scanner;

import movie.admin.AdminMenu;
import movie.customer.CustomerMenu;
import movie.producer.ProducerMenu;

public class Kiosk {

	private AdminMenu adminMenu;
	private CustomerMenu customerMenu;
	private ProducerMenu producerMenu;

	public Kiosk(AdminMenu adminMenu, CustomerMenu customerMenu, ProducerMenu producerMenu) {
		this.adminMenu = adminMenu;
		this.customerMenu = customerMenu;
		this.producerMenu = producerMenu;
	}

	// 메인 메뉴

	public String showMainMenu() {
		String selectMenuNum = "";
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to BIBIMOVIE");
		System.out.println("Please select menu");
		System.out.println("--------------------------------------------");
		System.out.println("1. Customer 2. Administrator 3. Production");
		System.out.println("--------------------------------------------");

		try {
			selectMenuNum = sc.nextLine();

		} catch (Exception e) {
			System.out.println("잘못된 입력입니다" + e.getMessage());
		}
		return selectMenuNum;
	}

	public void run() {
		switch (showMainMenu()) {
		case "1":
			runUserMenu();

		case "2":
			runAdminMeun();

		case "3":
			runProdMenu1();
			runProdMenu2();

		default:
			System.out.println("잘못된 입력입니다. 다시 입력해주세요");
		}
	}

	// User 메뉴
	public String showUserMenu() {
		String selectMenuNum = "";
		Scanner sc = new Scanner(System.in);

		System.out.println("Thank you for visiting BIBIMOVIE");
		System.out.println("Please select menu");
		System.out.println("--------------------------------------------");
		System.out.println("1. Buy Ticket 2. Cancellation");
		System.out.println("--------------------------------------------");

		try {
			selectMenuNum = sc.nextLine();

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

	// Administrator 메뉴
	public String showAdminMenu() {
		String selectMenuNum = "";
		Scanner sc = new Scanner(System.in);

		System.out.println("Thank you for visiting BIBIMOVIE");
		System.out.println("Please select menu");
		System.out.println("--------------------------------------------");
		System.out.println("1. Log in 2. Joinin");
		System.out.println("--------------------------------------------");

		try {
			selectMenuNum = sc.nextLine();

		} catch (Exception e) {
			System.out.println("잘못된 입력입니다" + e.getMessage());
		}
		return selectMenuNum;
	}

	public void runAdminMeun() {
		switch (showAdminMenu()) {
		case "1":

		case "2":

		default:
			System.out.println("잘못된 입력입니다. 다시 입력해주세요");
		}
	}
	
	// Production 메뉴
		public String runProdMenu1() {
			String typeMovieTitle = "";
			Scanner sc = new Scanner(System.in);

			System.out.println("Thank you for visiting BIBIMOVIE");
			System.out.println("Please type a movie info you want to register");
			System.out.println("-----------------------------------------------");
			System.out.println("1. What is the movie title?");
			System.out.println("-----------------------------------------------");

			try {
				typeMovieTitle = sc.nextLine();

			} catch (Exception e) {
				System.out.println("잘못된 입력입니다" + e.getMessage());
			}
			return typeMovieTitle;
		}

		public String runProdMenu2() {
			String typeRunningTime = "";
			Scanner sc = new Scanner(System.in);

			System.out.println("-----------------------------------------------");
			System.out.println("2. what is the running time of " + runProdMenu1() + " ?");
			System.out.println("-----------------------------------------------");

			try {
				typeRunningTime = sc.nextLine();

			} catch (Exception e) {
				System.out.println("잘못된 입력입니다" + e.getMessage());
			}
			return typeRunningTime;
		}

}
