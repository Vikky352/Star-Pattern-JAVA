import java.util.Scanner;
public class StarPattern_set4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for(int i=0;i<=(n+1)/2;i++){
            for(int k=0;k<n-i;k++)
                System.out.print(" ");

            for(int j=0;j<i;j++)
                System.out.print("*");
            
            for(int k=0;k<n+2;k++)
                if(i==(n+1)/2)
                    System.out.print("@");
                else
                    System.out.print(" ");
            for(int m=0;m<n+2;m++)
                System.out.print("*");
            System.out.println();
        }
        for(int i=0;i<(n+1)/2;i++){
            for(int k=0;k<=n/2+i;k++)
                System.out.print(" ");
            
            for(int l=0;l<n/2-i;l++)
                System.out.print("*");

            for(int l=0;l<n+2;l++)
             System.out.print(" ");   

            for(int p=0;p<n+2;p++)
                System.out.print("*");
            
            System.out.println();
        }
    }
}
