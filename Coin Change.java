class Solution {
    public int coinChange(int[] coins, int amount) {
        int n= coins.length;
        int [][]dp= new int[n][amount+1];
        for(int T =0; T<=amount ;T++)
        {
            if( T % coins[0] ==0)
              dp[0][T] =T /coins[0];
            
            else
             dp[0][T] =(int)Math.pow(10,9);

        }
        for(int ind =1 ;ind<n ;ind++)
        {
            for(int target =0; target<=amount;target++)
            {
                int nottake= dp[ind-1][target];
                int take= (int)Math.pow(10,9);
                if(coins[ind]<=target)
                {
                    take= 1+ dp[ind][target-coins[ind]];

                }
                dp[ind][target] = Math.min(nottake,take);
            }
        }
        int ans = dp[n-1][amount];
         if(ans >=(int)Math.pow(10,9)) return -1;
           return ans;


    }
}
