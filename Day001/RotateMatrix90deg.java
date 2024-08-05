package Day001;

import java.util.Scanner;

/**
 * RotateMatrix90deg
 */
public class RotateMatrix90deg {

    public static void main(String[] args) {
        int tcase;
Scanner sc = new Scanner(System.in);
    tcase = sc.nextInt();
 while(tcase>0){
  int r;
    int i,j;
 r = sc.nextInt();
  int [][] a= new int[r][r];
  for(i = 0; i < r; i++){
    for(j = 0; j < r; j++)
    a[i][j] = sc.nextInt();
  }
  for(i = 0; i < r; i++){
    for(j = 0; j < r; j++){
      if(j!=0) System.out.print(" ");
      System.out.print(a[r-j-1][i]);
    }
   System.out.println();
  }
  System.out.println();
   tcase--;
   sc.close();
 }
    }
}