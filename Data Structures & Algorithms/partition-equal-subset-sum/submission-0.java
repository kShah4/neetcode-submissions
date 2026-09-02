class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;

        for(int num :  nums){
            sum + = num;
        }
        if(sum%2 !=0) {
            return false;
        }
        boolean dp[][] = new boolean[nums.length+1][sum/2+1];
        for(int i =0 ; i < nums.length+1 ; i++){
            for(int j=0 ; j< (sum/2+1); j++){
                if(j==0){
                    dp[i][j] = false;
                }
            }
        }

        for(int i =0 ; i< nums.length+1 ; i ++){
             for(int j=0 ; j< (sum/2+1); j++){
                    



             }
        }
        
    }
}
