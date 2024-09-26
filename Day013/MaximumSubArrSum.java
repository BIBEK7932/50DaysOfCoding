package Day013;

public class MaximumSubArrSum {
    //optimal solution
    public int maxSubArray(int[] nums) {
        int sum =0,max=Integer.MIN_VALUE;    
        for(int i =0;i<nums.length;i++){
            sum+=nums[i];
           max = Math.max(max,sum);
        if(sum<0 ) sum =0;
        }
              return max;

    }

    //brute sol
    public static int maxSubarraySum(int[] arr, int n) {
        int maxi = Integer.MIN_VALUE; // maximum sum

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                // current subarray = arr[i.....j]

                //add the current element arr[j]
                // to the sum i.e. sum of arr[i...j-1]
                sum += arr[j];

                maxi = Math.max(maxi, sum); // getting the maximum
            }
        }

        return maxi;
    }


}
