class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    
    static int ks ( int []wt , int val[],int ind ,int W, int [][]dp)
    {
        if(ind==0)
        {
            if(wt[0]<=W) return val[0];
            else
              return 0;
        }
        if(dp[ind][W]!=-1)
        {
            return dp[ind][W];
        }
        int notTaken = 0+ ks(wt,val,ind-1,W,dp);
        int taken= Integer.MIN_VALUE;
        
        if(wt[ind]<=W)
        {
            taken= val[ind]+ks(wt,val,ind-1,W-wt[ind],dp);
        }
        return dp[ind][W]= Math.max(notTaken,taken);
        
        
    }
    
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
       int dp[][]= new int[n][W+1];
       for(int row[]:dp)
       {
           Arrays.fill(row,-1);
       }  
     
       return ks(wt,val,n-1,W,dp);
    } 
}
Tabulation :
static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here 
         int dp[][]= new int[n][W+1];
        
         for(int i= wt[0] ; i<=W ;i++)
         {
             dp[0][i]=val[0];
         }
         for(int ind=1; ind<n ;ind++)
         {
             for(int w=0; w<=W; w++)
             {
                 int notake= 0+ dp[ind-1][w];
                 int take= Integer.MIN_VALUE;
                 if(wt[ind]<=w)
                 {
                     take= val[ind]+ dp[ind-1][w-wt[ind]];
                 }
                 dp[ind][w]=Math.max(take,notake);
             }
         }
         return dp[n-1][W];
         
    } 
}
