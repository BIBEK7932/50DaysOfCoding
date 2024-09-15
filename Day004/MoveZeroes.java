package Day004;

import java.util.ArrayList;
import java.util.Iterator;

public class MoveZeroes {
    public static void moveZerosOptimal(int[] a) {
        //Step1: Finding 1st zero(0) index
int j =-1;
for(int i =0;i<a.length;i++){
    if(a[i]==0){
        j=i;
        break;
    }
}
if(j==-1) return;
//swaiping zeroes

for(int i =j+1;i<a.length;i++){
if(a[i]!=0){
    int temp = a[i];
    a[i]=a[j];
    a[j] = temp;
    j++;
}
}

    }
    
    //Brute force 
    public static void moveZeros(int[] a) {
        ArrayList<Integer> ar = new ArrayList<>();
        int n = a.length;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
               
ar.add(a[i]);
            }
        }

        int i =0;
   
        System.out.println(ar);
        Iterator<Integer> it = ar.iterator();
        while (it.hasNext()) {
            a[i] = it.next();
           
            i++;
        }
       
        for(int j=i;j<n;){
a[j++] = 0;

        }
    }
    public static void main(String[] args) {
        int arr[]={0,12,300,0,0,5,6,0,44,0};
        moveZerosOptimal(arr);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
}
