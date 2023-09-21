brute force :
TC- 2^n *2^m 
sc- O(N) - Recursion stack space;

class Solution {
    public int func(int ind1, int ind2, String s1, String s2)
     {
         if(ind1<0 || ind2<0 )
          {
              return 0;
          }
          if(s1.charAt(ind1)==s2.charAt(ind2))
          {
              return 1+func(ind1-1,ind2-1,s1,s2);
          }
          return Math.max(func(ind1-1,ind2,s1,s2),func(ind1,ind2-1,s1,s2));
     }
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m= text2.length();
       return func(n-1,m-1,text1,text2);
    }
}


Memoized:
TC- O(N x M) 
  SC- O(N xM)+ O(N+M)
  class Solution {
    public int func(int ind1, int ind2, String s1, String s2, int dp [][])
     {
         if(ind1<0 || ind2<0 )
          {
              return 0;
          }
          if(dp[ind1][ind2]!=-1)
          {
              return dp[ind1][ind2];
          }
          if(s1.charAt(ind1)==s2.charAt(ind2))
          {
              return 1+func(ind1-1,ind2-1,s1,s2,dp);
          }
          return dp[ind1][ind2]= Math.max(func(ind1-1,ind2,s1,s2,dp),func(ind1,ind2-1,s1,s2,dp));
     }
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m= text2.length();
        int dp[][]=  new int[n][m];
        for(int row[]:dp)
        {
            Arrays.fill(row,-1);
        }
       return func(n-1,m-1,text1,text2,dp);
    }
}

Tabulation Approach :
public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m= text2.length();
        int dp[][]=  new int[n+1][m+1];
        for(int i=0 ;i<=n ;i++)
        {
            dp[i][0]=0;
        }
        for(int j=0 ;j<=m ;j++)
        {
            dp[0][j]=0;

        }
        for(int i=1 ;i<=n ;i++)
        {
            for(int j=1; j<=m;j++)
            {
                if(text1.charAt(i-1)==text2.charAt(j-1))
                 {
                     dp[i][j]=1+dp[i-1][j-1];
                 }
                 else
                 {
                     dp[i][j]= Math.max(dp[i-1][j],dp[i][j-1]);
                 }
            }
        }
        return dp[n][m];
      
       
    }
}
