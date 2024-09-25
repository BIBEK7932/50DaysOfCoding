package Day009;

import java.util.Scanner;

public class NumberIsKarpekarOrnot {
       static boolean isKa(int a){
      long n = a * a;
    long n1 = n;
      int c = 0;
      while (n1 > 0) {
         c++;
         n1 /= 10;
      }
     if(c==1) return n==1;
      int j = 10;
      for (int i = 1; i < c; i++) {
         long sum = n / j + n % j;
       if(j==a) return false;
         if (sum == a) {
           return true;
         }
j *= 10;
      }
      return false;
   }
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while (t > 0) {
         int a = sc.nextInt();
         if(isKa(a)){
            System.out.println(1);
         }
         else{
            System.out.println(0);
         }
         t--;
      }
   }
}
