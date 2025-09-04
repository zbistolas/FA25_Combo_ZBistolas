import java.util.Scanner;

public class Car_rental {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int days, miles, dayPrice, carCode;
		double total, milePrice;

		total = 0;

		System.out.println("Car code?");
		carCode = input.nextInt();
		if (carCode == 1) {
			dayPrice = 75;
			milePrice = 1.5;
		} else if (carCode == 2) {
			dayPrice = 45;
			milePrice = .85;
		} else {
			dayPrice = 35;
			milePrice = .45;
		}
		System.out.println("How many days?");
		days = input.nextInt();

		System.out.println("How many miles?");
		miles = input.nextInt();

		total = days * dayPrice + miles * milePrice;

		System.out.printf("Your total cost for the rental is $%.2f", total);
	}
}
