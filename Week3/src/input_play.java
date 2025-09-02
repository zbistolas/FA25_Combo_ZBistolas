import java.util.Scanner;

public class input_play {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("What is your name");

		String name = input.next();

		System.out.println("Great " + name + "!");

		System.out.println("Enter your age in years");

		int age = input.nextInt();

		System.out.println("Your age is " + age);

		System.out.println("What is the temp in F");

		double fTemp = input.nextDouble();// input for a floating point number double

		double cTemp = convertToC(fTemp);// calling s method that returns a double and takes a double as a parameter

		double kTemp = converToC(cTemp);

		System.out.println(fTemp + "F is " + cTemp + "C and " + kTemp + "k");

		System.out.printf("%.2f F is %.2f C and %.2f K", fTemp, cTemp, kTemp);

		System.out.println("Entrer kilos");

		double kilos = input.nextDouble();

		double pounds = convertToPounds(kilos);

		System.out.printf("% .2f", pounds);
	}
//
	private static double convertToPounds(double kilos) {

		return kilos * 2.2;

	}

//private is the access static means its outside of main
// printInput is the name and there are no params
	private static double convertToC(double fTemp) {
		// TODO Auto-generated method stub
		return 0;
	}

// public lets everyone use this
// double is the data type of what is returned
// double fTemp is the variable used inside of this method/argument
	public static double converToC(double fTemp) {
		return (fTemp - 32) * 5 / 9;
	}

	public static double converToK(double cTemp) {
		return cTemp + 273.15;
	}
}