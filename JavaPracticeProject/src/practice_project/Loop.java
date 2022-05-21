package practice_project;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n2 = 1, n3 = 1;
		System.out.println("Enter loop end point 4 for loop : ");
		int x = sc.nextInt();
		System.out.println("Enter loop end point for while loop : ");
		int y = sc.nextInt();
		System.out.println("Enter loop end point for do..while loop : ");
		int z = sc.nextInt();

		
		System.out.println("For loop");
		// for loop
		for (int n1 = 1; n1 <= x; n1++) {
			System.out.println(n1);
		}

		// while loop

		System.out.println("While loop");
		
		while (n2 <= y) {
			System.out.println(n2);
			n2++;
		}

		System.out.println("Do..While loop");
		// do.. while loop
		do {
			System.out.println(n3);
			n3++;
		} while (n3 <= z); // Condition 

	}

}