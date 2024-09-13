package Day003;

public class secondLargest {
    public int print2largest(int[] arr) {
        // Code Here
        if(arr.length<=1) return -1;
        int m1=Integer.MIN_VALUE,m2=Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>m1){
                m2 = m1;
                m1 = arr[i];
            }
            if(arr[i]<m1 && m2<arr[i]){
                m2 =arr[i];
            }
        }
        return (m2==Integer.MIN_VALUE) ? -1: m2;
    }
}
