import java.util.Random;

public class Dice {
	static Random rand = new Random();
	private int sides;

	public static int roll(int sides) {
		int result = rand.nextInt(sides) + 1;
		return result;
	}

}
