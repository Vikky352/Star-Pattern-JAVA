import java.util.Scanner;

public class Round1_set2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 0; i < n/2+1 ; i++) {
            for (int j = 0; j < 2 * n + i; j++)
                System.out.print(" ");
            for (int k = 0; k < (n + 1) - (2 * i); k++)
                System.out.print("@");
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n / 2; j++)
                System.out.print(" ");
            for (int k = 0; k < n * 2; k++)
                System.out.print("*");
            System.out.println();
        }
        for (int i = 0; i < (n + 2) / 2; i++) {
            for (int j = i; j < n / 2; j++)
                System.out.print(" ");
            for (int l = 0; l <= i; l++)
                System.out.print("@");
            System.out.println();
        }
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print(" ");
            for (int k = i; k < n / 2; k++)
                System.out.print("@");
            System.out.println();
        }
    }

}