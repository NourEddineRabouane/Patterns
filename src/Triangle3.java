import java.util.Scanner;

/*
 * 1
 * 2 5
 * 3 6 8
 * 4 7 9 10
 */

public class Triangle3{

  public static void main(String[] args){
		int n ;
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Number: ");
    n = scanner.nextInt();

		for(int i=1;i<=n;i++){
			int counter = i;
			
      for(int j=1;j<=i;j++){
				System.out.print(counter+ " ");
				counter = counter+n-j; 
			}
			
      System.out.println();
		}

    
  }
}
