package project0;

import java.lang.Math;

public class Equilateral extends Triangle{

	double sideLength;
	
	public Equilateral(String name) {
		super(name);
	}
	
	public void setDimensions(double sideLength) {
		this.sideLength = sideLength;
	}
	
	public void printDimensions() {
		System.out.println("The side lengths are: " + sideLength);
	}
	
	public double getArea() {
		return (Math.sqrt(3) / 4) * (sideLength * sideLength);
	}

}
