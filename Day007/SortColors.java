package Day007;

public class SortColors {
    void swap(int a[],int f,int l){
        int temp = a[f];
        a[f]=a[l];
        a[l] = temp;
    }
    public void sortColors(int[] nums) {
      

        //without space // Optimal
          int low=0,mid=0,high=nums.length-1;
          while(mid<=high){
            if(nums[mid] == 0){
                swap(nums,mid,low);
                mid++;low++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else if(nums[mid] == 2){
                swap(nums,mid,high);
                high--;
            }
          }

        
  // int ze=0,ones=0,twos=0;
      
        // for(int i =0;i<nums.length;i++){
        //     if(nums[i] == 0) ze++;
        //     else if(nums[i] == 1) ones++;
        //     else twos++;
        // }
        // for(int i =0;i<ze;i++){
        //     nums[i] = 0;
        // }
        //    for(int i =ze;i<ze+ones;i++){
        //     nums[i] = 1;
        // }
        //       for(int i =ze+ones;i<ze+ones+twos;i++){
        //     nums[i] = 2;
        // }
    }
}
