package practice_project;

import practice_project.AccessModifiers;

public class AccessModifiers2 {

	public static void main(String[] args) {
		//System.out.println("Hello world !");
		
		AccessModifiers obj = new AccessModifiers();
		
		System.out.println("Public: "+ obj.a);
		System.out.println("Protected: "+ obj.b);
		//System.out.println("Private: "+ obj.c);
		System.out.println("Default: "+ obj.d);
		
		// In Same package  Private not accessible 
	}		
	
}
