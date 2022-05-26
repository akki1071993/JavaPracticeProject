package akash.inheritance;

public class Parent {

	private int r;

	// this is Parent constructor with parameter
	public Parent(int a, int b) {
		r = a + b;
		System.out.println("This is Parent constructor with parameter " + r);
	}

	// this is Parent constructor
	public Parent() {
		System.out.println("This is Parent constructor ! ");
	}

	public int Operation(int a, int b) {

		return a + b;
	}

}
