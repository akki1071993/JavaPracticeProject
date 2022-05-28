package akash.multilevelinheritance;

public class SubClass extends Base {

	void print() {
		System.out.println("This is sub class");
	}

	public static void main(String[] args) {

		SubClass s = new SubClass();
		s.print();

		Base b1 = new Base();
		b1.print();

		Parent b2 = new Parent();
		b2.print();
	}

}
