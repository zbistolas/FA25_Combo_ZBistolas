
public class InClassLoops {

	public static void main(String[] args) {
		int sum = sumFor();
		System.out.print(sum);
		int terms = 10;
		int rows = 7;
		ForFibonacci(terms);

		rightTri();
	}

	private static void rightTri() {
		int rows = 7;
		for (int i = 0; i < rows + 1; i++) {
			for (int j = 0; j < rows - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print(j + " ");
			}
		}
	}

	private static void ForFibonacci(int terms) {
		if (terms < 1) {
		    System.out.println("Please use a positive integer only");
		    return;
		}

			int firstTerm1 = 0;
			int secondTerm = 1;
			System.out.printf("Fibonacci sequence up to %d terms", terms);

			if (terms == 1) {
				System.out.print(firstTerm1);
				return;
			}

			System.out.println(firstTerm1 + ", " + secondTerm);
			for (int i = 2; i < terms; i++) {
				int nextTerm = firstTerm1 + secondTerm;
				System.out.print(" , " + nextTerm);

				firstTerm1 = secondTerm;
				secondTerm = nextTerm;
			}
		}
	

	private static int sumFor() {
		int sum = 0;
		for (int i = 0; i < 10; i++) {
		    sum += i;
		}
		return sum;
	}

}
