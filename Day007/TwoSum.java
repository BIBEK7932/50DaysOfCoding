package Day007;

import java.util.HashMap;

public class TwoSum {
       public int[] twoSum(int[] nums, int target) {
          HashMap<Integer, Integer> hm = new HashMap<>();
        int res[] = new int [2];
        for(int i=0;i<nums.length;i++ ){
          int a = target-nums[i];
            if(hm.containsKey( a)){

                res[0] = hm.get(a);
                res[1] = i;
                break;
            }
            hm.put(nums[i],i);
        }
        return res;
    }
}
