Explanation :- 
  
N =3     W=6
            0th  1    2
values[] = {30, 40 , 60}
weight[]=  {3,  2,    5}
     ans=60
     
     f(ind , W ) --> f(2,6) // till index 2 , what max value you can get with wt of bag=6;
     {
         
     }

solution :-
REcursive soln :

class Solution 
{ 
    static int func(int ind , int W,int wt[], int val[])
    {
        if(ind==0)
        {
            if(wt[0]<=W) return val[0];
            else
              return 0;
        }
        int  nottake = 0+func(ind-1,W,wt,val);
        
        int take =Integer.MIN_VALUE;
        if(wt[ind]<=W)
        {
            take= val[ind]+func(ind-1,W-wt[ind],wt,val);
        }
        return Math.max(take,nottake);
    }
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
        return func(n-1,W,wt,val); 
    } 
}
-----------------------------------------------------------------------------------------------------------------------------------------

Memoization solution: -
  class Solution 
{ 
    static int func(int ind , int W,int wt[], int val[],int [][]dp)
    {
        if(ind==0)
        {
            if(wt[0]<=W) return val[0];
            else
              return 0;
        }
        if(dp[ind][W]!=-1) return dp[ind][W];
        int  nottake = 0+func(ind-1,W,wt,val,dp);
        
        int take =Integer.MIN_VALUE;
        if(wt[ind]<=W)
        {
            take= val[ind]+func(ind-1,W-wt[ind],wt,val,dp);
        }
          return dp[ind][W] =Math.max(take,nottake);
        
    }
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
        int dp [][]= new int[n][W+1];
        for(int row[]:dp)
        {
            Arrays.fill(row,-1);
        }
        return func(n-1,W,wt,val,dp); 
    } 
}
-----------------------------------------------------------------------------------------------------------------------------------------
Tabulation solution : 
static int knapSack(int W, int wt[], int val[], int n) 
    { 
       
       int dp[][] = new int[n][W+1];
      for(int i=wt[0]; i<=W;i++)       
      {
          dp[0][i]=val[0];
      }
      for(int ind=1; ind<n;ind++)
       {
           for(int j=0; j<=W;j++)
           {
               int nottake= dp[ind-1][j];
               int take= Integer.MIN_VALUE;
               if(wt[ind]<=j)
               {
                   take= val[ind]+ dp[ind-1][j-wt[ind]];
               }
               dp[ind][j]=Math.max(nottake ,take);
           }
       }
       return dp[n-1][W];
    } 

  
