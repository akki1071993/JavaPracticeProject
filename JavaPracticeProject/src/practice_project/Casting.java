package practice_project;

import java.util.Scanner;

public class Casting {
	public static void main(String[] args) {
		
		/* Widening casting example */
		char c = 'L';
		int a = c; //Widening casting
		System.out.println("ASCII - Binary Character L is: "+ a);
		
		
		/* Narrowing casting example */
		Scanner sc =  new Scanner(System.in);
        System.out.println("Enter any integer value");
        int v = sc.nextInt();
        char ch = (char)v; // Narrowing casting
        
        System.out.println("Character value of given integer:"+ ch);
        
	}}