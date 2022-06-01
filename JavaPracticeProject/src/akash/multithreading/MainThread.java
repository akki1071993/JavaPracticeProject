package akash.multithreading;

public class MainThread extends Thread {

	public static int count = 0;

	public void run() {
		while (MainThread.count <= 10) {

			try {
				System.out.println(Thread.currentThread().getName() + " " + (MainThread.count++));
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		
		Thread mt1 = new MainThread();
		mt1.setName("Akash");
		mt1.start();
		Thread mt2 = new MainThread();
		mt2.setName("Aneri");
		mt2.start();
		
		while(MainThread.count <=10) {
			try {
				System.out.println("Main Thread: " + (MainThread.count++));
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Main Thread completed");

	}

}
