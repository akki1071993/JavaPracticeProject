package akash.customException;

public class NotValidAgeException extends Exception {
	
	public NotValidAgeException() {
		System.out.println("Not valid age");
	}
	public NotValidAgeException(String message) {
		super(message);
	}
	

}
