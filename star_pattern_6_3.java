/**
  n=3
     @    e
    @@    e
   @@@eeeee
 */
import java.util.*;
public class star_pattern_6_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       sc.close();
        for(int i=1;i<=n;i++){
            for(int j=i;j<n+1;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("@");
            }
            for(int l=0;l<n+2;l++){
                if(l==n+1 ||i==n)
                    System.out.print("e");
                else  
                    System.out.print(" ");              
            }
            System.out.println();
        }
    }
}