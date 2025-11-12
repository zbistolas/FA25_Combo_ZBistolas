import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TotlaCalculation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the file you would like to work with?");
		String fileName = input.next();
		File inputFile = new File(fileName);
		

		double subtotal = readAndSum(inputFile);
		double taxRate = 0.053;
		double tax = subtotal * taxRate;
		double total = subtotal + taxRate;

		writeTotals(subtotal, taxRate, total);
		System.out.println("Calculations complete. Your total has been input to total.txt");

	}

	private static void writeTotals(double subtotal, double tax, double total) {
		try (FileWriter myWriter = new FileWriter("total.txt")) {
			myWriter.write(String.format("Subtotal: $%.2f%n", subtotal));
			myWriter.write(String.format("Sales Tax (5.3%%): $%.2f%n", tax));
			myWriter.write(String.format("Final Total: $%.2f%n", total));
		} catch (IOException e) {
			System.out.println("Error writing to file.");
		}

	}

	private static double readAndSum(File inputFile) {
		double sum = 0.0;
		try (Scanner myReader = new Scanner(inputFile)) {
			while (myReader.hasNext()) {
				if (myReader.hasNextDouble()) {
					sum += myReader.nextDouble();
				} else
					myReader.next();
			}
		}

		catch (FileNotFoundException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}

		return sum;
	}

}
