
/* n=3
    *
   ***
   @ @
   @ @
***@ @***
 *     *
 
 */
import java.util.*;

public class Star_pattern_youtube3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 0; i < n / 2 + 1; i++) {
            for (int j = i; j < (n / 2) + n; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i * 2) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < n; k++) {
                if (k == 0 || k == n - 1)
                    System.out.print("@");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
        for (int i = 0; i < (n + 1) / 2; i++) {
            for (int j = 0; j < i; j++)
                System.out.print(" ");
            for (int j = 0; j < n - 2 * i; j++) {
                System.out.print("*");
            }
            if (i == 0) {
                for (int k = 0; k < n; k++) {
                    if (k == 0 || k == n - 1)
                        System.out.print("@");
                    else
                        System.out.print(" ");
                }
            }
            else {
                for (int k = 0; k < n + (2 * i); k++) {
                    System.out.print(" ");
                }
            }
            for (int l = 0; l < n - 2 * i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
