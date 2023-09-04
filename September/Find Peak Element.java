class Solution {
    public int findPeakElement(int[] nums) {
        int ans=0;;
        int peak=nums[0];
        for(int i=1 ;i<nums.length;i++)
        {
            if(nums[i]>peak)
            {
                peak=nums[i];
                ans=i;
            }
        }
        return ans;
    }
}
