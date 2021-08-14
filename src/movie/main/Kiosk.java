package movie.main;

import movie.admin.AdminMenu;
import movie.customer.CustomerMenu;
import movie.producer.ProducerMenu;

public class Kiosk {

	private AdminMenu adminMenu = new AdminMenu();
	private CustomerMenu customerMenu = new CustomerMenu();
	private ProducerMenu producerMenu = new ProducerMenu();
	
	public void run() {
		System.out.println("kiosk run");
	}
}
