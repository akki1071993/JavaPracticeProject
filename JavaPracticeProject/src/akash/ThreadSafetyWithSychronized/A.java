package akash.ThreadSafetyWithSychronized;

/*In this program we solve multithreading call problem.
 * like how we call sheared code  with 2 different object without interrupted each other.
 * Using synchronized and wait() and notify() methods.
 * This is solution of B.java 
*/
class A1 extends Thread {
	static  int t = 0;

	public void run() {
		synchronized (this) {
			for (int i = 0; i <= 10; i++) {
				t = t + i;
				System.out.println("This is opration: " + t + " + " + i + " = " + t);
			}
			this.notify();
		}
	}

	public void display() {
		synchronized (this) {
			int n = 0;
			System.out.println("Display thread Start");
			while (n < 10) {
				System.out.println("Hello");
				n++;
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
			a.wait();
			// a.display();
			// System.out.println("Display thread End");
			System.out.println(a.t);
		}
		
		A1 b = new A1();
		b.start();
		synchronized (b) {

			System.out.println("Main B thread start");
			b.wait();
			System.out.println("Main B thread notified");
			b.wait();
			System.out.println(b.t);

		}

	}
}
