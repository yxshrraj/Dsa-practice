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

