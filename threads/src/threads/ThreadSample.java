package threads;

public class ThreadSample extends Thread  {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String []pss) {
		ThreadSample ts = new ThreadSample();
		System.out.println(Thread.currentThread().getName());
		ts.setName("Norris");
		ts.start();
		ThreadSample ts1= new ThreadSample();
		ts1.setName("Max");
		ts1.start();
		System.out.println(Thread.activeCount());
	}

}
