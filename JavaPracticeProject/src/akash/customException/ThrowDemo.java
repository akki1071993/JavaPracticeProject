package akash.customException;

public class ThrowDemo {

	public static void check(int a) throws NotValidAgeException {

		if (a < 18)
			throw new NotValidAgeException("Your age is lower than 18 ");
		else {
			System.out.println("Valid age !");
		}
	}

	public static void main(String[] args) {
		try {
			check(14);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
