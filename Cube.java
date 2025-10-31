package patterns;

import java.util.Scanner;

public class Cube {
    // Define a color to print colored Strings
    public static final String YELLOW = "\u001B[33m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("side size : ");
        int n = scanner.nextInt();

        int space = n / 2; // Calculate initial space
        int max = n + space; // the maximun number of prints each line

        // Print the first n lines of the cube
        for (int i = 1; i <= n ; i++) {
            int a = space - i + 1; // Calculate the offset for the current line

            for (int j = 1; j <= max ; j++) {

                if ( i <= n ){

                    if (j > a ) System.out.print(YELLOW + " * ");
                    else System.out.print("   ");

                } else {
                    if ( j <= n + a)
                        System.out.print(" * ");
                    else 
                        System.out.print("  ");
                }

            }

            System.out.println();
        }
        
        // Print the lower part of the cube
        for (int i = 1 ; i <= space + 1 ; i++){
            for (int j = max ; j >  i ; j-- )
                System.out.print(" * ");
            System.out.println();
        }

        scanner.close();
    }
}
