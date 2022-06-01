package akash.ThreadSafetyWithSychronized;

public class User2 extends Thread {
	private int n1;
	private int n2;
	public Sender res;

	public User2(int n1, int n2, Sender res2) {
		this.n1 = n1;
		this.n2 = n2;
		this.res = res2;
	}

	public void run () {

		synchronized (res) {
			int a =res.Opration(n2, n1);
			System.out.println("Sumation of "+n1+" and "+n2+" is: "+a);
			System.out.println("----------------------------------------------");
		}
	}

	
}
