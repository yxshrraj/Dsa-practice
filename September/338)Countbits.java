brute force:
class Solution {
    int rec(int num)
    {
        if(num==0) return 0;
        if(num==1) return 1;
        if(num%2==0) return rec(num/2);
        else return 1+rec(num/2);
    }
    public int[] countBits(int n) {
        int ans[] =new int [n+1];
        for(int i=0 ;i<=n;i++)
        {
            ans[i]= rec(i);
        }
        return ans; 
    }
}
_______________________________________________________________________________________________________________
Memoized:
class Solution {
    int rec(int num, int []dp)
    {
        if(num==0) return 0;
        if(num==1) return 1;
        if(dp[num]!=0) return dp[num];
        if(num%2==0) 
        {
            dp[num]=rec(num/2,dp);
                return rec(num/2,dp);
        }
        else
        {
            dp[num] = 1+rec(num/2,dp);
            return 1+rec(num/2,dp);
        } 
    }
    public int[] countBits(int n) {
        int ans[] =new int [n+1];
        for(int i=0 ;i<=n;i++)
        {
            ans[i]= rec(i,ans);
        }
        return ans; 
    }
}
__________________________________________________________________________________________
Optimized:
class Solution {
   
    public int[] countBits(int n) {
       int[] R = new int[n+1];
        if(n==0) return R;
        
        for(int i=1;i<n+1;i++) {
            if(i%2 == 0) { // number is even
                R[i] = R[i/2];
            }
            else { // is odd
                R[i] = R[i/2] + 1;
            }
        }
        return R;
    }
}
