
public class StringsWork {

	public static void main(String[] args) {
		String word = "bananas";
		
		for(int i = 0; i < word.length(); i ++)
		{
			System.out.println(word.charAt(i));
		}
		String reversed = reversed(word);
		System.out.println(reversed);
	}

	private static String reversed(String word) {
		String r = "";
		for(int i = word.length()-1; i >=0; i--)
		{
			r += word.charAt(i);
		}
		return r;
	}

}
