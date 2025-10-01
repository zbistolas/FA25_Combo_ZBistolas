
public class forLoop {

	public static void main(String[] args) {
		// to add up first ten numbers
		int sum = 0;
		for (int i = 1; i <= 10; i++)// change whatever number is i <= 10 to change what numbers are being added up
		{
			sum += i;
		}
		System.out.println("The sum of the first 10 numbers are " + sum);
		// for division, to change what its being divided by change this. *
		for (int i = 1; i <= 10; i++) {// change 10 to the number you want to divide up to.
			double result = (double) i / 2;// *
			System.out.println(i + " divided by two is " + result);
		}
		// print numbers up to 10
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
}
