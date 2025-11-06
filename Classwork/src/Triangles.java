// Name: Zacahry Bistolas

import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) { // infinite loop until we break out
            int size = 0;

            // Prompt for valid size between 1 and 50
            do {
                System.out.print("Enter size: ");
                size = input.nextInt();

                if (size < 1 || size > 50) {
                    System.out.println("Size must be between 1-50!");
                }
            } while (size < 1 || size > 50);

            // Prompt for fill character
            System.out.print("Enter fill: ");
            char fill = input.next().charAt(0);

            // Draw the triangle
            drawTriangle(size, fill);

            // Ask user if they want another triangle
            System.out.println("Would you like another triangle (Y/N)?");
            System.out.print(": ");
            char response = input.next().charAt(0);

            // If the user says 'N' or 'n', stop the loop
            if (response == 'N' || response == 'n') {
                break; // exits the while(true) loop
            }
        }

        System.out.println("Goodbye!");
        input.close();
    }

    /**
     * Draws an equilateral triangle using the given size and fill character.
     * Adds spaces between each fill character for balance.
     */
    public static void drawTriangle(int size, char fill) {
        for (int i = 1; i <= size; i++) {
            // print leading spaces to center the triangle
            for (int space = 0; space < size - i; space++) {
                System.out.print(" ");
            }

            // print fill characters with spaces between them
            for (int j = 0; j < i; j++) {
                System.out.print(fill + " ");
            }

            System.out.println(); // move to next line
        }
    }
}