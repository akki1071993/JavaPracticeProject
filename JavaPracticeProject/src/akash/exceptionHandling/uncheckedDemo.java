package akash.exceptionHandling;

import java.util.Scanner;

public class uncheckedDemo {

	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Entery any integer number");
			a = sc.nextInt();
			System.out.println("Entery any integer number");
			b = sc.nextInt();
			c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) { // For Arithmetic operation exception
			System.out.println(e.getMessage());
		} catch (Exception e) { // For all general exception
			System.out.println("Error occured " + e.getMessage());
		} finally {
			sc.close();
			System.out.println("This is from Finally");
		}
	}

}
