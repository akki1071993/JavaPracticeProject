package akash.multithreading;

public class RealDemo implements Runnable {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) throws InterruptedException {

		Runnable r1 = new RealDemo();
		synchronized (r1) {
			Thread t1 = new Thread(r1);
			t1.setName("Akash");
			Thread t2 = new Thread(r1);			
			t2.setName("Aneri");
			t1.start();
			t2.start();

		}
		
		
		
	}

}
