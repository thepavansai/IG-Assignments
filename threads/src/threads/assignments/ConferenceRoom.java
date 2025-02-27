package threads.assignments;

public class ConferenceRoom {
	private boolean availability=true;
	
	public boolean conferenceRoomAvailability() {
		return availability;
	}
	public synchronized void bookRoom() {
		if(conferenceRoomAvailability()) {
			System.out.println("Confernce Room is successfully Booked by "+Thread.currentThread().getName());
			
			availability=false;
		}
		else {
			System.out.println(Thread.currentThread().getName() + " could not book the conference room as it is already booked.");
		}
	}
	public  synchronized void releaseRoom() {
		availability=true;
		System.out.println(Thread.currentThread().getName() + " has released the conference room.");		
	}
	public synchronized void coductMeeting() {
		if(!conferenceRoomAvailability()) {
			System.out.println(Thread.currentThread().getName()+" is currently conducting Meeting");
		}
		try {
			Thread.sleep(5000);
			//Thread.currentThread().join();
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		finally {
			releaseRoom();
		}
	}

}
