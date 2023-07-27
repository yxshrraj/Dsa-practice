// recursion :
class Solution {
    int func(int ind1 , int ind2 , String s1 , String s2){
           if(ind1<0 )
           {
               return ind2+1;
           }
            if(ind2<0 )
           {
               return ind1+1;
           }
           if(s1.charAt(ind1)==s2.charAt(ind2))
           {
               return func(ind1-1,ind2-1,s1,s2);
    
           }
            return 1+ Math.min(func(ind1-1,ind2,s1,s2),Math.min(func(ind1,ind2-1,s1,s2),func(ind1-1,ind2-1,s1,s2)));


    }
    public int minDistance(String word1, String word2) {

        int n= word1.length();
        int m =word2.length();
        return func(n-1,m-1,word1,word2);
    }
}
// memoization :
class Solution {
    int func(int ind1 , int ind2 , String s1 , String s2,int [][]dp){
           if(ind1<0 )
           {
               return ind2+1;
           }
            if(ind2<0 )
           {
               return ind1+1;
           }
           if(dp[ind1][ind2]!=-1)
           {
               return dp[ind1][ind2];
           }
           if(s1.charAt(ind1)==s2.charAt(ind2))
           {
               return  func(ind1-1,ind2-1,s1,s2,dp);
    
           }
            return dp[ind1][ind2]= 1+ Math.min(func(ind1-1,ind2,s1,s2,dp),Math.min(func(ind1,ind2-1,s1,s2,dp),func(ind1-1,ind2-1,s1,s2,dp)));


    }
    public int minDistance(String word1, String word2) {
        
        int n= word1.length();
        int m =word2.length();
        int dp[][]= new int[n][m];
        for(int row[]:dp)
        {
            Arrays.fill(row,-1);
        }
        return func(n-1,m-1,word1,word2,dp);
    }
}


// Tabulation :
class Solution {
    // int func(int ind1 , int ind2 , String s1 , String s2,int [][]dp){
    //        if(ind1<0 )
    //        {
    //            return ind2+1;
    //        }
    //         if(ind2<0 )
    //        {
    //            return ind1+1;
    //        }
    //        if(dp[ind1][ind2]!=-1)
    //        {
    //            return dp[ind1][ind2];
    //        }
    //        if(s1.charAt(ind1)==s2.charAt(ind2))
    //        {
    //            return  func(ind1-1,ind2-1,s1,s2,dp);
    
    //        }
    //         return dp[ind1][ind2]= 1+ Math.min(func(ind1-1,ind2,s1,s2,dp),Math.min(func(ind1,ind2-1,s1,s2,dp),func(ind1-1,ind2-1,s1,s2,dp)));


    // }
    public int minDistance(String s1, String s2) {
        
        int n= s1.length();
        int m =s2.length();
        int dp[][]= new int[n+1][m+1];
        for(int row[]:dp)
        {
            Arrays.fill(row,-1);
        }
        for(int i=0 ;i<=n;i++)
        {
            dp[i][0]=i;
        }
        for(int j=0 ;j<=m;j++)
        {
            dp[0][j]=j;
        }
        for(int i=1 ;i<=n;i++)
        {
            for(int j=1; j<=m ;j++)
             {
                 if(s1.charAt(i-1)==s2.charAt(j-1))
                 {
                     dp[i][j]= dp[i-1][j-1] ;
                 }
                 else
                 dp[i][j]=1+Math.min(dp[i][j-1],Math.min(dp[i-1][j-1],dp[i-1][j]));
             }
        }
        return dp[n][m];
    }
}
