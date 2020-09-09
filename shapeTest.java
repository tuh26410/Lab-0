package project0;

import java.util.Scanner;

public class shapeTest {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Enter in the name for the Sqare: ");
		String square = in.nextLine();
		
		System.out.println("Enter in the length of the Square: ");
		double squareLength = in.nextDouble();
		
		System.out.println("Enter in the height of the Square");
		double squareHeight = in.nextDouble();
		
		Square squareObj = new Square(square);
		squareObj.setDimensions(squareLength, squareHeight);
		
		
		System.out.println("Enter in the name of the Circle: ");
		String circle = in.nextLine();
		circle = in.nextLine();
		
		System.out.println("Enter in the radius of the Circle: ");
		double circleRadius = in.nextDouble();
		
		Circle circleObj = new Circle(circle);
		circleObj.setDimensions(circleRadius);
		
		
		System.out.println("Enter in the name of the Triangle: ");
		String triangle = in.nextLine();
		triangle = in.nextLine();
		
		System.out.println("Enter in the length of side A: ");
		double sideA = in.nextDouble();
		
		System.out.println("Enter in the length of side B: ");
		double sideB = in.nextDouble();
		
		System.out.println("Enter in the length of side C: ");
		double sideC = in.nextDouble();
		
		Triangle triangleObj = new Triangle(triangle);
		triangleObj.setDimensions(sideA, sideB, sideC);
		
		
		System.out.println("Enter in the name of the Equilateral Triangle: ");
		String eqTriangle = in.nextLine();
		eqTriangle = in.nextLine();
		
		System.out.println("Enter in the side length for the Equilateral Triangle: ");
		double sideLength = in.nextDouble();
		
		Equilateral equilateralTriangleObj = new Equilateral(eqTriangle);
		equilateralTriangleObj.setDimensions(sideLength);
		
		
		System.out.println(squareObj.getName() + " has dimensions: ");
		squareObj.printDimensions();
		System.out.println(squareObj.getName() + " has area: " + squareObj.getArea());
		
		
		System.out.println(circleObj.getName() + " has dimensions: ");
		circleObj.printDimensions();
		System.out.println(circleObj.getName() + " has area: " + circleObj.getArea());
		
		
		System.out.println(triangleObj.getName() + " has dimensions: ");
		triangleObj.printDimensions();
		System.out.println(triangleObj.getName() + " has area: " + triangleObj.getArea());
		
		
		System.out.println(equilateralTriangleObj.getName() + " has dimensions: ");
		equilateralTriangleObj.printDimensions();
		System.out.println(equilateralTriangleObj.getName() + " has area: " + equilateralTriangleObj.getArea());

	}

}
