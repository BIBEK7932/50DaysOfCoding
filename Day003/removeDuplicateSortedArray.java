package Day003;

public class removeDuplicateSortedArray {
    
        public int removeDuplicates(int[] nums) {
            int p=0;
            for(int i = 1;i<nums.length;i++){
                if(nums[p] != nums[i])
                    nums[++p] = nums[i];
                
            }
           return p+1;
        }
    
    
}
