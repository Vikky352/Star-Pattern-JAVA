import java.util.*;
public class star_pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               if(j==0||j==n-1||i==n-1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=0;i<n+2;i++){
            for(int j=1;j<=(n+1)/2;j++){
                if(j==(n+1)/2){
                System.out.println("@");
                break;
                }
                else
                System.out.print(" ");
            }
        }
        for(int i=1;i<=n;i++){
            for(int k=1;k<i;k++){
                System.out.print(" ");
            }
            for(int j=n+2;j>(i*2);j--){
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
