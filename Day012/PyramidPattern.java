package Day012;

import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     System.out.println("Enter first Num:");
     int r = sc.nextInt();
     System.out.println("Enter first Num:");
   //   int c = sc.nextInt();
   //   int p = 0;
     for(int i = 1;i <= r; i++){
        for(int j=1; j <= r-i; j++){
            System.out.print(' ');
         }
         for(int j=1; j <= i; j++){
            System.out.print(j);
         }
         for(int k = i-1; k >= 1;k-- ){
            System.out.print(k);
         }
         System.out.println();
        }
        sc.close();;
    }
}
