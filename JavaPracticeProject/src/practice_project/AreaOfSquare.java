package practice_project;

import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) {
		int side;
	      double area;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the side of the Square :");
	      side = sc.nextInt();
	 
	    	 
	      area = (side*side);
	      System.out.println("Area of the Square is :"+area);

	}

}
