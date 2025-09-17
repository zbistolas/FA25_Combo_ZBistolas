import java.util.Scanner;

public class CircleCalculation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the radius of the circle?");
		double radius = input.nextDouble();
		double diameter = calculateDiameter(radius);
		double circumference = calculateCircumference(radius);
		double area = calculateArea(radius);
		System.out.println("Diameter: " + diameter);
		System.out.println("Circumference: " + circumference);
		System.out.println("Area: " + area);
		

	}

	private static double calculateArea(double radius) {
		return Math.PI * radius *radius;
	}

	private static double calculateCircumference(double radius) {
		return 2 * Math.PI * radius;
	}

	private static double calculateDiameter(double radius) {
		return 2 * radius;
	}

}
