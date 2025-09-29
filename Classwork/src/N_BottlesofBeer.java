import java.util.Scanner;

public class N_BottlesofBeer {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many beers do you want to start with?");
		int beers = input.nextInt();
		for (int i = beers; i >= 0; i--) {
			if (i > 2) {
				System.out.println(i + " bottles of beer on the wall," + " " + i + " bottles of beer.");
				System.out.println("take one down and pass it around," + " " + (i - 1) + " bottles of beer on the wall.");
			 if(i ==2) {
					System.out.println("2 bottles of beer om the wall, 2 bottles of beer, you take on down and pass it around, 1 bottle of beer on the wall.");
				}
			} else if (i == 1) {
				System.out.println(
						"1 bottle of beer on the wall, 1 bottle of beer. Take one down and pass it around, 0 bottles of beer on the wall");
			} else {
				System.out.println(
						"0 bottles of beer on the wall, 0 bottles of beer, you take one down and pass it around."
								+ beers + " bottle of beer on the wall");
			}

		}

	}

}
