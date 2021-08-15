package movie.resource;

import java.util.ArrayList;
import java.util.List;

public class SeatAdmin {
	
	private List<Seat> seats;
	private String seatNo;

	public SeatAdmin() {
		
		seats = new ArrayList<Seat>();
		this.seatNo = seats.toString();
		
		seats.add(new Seat(seatNo));
		
	}
	
	

}
