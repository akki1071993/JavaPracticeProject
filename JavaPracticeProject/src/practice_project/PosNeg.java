package practice_project;

import java.util.Scanner;

public class PosNeg {
	/*
	 * This is multiple condition example if else if and check given number is + or
	 * - or zero
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any integer number: ");
		int n1 = sc.nextInt();

		if (n1 > 0) {
			System.out.println("The given number is positive");
		} else if (n1 < 0) {
			System.out.println("The given nuber is negetive");
		} else {
			System.out.println("The give number is Zero");
		}
	}
}
