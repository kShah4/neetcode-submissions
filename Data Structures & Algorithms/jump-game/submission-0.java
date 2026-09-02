class Solution {
    public boolean canJump(int[] nums) {
        int size = nums.length;
        int maxIndex= 0;
        for(int i= 0;  i< size; i++){
            int cuurentMax= i + nums[i];
            maxIndex = Math.max(maxIndex , cuurentMax);
            if(nums[maxIndex] == 0){
                return false;
            }
            
        }
        return (maxIndex == size-1);
    }
}
