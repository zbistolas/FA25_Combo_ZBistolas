import java.util.Scanner;

public class BeveragSelector {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Which beverage would you like to select? 1: water. 2: Coke. 3: Coffee.");
		int selectedBeverage = input.nextInt();
		if (selectedBeverage == 1) {
			System.out.println("You have selected water");
		} else if (selectedBeverage == 2) {
			System.out.println("You have selected Coke");
		} else {
			System.out.println("You have selected Coffee");
		}

	}

}
