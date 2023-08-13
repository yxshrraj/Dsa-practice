Recurrence :
class Solution 
{
    int func(int ind , int []nums)
    {
        if(ind==0) return nums[0];
        int pick = nums[ind];
        if(ind>1)
          pick+=func(ind-2,nums);

        int notpick = 0 + func(ind-1,nums);

        return Math.max(pick,notpick);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        return func(n-1,nums);
    }
}
---------------------------------------------------------------------------
Memoization :
class Solution 
{
    int func(int ind , int []nums,int []dp)
    {
        if(ind==0) return nums[0];
        if(dp[ind]!=-1) return dp[ind];
        int pick = nums[ind];
        if(ind>1)
          pick+=func(ind-2,nums,dp);

        int notpick = 0 + func(ind-1,nums,dp);
          
        return dp[ind]=Math.max(pick,notpick);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return func(n-1,nums,dp);
    }
}

--------------------------------------------------------------------------
optimal :
class Solution 
{
    public int rob(int[] nums) {

        int n=nums.length;
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=nums[0];
         for(int ind=1 ;ind<n ;ind++)
         {
             int pick = nums[ind];
             if(ind>1)
             {
                 pick+=dp[ind-2];
             }
             int notpick = 0+ dp[ind-1];
             dp[ind]=Math.max(pick,notpick);
         }

         return dp[n-1];
        


    }
}
