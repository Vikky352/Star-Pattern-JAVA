import java.util.Scanner;
public class star_pattern_set3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 0; i <= (n+1)/2; i++) {
            for (int j = 0; j <i; j++) {
                        System.out.print("*");
            }
                for (int j = 0; j < (n+2+(n+1)/2)-i; j++) {
                    if (i == (n + 1) / 2)
                        System.out.print("@");
                    else
                        System.out.print(" ");
                }
                for (int j = 0; j < n + 2; j++)
                    System.out.print("*");
            
            System.out.println();
        }
        for (int i = 0; i < (n+1)/2; i++) {
            for(int j=n/2-i;j>0;j--)
                System.out.print("*");

            for(int k=0;k<n+3+i;k++)
                System.out.print(" ");
            
            for (int j = 0; j < n + 2; j++)
                    System.out.print("*");
            
            System.out.println();
        }
    }
}
