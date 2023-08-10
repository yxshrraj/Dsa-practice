class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] =new int[2];
        Arrays.sort(nums);
        int left=0;
        int right= nums.length-1;
        while(left<right)
        {
            int sum= nums[left]+nums[right];
            if(sum==target)
            {
                   ans[0]=left;
                   ans[1]=right;
            }
            else if(sum >target)
            {
                 right--;
            }
            else
            {
                left++;
            }
            

        }
        return ans;
    }
}
