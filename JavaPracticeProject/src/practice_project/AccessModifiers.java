package practice_project;

public class AccessModifiers {

	public int a= 10;
	protected int b= 20;
	private int c= 30;
    int d= 40;
	
	public static void main(String[] args) {
		
		
		AccessModifiers obj = new AccessModifiers();
		
		System.out.println("Public: "+ obj.a);
		System.out.println("Protected: "+ obj.b);
		System.out.println("Private: "+ obj.c);
		System.out.println("Default: "+ obj.d);
		
		//In within class all accessible 
	}	

}




