
/**
  n=3
 @@@
  @
***
* *
* *

 */
import java.util.*;

public class Star_pattern_youtube1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 0; i < (n + 1) / 2; i++) {
            for (int j = 0; j <= i + n / 2 - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < n - 2 * i; k++) {
                System.out.print("@");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || j == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}