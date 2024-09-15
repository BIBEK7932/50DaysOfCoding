package Day004;

public class MissigElement {
    public int missingNumberMostOptimal(int[] nums) {
        int xor =0;
        int i =0;
        for(;i<nums.length;i++){
            xor^=nums[i]^(i);
        }
        xor^=i;
        return xor;

    }
    public int missingNumber(int[] nums) {
        int s = nums.length;
        int sum1 = s*(s+1)/2;
        int sum = 0;
        for(int i =0;i<s;i++){
            sum+=nums[i];
        }
        return sum1-sum;
    }
    
}
