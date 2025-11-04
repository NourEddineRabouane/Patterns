package patterns;

import java.util.Scanner;

/*
 *  *        ****
 *  **       ***
 *  ***      **
 *  ****     *
 */

public class HalfPyramid {

    public static void main(String[] args) {
        int rows;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Rows number : ");
        rows = scanner.nextInt();

        // Half Pyramid
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Inverted Half Pyramid
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
