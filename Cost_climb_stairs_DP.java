class Solution {
    public int minCostClimbingStairs(int[] cost) {
        // Memoization CODE   
        // int [] dp= new int[1001];
        // dp[0]=cost[0];
        // dp[1]=cost[1];
        // int n= cost.length;
        // for(int i=2 ; i<n ;i++ )
        // {
        //     dp[i]= cost[i]+ Math.min(dp[i-1],dp[i-2]);
        // }
        // return Math.min(dp[n-1],dp[n-2]);
        

        optimized tabulationm: -
        int prev= cost[0];
        int prev2= 0;
        int val=0;
        int n= cost.length;
        for(int i =1; i<n; i++)
        {
            val=  Math.min(prev + cost[i],prev2+ cost[i]);
            prev2=prev;
            prev=val;
        }

        return Math.min(prev,prev2);

    //     normal execution code : 
    //     class Solution {
    // public int minCostClimbingStairs(int[] cost) {
    //     int n=cost.length;
    //     for(int i=2;i<n;i++)
    //     {
    //         cost[i]+=Math.min(cost[i-1],cost[i-2]);
    //     }
    //     return Math.min(cost[n-1],cost[n-2]);
    // }
}
  

    }
}
