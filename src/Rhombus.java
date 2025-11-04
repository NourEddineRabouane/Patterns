package src;

import java.util.Scanner;

/*
 *    *
 *   ***
 *****
 ***
 *
 */
public class Rhombus {

    public static void main(String[] args) {
        int side;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Side size : ");
        side = scanner.nextInt();

        int limit = side * 2;

        // The first Triangle
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= limit; j++) {
                if (j < side + i && j > side - i) System.out.print("*");
                else System.out.print(" ");
            }

            System.out.println();
        }
        // The last triangle
        for (int i = side - 1; i >= 1; i--) {
            System.out.print(" ");
            for (int j = limit - 1; j >= 1; j--) {
                if (j < side + i + 1 && j > side - i + 1) System.out.print("*");
                else System.out.print(" ");
            }

            System.out.println();
        }

        scanner.close();
    }
}
