class Solution {
    public int rob(int[] nums) {
            int n =  nums.length;
            if (n ==1) return nums[0];
            if(n==2) return Math.max(nums[0] ,  nums[1]);
            int dp []  =  new int [n+1];
            int prev1 = nums[0];
            int prev2 =  Math.max(nums[0] , nums[1]);
            int ans = nums[1];

            for(int i=2 ; i < n;  i++){
            
                ans=  Math.max(prev1 +  nums[i] ,  prev2);
                prev1 =  prev2;
                prev2 =  ans;

            }

            return ans;
        
    }
}
