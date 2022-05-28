package akash.MultipleInheritanceWithInterfaceDaimondproblem;

public interface B {
	void testB();

	default void stayHome(String a) {
		System.out.println("This is default interface B " + a);

	};

}
