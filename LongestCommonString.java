Recursive :
class Solution{
    
    int ans=0;
    int func(int ind1, int ind2 ,String S1 ,String S2,int [][]dp)
    {
        int temp=0;
        
        if(ind1 <0 || ind2 <0)
        {
            return 0;
        }
        if(dp[ind1][ind2]!=-1)
        {
            return dp[ind1][ind2];
        }
        
        if(S1.charAt(ind1)==S2.charAt(ind2))
        {
           temp = 1+func(ind1-1,ind2-1,S1,S2,dp);
           ans=Math.max(ans,temp);
        }
        
            func(ind1-1,ind2,S1,S2,dp);
            func(ind1,ind2-1,S1,S2,dp);
         
         dp[ind1][ind2]=temp;
        return temp;
    }
    int longestCommonSubstr(String S1, String S2, int n, int m){
          int dp[][] =new int[n+1][m+1];
          for(int row[]:dp){
              Arrays.fill(dp,-1);
          }
         int a=func(n-1,m-1,S1,S2,dp); 
         return ans;
         
        
         
    }
}


Memiozation : 
class Solution{
    
    int ans=0;
    int func(int ind1, int ind2 ,String S1 ,String S2,int [][]dp)
    {
        int temp=0;
        
        if(ind1 <0 || ind2 <0)
        {
            return 0;
        }
        if(dp[ind1][ind2]!=-1)
        {
            return dp[ind1][ind2];
        }
        
        if(S1.charAt(ind1)==S2.charAt(ind2))
        {
           temp = 1+func(ind1-1,ind2-1,S1,S2,dp);
           ans=Math.max(ans,temp);
        }
        
            func(ind1-1,ind2,S1,S2,dp);
            func(ind1,ind2-1,S1,S2,dp);
         
         dp[ind1][ind2]=temp;
        return temp;
    }
    int longestCommonSubstr(String S1, String S2, int n, int m){
          int dp[][] =new int[n+1][m+1];
          for(int row[]:dp){
              Arrays.fill(dp,-1);
          }
         int a=func(n-1,m-1,S1,S2,dp); 
         return ans;
         
        
         
    }
}


TABULATION :
class Solution{
    int longestCommonSubstr(String S1, String S2, int n, int m){
       
        int[][] dp=new int[n+1][m+1];
    int ans = 0;
    
    for(int i=1;i<=n;i++){
        for(int j=1;j<=m;j++){
            if(S1.charAt(i-1)==S2.charAt(j-1)){
                int val = 1 + dp[i-1][j-1];
                dp[i][j] = val;
                ans = Math.max(ans,val);
            }
            else
                dp[i][j] = 0;
        }
    }
    
    return ans;
    }
}
