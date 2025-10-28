import java.util.Scanner;

public class Recursing {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int n = 10;

		countdown(n);
		System.out.println();

		int factN = factorial(n);
		System.out.println(factN);

		for (int i = 0; i < n; i++) {
			System.out.println(factorial(i));
		}

		String another = "y";
		while (another.equals("y")) {
			System.out.println("Enter the fib level you want to go to.");
			int fibNum = input.nextInt();
			for (int i = 0; i < fibNum; i++) {
				System.out.print(fibonacci(i) + ", ");
				if (i % 7 == 0) System.out.println();
			}
			System.out.println("Again? (y/n)");
			another = input.next();
		}
	}

	private static int fibonacci(int n) {
		if (n < 1) {
			System.out.println("Please use a positive integer only");
			return 0;
		} else if (n == 1 || n == 2) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	private static int factorial(int n) {
		if (n == 0) return 1;
		return n * factorial(n - 1);
	}

	private static void countdown(int n) {
		if (n == 0) {
			System.out.println("Blast off");
		} else {
			countdown(n - 1);
			System.out.println(n);
			
		}
	}
}
