
/*
n=3
    *@@@   @@@*
   **  @   @  **
    *  @   @  *
       *****
        ***
         *
 */
import java.util.*;

public class Star_pattern_youtube4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 0; i < (n + 1) / 2; i++) {
            for (int j = i; j < n / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == n - 1)
                    System.out.print("@");
                else
                    System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0)
                    System.out.print("@");
                else
                    System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < i + 1; j++)
                System.out.print(" ");
            for (int j = 0; j < (n / 2) - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n; j++) {
                if (j == n - 1)
                    System.out.print("@");
                else
                    System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                if (j == 0)
                    System.out.print("@");
                else
                    System.out.print(" ");
            }
            for (int j = 0; j < (n / 2) - i; j++) 
                System.out.print("*");
            
            System.out.println();
        }
        for (int i = 0; i < (n / 2) + 2; i++) {
            for (int j = 0; j < n + (n / 2) + i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (n + 2) - 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
