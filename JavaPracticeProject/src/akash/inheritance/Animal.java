package akash.inheritance;

public class Animal implements AnimalEat, AnimalTravel {
	public void eat() {
		System.out.println("Animal is eating");
	}

	public void travel() {
		System.out.println("Animal is travelling");
	}

	public void getName(String name) {
		System.out.println("Animal name is : " + name);

	}

	public static void main(String[] args) {

		AnimalEat ae = new Animal();
		ae.getName("Tiger");
		ae.eat();

		AnimalTravel at = new Animal();
		at.getName("Lion");
		at.travel();

	}

}
