class Solution {
    public int maxSubArray(int[] nums) {
        int size = nums.length;
        int max = Integer.MIN_VALUE;
        int l =0 ; 
        int count=0;
         for(int r =0 ;  r< size; r++){
            count = count + nums[r];
            max = Math.max(count , max);
            if(count < 0) {
                l = r+1;
                count = 0;
            }
         }

        return max;
        
    }
}
