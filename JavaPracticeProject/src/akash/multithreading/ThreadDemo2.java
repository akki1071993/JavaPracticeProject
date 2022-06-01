package akash.multithreading;

public class ThreadDemo2 extends Thread {

	public void run() {
		System.out.println("This is Thread");
	}
	
	
	
	public static void main(String[] args) {
		
		ThreadDemo2 t1 = new ThreadDemo2();
		ThreadDemo2 t2 = new ThreadDemo2();
		
		t1.start();
		t2.start();
		

	}

}
