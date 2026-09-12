class Solution {
    public int maxSubArray(int[] nums) {
        int count = 0;
        // int l =0;

        int maxSum =  Integer.MIN_VALUE;
        for(int i =0  ;  i < nums.length; i++){
            count =  count + nums[i];
            maxSum =  Math.max(count , maxSum);
            if(count<0){
                count= 0;     
            }

        }
        return maxSum;
        
    }
}
