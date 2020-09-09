package project0;

public class Circle extends Shape{

	double radius;
	
	public Circle(String name) {
		super(name);
	}
	
	public void setDimensions(double radius) {
		this.radius = radius;	
	}
	
	@Override
	public void printDimensions() {
		System.out.println("The radius is: " + radius);
	}
	
	@Override
	public double getArea() {
		return 3.1415 * (radius * radius);
	}

}
