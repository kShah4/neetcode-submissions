class Solution {
    public int maxProfit(int[] prices) {
        int profit =0;
        int minBuy = prices[0];
        for(int int i=0; i<prices.length; i++ ){
            profit = Math.max(profit, sell - minBuy);
            minBuy = Math.min(minBuy, sell);
        }

    return profit;   
    }
}
