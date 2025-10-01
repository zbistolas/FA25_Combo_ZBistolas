import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// using this while loop until they enter a positive number.
		int number;
		System.out.println("Enter a positive number");
		number = input.nextInt();
		while(number <= 0)
		{
			System.out.println("That's not a positive number. Try again");
			number = input.nextInt();
		}
		System.out.println("Thanks");

	}

}
