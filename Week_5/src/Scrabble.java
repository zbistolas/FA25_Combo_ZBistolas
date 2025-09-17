import java.util.Scanner;

//Drew, Zach, Austin

public class Scrabble {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter 7 letters");

		String tiles = input.next();

		System.out.println("input a word you wish to spell");

		String word = input.next();

		tiles = tiles.toLowerCase();

		boolean canSpell = canSpell(tiles, word);

		if (canSpell) {

			System.out.println("You can spell it");

		} else {

			System.out.println("You can't");

		}

	}

	private static boolean canSpell(String tiles, String word) { // a

		int len = word.length(); // shorthand for writing word.length every time

		int count = 0;

		char[] newWord = tiles.toCharArray();

		for (int i = 0; i < len; i++) {

			char letter = word.charAt(i);

			for (int j = 0; j < tiles.length(); j++) {

				if (newWord[j] == letter) { // a(count++) b b a (count++)

					newWord[j] = '*';

					count++;

					break;

				}

			}

		}

		if (count != len)
			return false;

		return true;

	}

}