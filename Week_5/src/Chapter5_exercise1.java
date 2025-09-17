import java.util.Scanner;

public class Chapter5_exercise1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPositive(number)) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is negative.");
        }

        scanner.close();
    }

    public static boolean isPositive(int num) {
        return num >= 0;
    }
}