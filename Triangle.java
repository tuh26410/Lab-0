package project0;

import java.lang.Math;

public class Triangle extends Shape{

	double sideA;
	double sideB;
	double sideC;
	double perimeter;
	
	public Triangle(String name) {
		super(name);
	}
	
	public void setDimensions(double sideA, double sideB, double sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
		perimeter = sideA + sideB + sideC;
	}
	
	@Override
	public void printDimensions() {
		System.out.println("The length of side A is: " + sideA);
		System.out.println("The length of side B is: " + sideB);
		System.out.println("The length of side C is: " + sideC);
	}
	
	@Override
	public double getArea() { 
		return Math.sqrt((perimeter / 2) * (perimeter - sideA) * (perimeter - sideB) * (perimeter - sideC));
	}

}
