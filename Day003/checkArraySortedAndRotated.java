package Day003;

public class checkArraySortedAndRotated {
    public boolean check(int[] nums) {
        int count = 0;
      int n = nums.length;
      
      for (int i = 0; i < n; i++) {
          // Compare current element with the next element in circular manner
          if (nums[i] > nums[(i + 1) % n]) {
              count++;
          }
          // If there is more than one "jump", it's not a valid rotated sorted array
          if (count > 1) {
              return false;
          }
      }
      
      return true; 
  }
}
