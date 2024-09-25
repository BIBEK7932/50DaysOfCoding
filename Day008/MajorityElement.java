package Day008;

// import java.util.*;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        //no space
        int count = 0;
               int candidate = 0;
               
               for (int num : nums) {
                   if (count == 0) {
                       candidate = num;
                   }
                   
                   if (num == candidate) {
                       count++;
                   } else {
                       count--;
                   }
               }
               
               return candidate;


               //Uding space
               
//                HashMap<Integer,Integer> hm = new HashMap<>();
// for(int i =0;i<nums.length;i++){
//     hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
// }
// int max=nums.length/2;

// for(Integer val: hm.keySet()){
//     if(hm.get(val)>max) return  val;


// }
// return -1;
           }
}
