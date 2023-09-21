Recursion and memoized combined :

class Solution {

   public int func(int ind1, int ind2 ,String s1, String s2,int [][]dp)
   {
       if(ind1<0)
         {
             return ind2+1;

         }
         if(ind2<0)
         {
             return ind1+1;
         }
         if(dp[ind1][ind2]!=-1) return dp[ind1][ind2];
         if(s1.charAt(ind1)==s2.charAt(ind2))
         {
             return 0+ func(ind1-1,ind2-1,s1,s2,dp);
         }
        
         
             return dp[ind1][ind2]= 1+Math.min(func(ind1,ind2-1,s1,s2,dp),Math.min(func(ind1-1,ind2,s1,s2,dp),func(ind1-1,ind2-1,s1,s2,dp)));
         
   }

    public int minDistance(String word1, String word2) {
        int n= word1.length() ;
        int m= word2.length();
        int [][]dp= new int[n][m];
        for(int row[]:dp)
        {
            Arrays.fill(row,-1);
        }
        return func(n-1,m-1,word1, word2,dp);
    }
}
