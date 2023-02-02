import java.util.Scanner;
public class starpattern2_1 {
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      sc.close();
    for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){
            if(i==0||j==n-1||i==n-1)
            System.out.print("*");
            else
            System.out.print(" ");
         }
         for(int j=1;j<=n+2;j++){
            if(n/2==i)
            System.out.print("@");
            else
            System.out.print(" ");
         }
         if(i<(n+1)/2){
            for(int j=0;j<=i;j++){
               System.out.print("*");
            }
         }
         else{
            for(int j=i;j<n;j++){
               System.out.print("*");
            }
         }

      System.out.println();
      }
   } 
}
