package practice_project;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		int n1 = 0, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number age: ");
		n1 = sc.nextInt();

		for (int i = 0; i <= n1; i++) 
		{
			sum = sum + i; // sum of give list number
		}

		System.out.println("Sum of first 8" + n1 + " natural number is: " + sum);
	}

}
