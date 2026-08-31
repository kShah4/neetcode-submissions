class Solution {
    public int maxProfit(int[] prices) {
        int profit =0;
        int n = prices.length; 
        int[] dp = new int[n];
        for(int i =0 ; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                dp[i] = Math.max(dp[i], prices[j]-prices[i]);
                profit = Math.max(profit,dp[i]);
            }
        }

    return profit;   
    }
}
