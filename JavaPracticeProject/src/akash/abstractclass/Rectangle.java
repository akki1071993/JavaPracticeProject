package akash.abstractclass;

public class Rectangle extends Shape {

	private double width;
	private double hight;

	public Rectangle(String color, Double width, Double hight) {
		super(color);
		this.hight = hight;
		this.width = width;
	}
	
	public double getArea () {
		return width * hight;
	}

	
	public String outPut() {		
		return "Rectangle color is " + getColor()+ "\nArea is " + getArea();
	}

}
