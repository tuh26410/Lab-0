package project0;

public class Square extends Shape{

	double length;
	double height;
	
	public Square(String name) {
		super(name);
	}
	
	public void setDimensions(double length, double height) {
		this.length = length;
		this.height = height;
	}
	
	@Override
	public void printDimensions() {
		System.out.println("The length is: " + length);
		System.out.println("The height is: " + height);
	}
	
	@Override
	public double getArea() {
		return length * height;
	}

}
