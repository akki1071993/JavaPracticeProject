package practice_project;

import java.util.Scanner;

public class OddNumbersPrint {

	public static void main(String[] args) {
		int n=0;		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter list size for odd number: ");
		n = sc.nextInt();
		n = n*2;
		
		// Odd number = 1,3,5,7,9,11,13,15.....
		for(int i=1; i<=n; i=i+2) {
			System.out.println(i);
		}
	}

}
