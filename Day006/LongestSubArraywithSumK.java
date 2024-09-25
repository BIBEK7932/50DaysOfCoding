package Day006;

import java.util.HashMap;

public class LongestSubArraywithSumK {
        public static int lenOfLongSubarr(int A[], int N, int K) {
            HashMap<Integer,Integer> hm = new HashMap<>();
        int len =0,sum=0;
        for(int i =0;i<N;i++){
            sum+=A[i];

            if(sum == K) len = Math.max(len,i+1);;
           
            int ps = sum - K;
            if(hm.containsKey(ps)){
                int cl = i - hm.get(ps);
                len = Math.max(len,cl);
            }
        
        if(!hm.containsKey(sum)){
            hm.put(sum,i);
        }
                    
        }
        return len;

   
    }
}
