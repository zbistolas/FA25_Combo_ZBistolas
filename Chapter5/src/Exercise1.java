import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int number = input.nextInt();
		if(isPositive(number))
		{
			System.out.println("The number is positive!");
		}else
		{
			System.out.println("The number is negative.");
		}

	}

	private static boolean isPositive(int number) {
		return number >=0;
	}

}
