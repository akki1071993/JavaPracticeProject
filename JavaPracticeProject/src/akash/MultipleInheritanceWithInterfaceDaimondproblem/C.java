package akash.MultipleInheritanceWithInterfaceDaimondproblem;

public class C implements A,B {

	
	public void stayHome(String a) {
		A.super.stayHome(a);
		B.super.stayHome(a);
		

	}

	public void testA() {

		System.out.println("This is test A");
	}

	public void testB() {
		System.out.println("This is test B");
	}

	public void testC() {
		System.out.println("This is Local test C");
	}

	public void newWork() {
		System.out.println("This is new work shit");
		
	}
	public static void main(String[] args) {

		C c1 = new C();
		c1.stayHome("Hello");
		c1.newWork();	
		
		c1.testA();
		c1.testB();
		c1.testC();

	}

	
	

}
