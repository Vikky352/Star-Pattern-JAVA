
/*
n=4
@
@
@****
@   ****      @
@      ****   @
          ****@
              @
              @
 */
import java.util.*;

public class Star_pattern_youtube5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 0; i < n / 2; i++) {
            System.out.println("@");
        }
        for (int i = 0; i < n; i++) {
            if (i < (n / 2) + 1)
                System.out.print("@");
            else
                System.out.print(" ");
            for (int j = 0; j < (n - 1) * i; j++)
                System.out.print(" ");
            for (int j = 0; j < n; j++)
                System.out.print("*");
            for (int j = 0; j < ((n - 1) * (n - 1)) - (n - 1) * i; j++)
                System.out.print(" ");
            if (i > (n / 2) - 2)
                System.out.print("@");
            else
                System.out.print(" ");
            System.out.println();
        }
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < (n * n) - (n - 2); j++)
                System.out.print(" ");
            System.out.print("@");
            System.out.println();
        }

    }
}
