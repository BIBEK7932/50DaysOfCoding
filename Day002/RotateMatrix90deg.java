package Day002;

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
  //change the arr
//1. Travarse the matrix
for( i =0;i<r-1;i++){
  for(j=i+1;j<r;j++){
    int d = a[i][j];
    a[i][j] = a[j][i];
    a[j][i] = d;
  }
}
//2. Reverse every row
for(i = 0; i < r; i++){
  for(j = 0; j <= r/2; j++){
int d = a[i][r-1-j];
a[i][r-1-j] = a[i][j];
a[i][j] = d;
  }}
//print original

for(i = 0; i < r; i++){
  for(j = 0; j < r; j++){
    if(j!=0) System.out.print(" ");
    System.out.print(a[i][j]);
  }
 System.out.println();
}
System.out.println();


  //just printing
  // for(i = 0; i < r; i++){
  //   for(j = 0; j < r; j++){
  //     if(j!=0) System.out.print(" ");
  //     System.out.print(a[r-j-1][i]);
  //   }
  //  System.out.println();
  // }
  // System.out.println();
   tcase--;
   sc.close();
 }
    }
}