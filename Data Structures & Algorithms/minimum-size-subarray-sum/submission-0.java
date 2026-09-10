class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int currSum = 0;
        int l = 0;
        int len  =  Integer.MAX_VALUE;
        for(int r=0; r< nums.length; r++){
             currSum += nums[r];
             while(currSum >= target){
                len = Math.min(r-l+1, len);
                currSum = currSum -  nums[l];
                l++;
             }
      
        }
    return len ==  Integer.MAX_VALUE ? 0 : len;
    }
}