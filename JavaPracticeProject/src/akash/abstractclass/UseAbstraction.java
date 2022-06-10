package akash.abstractclass;

public class UseAbstraction {

	public static void main(String[] args) {

		Circle c = new Circle("Red", 4.5);

		System.out.println(c.outPut() + "\n");

		Rectangle r = new Rectangle("Blue", 85.50, 10.5);

		System.out.println(r.outPut());

	}

}
