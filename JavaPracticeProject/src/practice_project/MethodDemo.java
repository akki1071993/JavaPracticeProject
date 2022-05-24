package practice_project;

import java.util.Scanner;

public class MethodDemo {

	// this is method with return integer value and take 2 parameters
	public int welcom(int a, int b) {
		int i = 0;
		for (i = a; i < b; i++) {

			System.out.println(i);
		}

		return i;

	}

	public static void main(String[] args) {
		MethodDemo obj = new MethodDemo();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Strating point");
		int a = sc.nextInt();

		System.out.println("Enter Ending point");
		int b = sc.nextInt();

		// calling method and store result in result variables
		int result = obj.welcom(a, b);

	}

}
