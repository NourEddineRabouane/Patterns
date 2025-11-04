package src;

import java.util.Scanner;

/*
 *   ******************
 *   ******************
 *   ******************
 *   ******************
 */

public class Rectangle {

    public static void main(String[] args) throws Exception {
        int rows, cols;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Rows number : ");
        rows = scanner.nextInt();

        System.out.print("Cols number : ");
        cols = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
