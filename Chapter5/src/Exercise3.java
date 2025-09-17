import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a floating point number: ");
		double number = input.nextDouble();
		describeNumber(number);

	}

	private static void describeNumber(double num) {
		if (num == 0) {
			System.out.println("Zero");
		} else if (num > 0) {
			System.out.println("Number is positive");
		}
		if (num < 1 && num > -1) {
			System.out.println("small");
		}
		if (num > 1000000 || num < -1000000) {
			System.out.println("LARGE");
		}if (num < 0) {
			System.out.println("number is negative");
		}

	}
}
