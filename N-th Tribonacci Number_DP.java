class Solution {
    public int tribonacci(int n) {
      // Tabulation code :=>
      // if(n==1 || n==2)
      //   return 1;

      // if(n==0)
      //  return 0;

      //  int one= 0, two=1, three=1,val=0;

      //  for(int i=3 ; i<=n; i++)
      //  {
      //    val= one + two + three;
      //    one=two;
      //    two=three;
      //    three=val;
      //  }
      //  return val;
          // Memoization code 
        int [] dp= new int[38];
        dp[0]=0;
        dp[1]=1;
        dp[2]=1;
        for(int i=3 ; i<=n ;i++)
        {
          dp[i]= dp[i-1]+dp[i-2]+dp[i-3];

        }
        return dp[n];
    }
}
