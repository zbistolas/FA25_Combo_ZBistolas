import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter you numeric grade");
		double numericGrade = input.nextDouble();

		if (numericGrade < 0) {
			System.out.println("Error: invalid grade");
		} else if (numericGrade >= 92) {
			System.out.println("Your grade is an A");
		} else if (numericGrade >= 89) {
			System.out.println("Your grade is an A-");
		} else if (numericGrade >= 87) {
			System.out.println("Your grade is a B+");
		} else if (numericGrade >= 82) {
			System.out.println("Your grade is a B");
		} else if (numericGrade >= 79) {
			System.out.println("Your grade is a B-");
		} else if (numericGrade >= 77) {
			System.out.println("Your grade is a C+");
		} else if (numericGrade >= 72) {
			System.out.println("Your grade is a C");
		} else if (numericGrade >= 69) {
			System.out.println("Your grade is a C-");
		} else if (numericGrade >= 67) {
			System.out.println("Your grade is a D+");
		} else if (numericGrade >= 60) {
			System.out.println("Your grade is a D");
		} else if (numericGrade < 60) {
			System.out.println("Your grade is a F");
		}

	}

}
