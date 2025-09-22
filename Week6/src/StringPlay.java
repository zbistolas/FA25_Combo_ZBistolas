
public class StringPlay {

	public static void main(String[] args) {
		String str = "Computer Science Combo Class!";
		
		int index = 12;
		
		char ch = 'F';
		
		System.out.printf("Original String = %s%n", str);
		
		str = stringMod(index, ch, str);
		str = buildMod(index, ch, str);
		
		System.out.printf("Modified String = %s%n", str);
		System.out.printf("Modified String = %s%n", str);

	}

	private static String buildMod(int index, char ch, String str) {
		StringBuilder string = new StringBuilder(str);
		string.setCharAt(index, ch);
		return string.toString();
	}

	private static String stringMod(int index, char ch, String str) {
		return str = str.substring(0, index) + ch + str.substring(index + 1);
	}

}
