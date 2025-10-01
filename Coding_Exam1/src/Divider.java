import java.util.Scanner;

public class Divider {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the first number");
		float input1 = input.nextFloat();
		System.out.println("Please enter the second number");
		float input2 = input.nextFloat();

		if (input1 == 0 || input2 == 0) {
			System.out.println("You cannot enter a 0. Try again");
		} else {
			float answer = input1 / input2;
			System.out.printf("The answer is: %.2f", +answer);
		}

	}

}
