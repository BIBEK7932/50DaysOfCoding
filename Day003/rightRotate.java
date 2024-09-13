package Day003;

public class rightRotate {

        void rev(int []n,int s,int e){
            while(s<e){
                int t = n[s];
                n[s++] = n[e];
                n[e--] = t;
    
            }
        }
        public void rotate(int[] nums, int k) {  
            int n = nums.length-1;
            if(k>=nums.length) k%=(n+1);
            rev(nums,0,n-k);
            rev(nums,n-k+1,n);
            rev(nums,0,n);
    
        }
    
    
}
