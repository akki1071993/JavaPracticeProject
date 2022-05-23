package practice_project2;
import practice_project.AccessModifiers;

public class AccessModifiersChild extends AccessModifiers {
	
	public static void main(String[] args) {
		//System.out.println("Hello world !");		
		
		AccessModifiersChild obj = new AccessModifiersChild();		
		System.out.println("Public: "+ obj.a);
		System.out.println("Protected: "+ obj.b);
		//System.out.println("Private: "+ obj.c);
		//System.out.println("Default: "+ obj.d);
		
		// In Child call public and Protected both accessible 
		// Do it first
	}

}
