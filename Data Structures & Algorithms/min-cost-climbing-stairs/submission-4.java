class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int topFloor = cost.length;
        // int dp[]  = new int [topFloor+1];
        int floor2 = 0;
        int floor1 = 0;
        int mincost=0;

        for(int i =2; i<=topFloor; i++){
           mincost  = Math.min(floor1 + cost[i-1] , floor2 + cost[i-2]);

            floor2 = floor1;
            floor1 = mincost;

        }


    return mincost;
        
    }
}
