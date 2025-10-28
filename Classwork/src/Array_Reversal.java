import java.util.Scanner;

public class Array_Reversal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = new int[100];
		int number = 0;

		System.out.println("Enter positive number. Enter -1 to finish.");
		for (int i = 0; i < 101; i++) {
			number = input.nextInt();
			nums[i] = number;
			if (number < 0 && number != -1) {
				System.out.println("number mus be positive");
			}
			if (number == -1) {
				break;
			} else {
				System.out.println("Enter another number");
			}

		}
		int index = 99;
		for (int i = 0; i < 100; i++) {
			if (nums[i] == -1) {
				index = i - 1;

				break;
			}
		}

		for (int i = index; i >= 0; i--) {
			System.out.println(nums[i]);
		}

	}

}
