import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the temperature in Fahrenheit.");
		double fahrenheit = input.nextDouble();
		double celcius = (fahrenheit - 32) * 5 /9;
		double kelvin = celcius + 273.15;
		System.out.println("The temperature converted to celcius is: " + celcius);
		System.out.println("The temperature converted to kelivn is: " + kelvin);

	}
}
