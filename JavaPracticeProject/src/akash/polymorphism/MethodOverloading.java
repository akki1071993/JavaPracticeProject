package akash.polymorphism;

public class MethodOverloading {

	
	public void printMsg() {
		System.out.println("Hello ");
	}

	public void printMsg(String name) {
		System.out.println("Hello " + name);
	}

	public void printMsg(String name, String lname) {
		System.out.println("Hello "+ name + " "+lname);
	}

	public void printMsg(String name, int age) {
		System.out.println("Hello "+ name + " Your age is "+ age);
	}

	public static void main(String[] args) {

		MethodOverloading m = new MethodOverloading();
		m.printMsg();
		m.printMsg("Akash");
		m.printMsg("Akash","Mahant");
		m.printMsg("Akash",29);
	}

}
