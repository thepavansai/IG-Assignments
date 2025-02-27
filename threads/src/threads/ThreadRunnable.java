package threads;

public class ThreadRunnable implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String s[]) {
		ThreadRunnable tr= new ThreadRunnable();
		Thread t= new Thread(tr);
		t.setName("Lewis Hamilton");
		t.start();
		System.out.println(Thread.activeCount());
		try {
		t.join();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(Thread.activeCount());
	}
}
