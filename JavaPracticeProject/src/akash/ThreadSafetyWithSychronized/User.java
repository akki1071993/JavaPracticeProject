package akash.ThreadSafetyWithSychronized;

public class User extends Thread {
	private String name;
	private String msg;
	public Sender res;
    public int n1;
    public int n2;
	public User(String name, String msg, Sender res,int n1,int n2) {

		this.name = name;
		this.msg = msg;
		this.res = res;
		this.n1 =n1;
		this.n2 =n2;
	}

	public void run() {
		synchronized (res) {
			res.sendMsg(name, msg);
			int a =res.Opration(n2, n1);
			System.out.println("Sumation of "+n1+" and "+n2+" is: "+a);
			System.out.println("----------------------------------------------");

		}

	}

}
