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
		
		int fibNum = fibbonacci(n);
		String another = "y";
		while(another.equals("y"))
				{
					System.out.println("enter the fib level you want to go to.");
					fibNum = input.nextInt();
					for (int i = 0; i < fibNum; i++) {
						System.out.println(fibbonacci(i) + ", ");
						if(i % 7 == 0)System.out.println();
					}
					System.out.println("Again?");
					another = input.next();
				}
	}

	private static int fibbonacci(int n) {
		if(n < 1 );
		{
			System.out.println("Please use a positive integers only");
			return 0;
		}
		if(n == 1 || n == 2)return 1;
		
		return fibbonacci(n-1) + fibbonacci(n-2);
	}

	private static int factorial(int n) {
		if(n == 0) return 1;// base case is when the looping stops.
		int recurse = factorial(n-1);
		int result = n * recurse;
		return result;
	}

	private static void countdown(int n) {
		if(n == 0)
		{
			System.out.println("Blast off");
		}else
		{
			System.out.println(n);
			countdown(n-1);
		}
	}
		
	
	
	
}


