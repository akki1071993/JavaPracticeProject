package akash.InnerClass;

import java.util.Scanner;

public class Regular { // Outer class

	private String psw = "psw";

	class Inner { // Inner class

		public void print(String key) {
			if (psw.equals(psw)) {
				System.out.println("Lock is open now");

			} else {
				System.out.println("Sorry worng key enter!");
			}
		}
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Regular r = new Regular(); // Regular class object
		Regular.Inner innerObj = r.new Inner(); // this is creation of inner class object

		System.out.println("Enter Key of locker: ");
		r.psw = s.nextLine();

		innerObj.print(r.psw); // call the inner class
	}

}
