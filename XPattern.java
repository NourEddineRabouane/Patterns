package patterns;

import java.util.Scanner;

/*
 *      *     *
 *       *   *
 *        * *
 *         *
 *        * *
 *       *   *
 *      *     *
 * 
 */ 

public class XPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Path size : ");
        number = scanner.nextInt();

        // The maximun side size for a give number
        int max = number * 2 - 1;

        for ( int i = 1 ; i <= max ; i++ ){
            // We have two * prints for each line the i and the pos positions
            int pos = max - i + 1;

            for ( int j = 1 ; j <= max ; j++ ){
                if ( j == i || j == pos )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}