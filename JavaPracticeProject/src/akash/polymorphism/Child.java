package akash.polymorphism;

public class Child extends Base {

	//Override method same name method in different class
	void mobile() {
		System.out.println("This is Child class mobile");
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.mobile();

		Base b = new Base();
		b.mobile();

	}

}
