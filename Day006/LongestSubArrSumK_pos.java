package Day006;

public class LongestSubArrSumK_pos {
    public static int longestSubarrayWithSumK(int []A, long K) {
        int N = A.length;
     int len = 0;
     long sum = 0;
     int j = 0; 
     for (int i = 0; i < N; i++) {
         sum += A[i];
         while (sum > K && j <= i) {
             sum -= A[j];
             j++;
         }
         if (sum == K) {
             len = Math.max(len, i - j + 1); 
         }
     }
     return len;
 }
}
