package akash.abstractclass;

public class Circle extends Shape {

	private double radius;
	
	public Circle(String color,double radius ) {
		super(color);
		
		this.radius = radius;		
	}
	
	public double getArea() {
		return Math.PI * radius *radius;
	}

	
	public String outPut() {
		return "Circle colore is " + getColor() + "\nArea is " + getArea();
	}

}
