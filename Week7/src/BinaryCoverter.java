import java.util.Scanner;

public class BinaryCoverter {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		//456
		//4 in hundreds, 5 in the tens, and the 6 in the ones
		//10^2 , 10^1, 10^0
		
		//10111---->23
		//1 in the ones, 1 in the twos, 1 in the fours, 0 in the eights, and 1 in the sixteens.
		//23 / 2 --> 11 with r of 1
		//11 / 2 --> 5 with r of 1
		//5/2 ----> 2 with r of 1
		//2/2---> 0 with r of 0
		//1/2---> 0 with r of 1
		
		System.out.println("Enter a number you wish to convert");
		int num = input.nextInt();
		
		displayBin(num);
	}
	private static void displayBin(int num) {
		if(num > 0)
		{
			displayBin(num /2);
			System.out.print(num % 2);
		}
		
	}

}
