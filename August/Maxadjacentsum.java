class Solution {
   
    int findMaxSum(int arr[], int n) {
        int [] dp =new int[n];
        Arrays.fill(dp,-1);
       
          dp[0]=arr[0];
          
          for(int ind=1; ind<n; ind++)
          {
              int take =arr[ind];

              if(ind>1)
               take += dp[ind-2];
               
               
               int nottake = 0+ dp[ind-1];
               dp[ind]=Math.max(nottake,take);
          }
          
          return dp[n-1];
        
    }
}
