package src;

import java.util.Scanner;

/*
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
*/

public class Triangle2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Number : ");
        number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
