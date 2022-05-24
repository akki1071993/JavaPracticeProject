package practice_project;

import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {

		// Variable Declaration  
		float n1, n2 , result; 
		int oprator;

		// Scanner object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		n1 = sc.nextInt();

		System.out.println("Enter any number: ");
		n2 = sc.nextInt();

		System.out.println(
				"Enter 1 For Summation:  \nEnter 2 For Subtraction:   \nEnter 3 For Multiplication:  \nEnter 4 for Division: ");
		oprator = sc.nextInt();

		// Check which orator is there ?
		switch (oprator) {
		case 1:
			result = n1 + n2;
			System.out.println("Summation of " + n1 + " and  "+ n2 +" is "+ (int)result);
			break;
		case 2:
			result = n1 - n2;
			System.out.println("Subtraction of " + n1 + " and  "+ n2 +" is "+ (int)result);
			break;
		case 3:
			result = n1 * n2;
			System.out.println("Multiplication of " + n1 + " and  "+ n2 +" is "+ (int)result);
			break;
		case 4:
			result = n1 / n2;
			System.out.println("Division of " + n1 + " and  "+ n2 +" is "+ (int)result);
			break;

		default:
			System.out.println("Please enter valid oprator");
			break;
		}
		
	}

}
