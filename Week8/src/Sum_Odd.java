
public class Sum_Odd {

	public static void main(String[] args) {
		int num = 20;

		int sum_odd = SumOdd(num);
		System.out.println(sum_odd);

	}

	private static int SumOdd(int num) {
		if (num == 0)
			return 0;
		if (num % 2 == 1)
			return SumOdd(num - 1) + num;
		else
			return SumOdd(num - 1);
	}

}
