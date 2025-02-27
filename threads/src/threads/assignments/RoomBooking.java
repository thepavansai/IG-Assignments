package threads.assignments;

public class RoomBooking extends Thread{
	ConferenceRoom cr;
	String str;
	public void run() {
		cr.bookRoom();
		cr.coductMeeting();
	}
	public RoomBooking(ConferenceRoom cr,String str) {
		this.cr=cr;
		this.setName(str);
		//this.start();
	}
	public static void main(String[] args) {
		ConferenceRoom cf= new ConferenceRoom();
		RoomBooking m1= new RoomBooking(cf, "Manager 1");
		RoomBooking m2= new RoomBooking(cf, "Manager 2");
		m2.start();
		m1.start();
		
	
	}

}
