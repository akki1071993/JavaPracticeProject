package akash.ThreadSafetyWithSychronized;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Sender res = new Sender();

		User t1 = new User("Akash", "Hello everyone", res, 10, 30);
		User t2 = new User("Aneri", "I'm from vadoara", res, 50, 60);
		User t3 = new User("Hiya", "Good to see you", res, 60, 90);

		User2 U2a = new User2(10, 20, res);
		User2 U2b = new User2(60, 80, res);
		User2 U2c = new User2(50, 30, res);

		t1.start();
		t2.start();
		t3.start();
		
		U2a.start();
		U2b.start();
		U2c.start();
	}

}
