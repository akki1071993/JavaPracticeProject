package akash.exceptionHandling;

//throwing checked exception
public class ThrowDemo2 {

	public static void check(int a) throws Exception
	{

		if (a < 18)
			throw new Exception("Not valide age for vote");
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
