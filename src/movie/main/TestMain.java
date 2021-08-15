package movie.main;

import movie.admin.account.source.AdminDataSource;
import movie.producer.ProducerMenu;

public class TestMain {

	public static void main(String[] args) {
		AdminDataSource source = new AdminDataSource();
		
		for (int i = 0; i < 20; i++) {
			source.addAdminAccount("test" + i, "1234");	
		}
		
		source.addAdminAccount("test2", "1234");
		source.addAdminAccount("test", "1234");
		source.removeAdminAccount("test");
		
		System.out.println(source.login("test", "1234"));
		System.out.println(source.login("test2", "1234"));
		
		
		ProducerMenu menu = new ProducerMenu();
		menu.run();
	}
}
