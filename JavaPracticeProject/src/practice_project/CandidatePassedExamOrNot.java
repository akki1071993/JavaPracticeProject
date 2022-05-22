package practice_project;

import java.util.Scanner;

public class CandidatePassedExamOrNot {

	public static void main(String[] args) {
		int m=0; // for marks		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks: ");
		m = sc.nextInt();
		
		if(m < 35) // check condition for pass or not
		{
			System.out.println("Sorry ! You are fail try next time");
		}
		else {
			System.out.println("Congratulations! You are pass");
		}

	}

}
