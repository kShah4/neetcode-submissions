class Solution {
    public int maxProduct(int[] nums) {
        int max_global =  nums[0];
        int min_global =  nums[0];
        int result =  max_global;
        for(int i =1 ;  i < nums.length;  i++){
            int curr  =  nums[i];
            int curr_max =  Math.max(curr, Math.max(curr * max_global, curr * min_global));
             min_global =  Math.min(curr, Math.min( curr * max_global, curr * min_global));

            max_global =  curr_max;
            result =  Math.max(max_global, result);

        }


        return result;
        
    }
}
