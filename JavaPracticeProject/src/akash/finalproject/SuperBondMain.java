package akash.finalproject;

public class SuperBondMain  {

	public static void main(String[] args) {
		
		FileOperations.createMainFolderIfNotPresent("main");

		MenuOptions.printWelcomeScreen("Super Bond Lockers Pvt. Ltd", "Akash Mahant");

		HandleOptions.handleWelcomeScreenInput();
	}

}
