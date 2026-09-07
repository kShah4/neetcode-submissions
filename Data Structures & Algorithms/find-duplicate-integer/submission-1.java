class Solution {
    public int findDuplicate(int[] nums) {
            for(int num : nums){
                int val =  Math.abs(num) -1;
                if(nums[val] < 0){
                    return Math.abs(num);
                }
                nums[val] =  nums[val]*-1;
        }

        return -1;
        
    }
}
