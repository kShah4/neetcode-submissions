class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if(cost.length == 2){
            return Math.min(cost[0], cost[1]);
        }
        int size = cost.length;
        int [] mincost = new int [size];
        mincost[0] = cost[0];
        mincost[1] = cost[1];
        for(int i=2; i< size; i++){
            mincost[i] = Math.min(mincost[i-1], mincost[i-2]) + cost[i];
        }

        return Math.min(mincost[size-1], mincost[size-2]);
        
    }
}
