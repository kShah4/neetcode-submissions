class Solution {
    public int findMin(int[] nums) {
        int l =1; 
        int r = nums.length-1;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(nums[mid] > nums[r]){
                l = mid;
            }else if(nums[mid] < nums[l]){
                r = mid;
            }
            if(nums[mid] < nums[mid-1]){
                return nums[mid];
            }



        }
      return nums[0];  
    }
}
