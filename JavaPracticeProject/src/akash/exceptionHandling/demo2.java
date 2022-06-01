package akash.exceptionHandling;

public class demo2 {

	
	public static void main(String[] args) {
		try {
			String name = null;
			System.out.println(name.equals("akash"));
		} catch (NullPointerException e) {
			System.out.println("Erro:" + e.getMessage());
		}

	}

}
