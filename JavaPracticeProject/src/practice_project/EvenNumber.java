package practice_project;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		int n=0;		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter list size for Even number: ");
		n = sc.nextInt();
		n = n*2;
		
		// Even number = 2,4,6,8,10,12,14.....
		
		for(int i=2; i<=n; i=i+2) 
		{
			System.out.println(i);
		}
	}

}
