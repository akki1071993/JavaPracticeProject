package akash.ThreadSafetyWithSychronized;

class A1 extends Thread {
	int t = 0;

	public void run() {
		synchronized (this) {
			for (int i = 0; i <= 10; i++) {
				t = t + i;
				System.out.println("This is opration: "+ t +" + "+i+" = "+t);
			}
			this.notify();
		}
	}
}

public class A {

	public static void main(String[] args) throws InterruptedException {
		A1 a = new A1();
		a.start();
		synchronized (a) {
			System.out.println("Main thread start");
			a.wait();
			System.out.println("Main thread notified");
			System.out.println(a.t);

		}
	}
}
