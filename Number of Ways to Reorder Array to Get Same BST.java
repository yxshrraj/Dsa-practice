class Solution {
    public static int mod=1000000007;
    public int numOfWays(int[] nums) {
             List<Integer> list = new ArrayList<>();
             for(int num :nums)
             {
                 list.add(num);
             }
             return countways(list)-1;
       
             }
             public int countways(List<Integer> nums)
             {
                 if(nums.size()<=2)
                  return 1;

                List<Integer> left= new ArrayList<>();
                List<Integer> right  = new ArrayList<>();
                for(int i=1 ; i<nums.size();i++)
                {
                    if(nums.get(i)> nums.get(0))
                    {
                        right.add(nums.get(i));
                    }
                    else
                    {
                       left.add(nums.get(i));
                    }
                }
                 long leftcount= countways(left);
                long rightcount= countways(right);
                
         return (int) ((comb(nums.size()-1 ,left.size())%mod) * (leftcount %mod)%mod * (rightcount %mod) %mod );


             }
             public long comb(int n ,int k)
             {
               long [][]dp = new long[n+1][k+1];
               for(int i=0 ;i<=n ;i++)
               {
                   dp[i][0]=1;
                   for(int j=1 ; j<=Math.min(i,k); j++) {
                       dp[i][j] =(dp[i-1][j-1] + dp[i-1][j]) % mod;
                   }
               }
               return dp[n][k];
             }
}
