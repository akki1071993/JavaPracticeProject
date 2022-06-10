package akash.abstractionUsingInterface;

public class HonadAmaze implements Car {

	@Override
	public void Start() {
		System.out.println("Honda Amaze can Started");

	}

	@Override
	public void Stop() {
		System.out.println("Honda Amaze can Stop");
	}

	@Override
	public void ChangeGear() {
		System.out.println("Honda Amaze can change gear ");

	}

}
