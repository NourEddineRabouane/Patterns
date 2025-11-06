package patterns;

import java.util.Scanner;

/*
 *   1
 *   1 2
 *   1 2 3
 *   1 2 3 4
 *   1 2 3
 *   1 2
 *   1
 */

public class NumberKitePattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print(" Number : ");
        number = scanner.nextInt();

        // rows from 1 to the number " increasing part "
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // rows from number + 1 to number * 2 - 1 " decreasing part "
        for (int i = number - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
