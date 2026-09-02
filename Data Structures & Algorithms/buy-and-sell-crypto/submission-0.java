class Solution {
    public int maxProfit(int[] prices) {
        int profit =0;
        int n = prices.length; 
        int[] dp = new int[n];
        for(int i =0 ; i<n; i++){
            for(int j=i+1; j<n-1; j++){
                dp[i] = Math.max(dp[i], prices[j]-prices[i]);
                profit = Math.max(profit,dp[i]);
            }
        }

    return profit;   
    }
}
