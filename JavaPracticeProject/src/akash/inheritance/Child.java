package akash.inheritance;

public class Child extends Parent {

	// this is child constructor
	public Child(int a, int b) {
		// super(); //this will call parent class constructor
		super(a, b);
		System.out.println("This is child constructor !");
	}

	// this is child method
	public int Operation(int a, int b) {

		return a - b;
	}

	public static void main(String[] args) {

		/*
		 * this is child object here i am trying to call child class constructor but as
		 * child extends parent it will call parent class constructor first this is in
		 * the case of default constructor
		 */

		Child c = new Child(15, 15);

		// this is Parent object
		Parent p = new Parent();

		System.out.println("Summ is: " + c.Operation(500, 100));
		System.out.println("Summ is: " + p.Operation(500, 100));

	}

}
