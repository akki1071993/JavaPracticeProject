package practice_project;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		float p=0,r=0, n=0,i=0;		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal Amounts: ");
		p = sc.nextFloat();
		System.out.println("Enter Rate of Interest: ");
		r = sc.nextFloat();
		System.out.println("Enter Years: ");
		n = sc.nextFloat();

		
		
		i = (float) ((p * r*n)/100);
		System.out.println("Simple interest: " + i + " Rs.");

	}

}
