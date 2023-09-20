brute:
class Solution {
    public int maxProduct(int[] nums) {
        int ans =0;
        int n=nums.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
               int prod=1;
               for(int k=i ; k<=j; k++)
               {
                   prod*=nums[k];
                   ans= Math.max(prod,ans);
               }
            }
        }
        return ans;
    }
}

Better:
class Solution {
    public int maxProduct(int[] nums) {
        int pref=1;
        int suff=1;
        int ans=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0; i<n ;i++)
        {
            if(pref==0) pref=1;
            if(suff==0) suff=1;

            pref*=nums[i];
            suff*=nums[n-i-1];
              ans= Math.max(ans,Math.max(suff,pref));

        }
        return ans;
    }
}
