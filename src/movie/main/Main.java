package movie.main;

import movie.admin.AdminMenu;
import movie.customer.CustomerMenu;
import movie.producer.ProducerMenu;

public class Main {

	public static void main(String[] args) {
		
		AdminMenu adminMenu = new AdminMenu();
		CustomerMenu customerMenu = new CustomerMenu();
		ProducerMenu producerMenu = new ProducerMenu();

		Kiosk kiosk = new Kiosk(adminMenu, customerMenu, producerMenu);
		
		kiosk.run();

		System.out.println("movie main run");
		
		

	}

}
