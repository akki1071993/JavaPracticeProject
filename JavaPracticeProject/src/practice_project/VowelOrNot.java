package practice_project;

import java.util.Scanner;

public class VowelOrNot {

	public static void main(String[] args) {
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		ch = sc.next().charAt(0);
		// Vowel : a,e,i,o,u,A,E,I,O,U
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(ch + " is vowel");
			break;
		default:
			System.out.println(ch + " is consonant");

		}
	}

}
