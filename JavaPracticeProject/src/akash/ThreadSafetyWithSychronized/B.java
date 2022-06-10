package akash.ThreadSafetyWithSychronized;

/*without using synchronized and wait() and notify() methods
  so hear we can see out is not proper.
  fist call A object then B interrupted in object A
  so solve this problem with the help of synchronized and wait() and notify() methods
*/

class B1 extends Thread {
	static int t = 0;

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

public class B {

	public static void main(String[] args) throws InterruptedException {

		try {
			// For first object
			A1 a = new A1();
			a.start();

			System.out.println("Main thread start");
			System.out.println("Main thread notified");
			System.out.println(a.t);

			// For second object
			A1 b = new A1();
			b.start();

			System.out.println("Main B thread start");
			System.out.println("Main B thread notified");
			System.out.println(b.t);

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
