package akash.abstractionUsingInterface;

public class ShowRoom {

	public static void main(String[] args) {
		
		Car akki = new HonadAmaze();
		Car jay = new HondaCity();
		Car vijay = new HondaCRV();
		
		akki.Start();
		akki.ChangeGear();
		akki.Stop();
		
		jay.Start();
		jay.ChangeGear();
		jay.Stop();
		
		vijay.Start();
		vijay.ChangeGear();
		vijay.Stop();
		

	}

}
