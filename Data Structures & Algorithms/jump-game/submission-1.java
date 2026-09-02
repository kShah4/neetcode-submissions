class Solution {
    public boolean canJump(int[] nums) {
        int size = nums.length;
        int maxIndex= 0;
        for(int i= 0;  i< size; i++){
            if(i> maxIndex) return false;
            maxIndex = Math.max(i+nums[i] ,  maxIndex);


        }

        return false;
    }
}
