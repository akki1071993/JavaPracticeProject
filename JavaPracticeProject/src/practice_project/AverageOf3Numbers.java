package practice_project;

import java.util.Scanner;

public class AverageOf3Numbers {

	public static void main(String[] args) {
		float n1 = 0, n2 = 0, n3 = 0, avg = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number 1: ");
		n1 = sc.nextFloat();
		System.out.println("Enter Number 2: ");
		n2 = sc.nextFloat();
		System.out.println("Enter Number 3: ");
		n3 = sc.nextFloat();

		avg = (float) ((n1 + n2 + n3) / 3);
		System.out.println("Average of this 3 Numbers: " + avg);

	}

}
