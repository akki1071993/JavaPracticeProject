package akash.multithreading;

public class RunnableDemo1 implements Runnable {

	
	public void run() {
		System.out.println("This is Runnable thread ");
		
	}
	public static void main(String[] args) throws InterruptedException {
		
		Runnable r1 = new RunnableDemo1();
	
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		
		//create thread class object with this runnable reference
		t1.start();
		t2.start();
				
	}

	

}
