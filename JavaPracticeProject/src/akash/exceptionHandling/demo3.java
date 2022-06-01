package akash.exceptionHandling;

public class demo3 {

	public static void main(String[] args) {
		try {
			int list[] = { 10, 20, 30, 40, 50 };

			System.out.println(list[5]);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
