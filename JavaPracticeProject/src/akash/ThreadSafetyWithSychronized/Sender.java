package akash.ThreadSafetyWithSychronized;

public class Sender {

	synchronized void sendMsg(String name, String msg) {
		System.out.println(name + " sending message, >> " + msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + " Sned message successfully");
		System.out.println("----------------------------------------------");
	}

	synchronized int Opration(int a, int b) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Opration successfully done");
		return a + b;
	}
}
