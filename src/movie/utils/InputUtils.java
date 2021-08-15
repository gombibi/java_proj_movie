package movie.utils;

import java.util.Scanner;

public class InputUtils {
	public static String getString() {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		return input;
	}

	public static int getInt() {
		try {
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
			sc.nextLine();
			return input;	
		} catch (Exception e) {
			System.out.println("잘못된 입력입니다.");
		}
		return getInt();
	}
}
