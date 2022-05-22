package practice_project;

import java.util.Scanner;

public class ValidForVote {

	public static void main(String[] args) {
		int age=0;		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		age = sc.nextInt();
		
		if(age < 18) // Checking age 18 or not ? 
		{
			System.out.println("Sorry ! You are not eligible for voting");
		}
		
	}

}
