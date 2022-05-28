package akash.InnerClass;

import java.util.Scanner;

public class LocalInnerClass {

	void check() {
		class Inner {
			private String key;
			void authoticationCheck(String key) {
				if (key.equals("psw")) {
					System.out.println("Lock is open");
				} else {
					System.out.println("Sorry key is worng!");
				}
			}
		}
		Scanner s = new Scanner(System.in);
		/*
		 * class which is created inside the method you can use only in that method
		 * create object on inner class and use it here
		 */
		Inner n = new Inner();

		System.out.println("Enter Key of locker: ");
		n.key = s.nextLine();
		//call method of inner class
		n.authoticationCheck(n.key);
	}
	/*
	 * you can not use this inner class. outside on check()  block 
	 * use for code maintenance and security
	 */

	public static void main(String[] args) {

		// call main class 
		LocalInnerClass l = new LocalInnerClass();
		l.check();

	}

}
