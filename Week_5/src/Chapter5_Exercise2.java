import java.util.Scanner;

public class Chapter5_Exercise2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num2 = scanner.nextInt();

        int greatest = greatestNumber(num, num1, num2);
        System.out.println("The greatest number is: " + greatest);

        scanner.close();
    }

    public static int greatestNumber(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}