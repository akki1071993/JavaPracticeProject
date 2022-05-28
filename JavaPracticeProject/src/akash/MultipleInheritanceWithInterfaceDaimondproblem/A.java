package akash.MultipleInheritanceWithInterfaceDaimondproblem;

public interface A {
	
	
	public void testA();

	default void stayHome(String a) {
		System.out.println("This is default interface A " + a);
	}
	
	public void newWork();

}
