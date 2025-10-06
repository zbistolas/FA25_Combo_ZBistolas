import java.util.Scanner;

public class BottlesOfBeer {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of bottles to start with: ");
		int bottles = input.nextInt();

		for (int i = bottles; i >= 0; i--) {
			if (i > 0) {

				if (i == 1) {
					System.out.println(i + " bottle of beer on the wall, " + i + " bottle of beer.");
				} else {
					System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
				}

				if (i - 1 == 1) {
					System.out
							.println("Take one down and pass it around, " + (i - 1) + " bottle of beer on the wall.\n");
				} else {
					System.out.println(
							"Take one down and pass it around, " + (i - 1) + " bottles of beer on the wall.\n");
				}
			} else {

				System.out.println("0 bottles of beer on the wall, 0 bottles of beer.");
				if (bottles == 1) {
					System.out.println("Go to the store and buy some more, " + bottles + " bottle of beer on the wall.");
				} else {
					System.out.println("Go to the store and buy some more, " + bottles + " bottles of beer on the wall.");
				}
			}
		}

		
	}
}