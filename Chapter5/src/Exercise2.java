import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the first number: ");
		int num = input.nextInt();
		System.out.println("Please enter the second number: ");
		int num1 = input.nextInt();
		System.out.println("Please enter the third number: ");
		int num2 = input.nextInt();
		
		int greatest = greatestNumber(num, num1, num2);
		
		System.out.println("The greatest number is: " + greatest);

	}

	private static int greatestNumber(int num, int num1, int num2) {
		int max = num;
		if(num1 > num)
		{
			max = num1;
		}if(num2 > max)
		{
			max = num2;
		}
		return max;
	}

}
