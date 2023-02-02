/*
n=3
*      
**   *
*******
***  *
**
*

 */
import java.util.*;
public class star_pattern_youtube2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int k=0;k<2*n-i;k++){
                if(i<n-1){
                    if(k==n && i==n-2)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                else
                    System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for( int j=1;j<n-i;j++){
                System.out.print("*");
            }
            for(int k=n+i;k>=0;k--){
                if(k==n-n && i==0)
                    System.out.print("*");
                else
                System.out.print(" ");  
            }
            System.out.println();
        }
    }
}
