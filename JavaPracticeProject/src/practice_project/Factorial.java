package practice_project;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		long fact=1;
		int n1=0;//It is the number to calculate factorial
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		n1 = sc.nextInt();     
		  for(int i=1;i<=n1;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+n1+" is: "+fact);    
		 }  
	}


