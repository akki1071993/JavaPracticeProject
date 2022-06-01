package akash.exceptionHandling;

//throwing unchecked exception
public class ThrowDemo1 {

	public static void check(int a)
	{

		if (a < 18)
			throw new ArithmeticException("Not valide age for vote");
		else {
			System.out.println("Valid age !");
		}
	}

	public static void main(String[] args) {
		try {
			check(14);
		} catch (Exception e) {
			System.err.println("Error : " + e.getMessage());
		}

	}

}
