package akash.abstractclass;

public abstract class Shape {
	private String color;

	// abstract class
	public abstract String outPut();

	// Default constructor 
	public Shape(String color) {
		this.color = color;
	}

	//Return color
	public String getColor() {
		return color;
	}

}
