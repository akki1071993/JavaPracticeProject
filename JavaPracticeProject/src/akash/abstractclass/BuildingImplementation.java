package akash.abstractclass;

public abstract class BuildingImplementation implements Building {

	public void hallKitchen() {
		System.out.println("1 hall and Kitchen");
	};

	abstract public void OneBHK();

	abstract public void TowBHK();

	abstract public void ThreeBHK();
}
