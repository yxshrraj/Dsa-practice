class Solution {
    static int mod = 1000000007;
    static int nthFibonacci(int n){
        int prev2=0;
        int prev=1;
        
        int ans=0;
        for(int i=2;i<=n;i++)
        {
            ans=(prev+prev2)%mod;
            prev2=prev;
            prev=ans;
        }
        return ans;
        
        
    }
}
____________________________________________________________________________________________________________________________________
