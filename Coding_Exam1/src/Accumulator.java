import java.util.Scanner;

public class Accumulator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int total=0;
		System.out.println(
				"Please enter a number you would like to put in, we will add every number until you input a zero. Please enter a number");
		int num = input.nextInt();
		while (num != 0) {
			total += num;
			System.out.println("Select another number");
			num = input.nextInt();

		}
		System.out.println("Your total is: " + total);
	}

}
