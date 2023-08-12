brute force:
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n= nums.length;
        int [] ans =new int[2];
        for(int i= 0 ; i<n ; i++)
        {
            for(int j=i+1 ; j<n;j++)
            {
                int sum = nums[i]+nums[j];
                if(sum==target)
                {
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        return ans;
    }
}
---------------------------------------------------------------------------------
    
    optimal:

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
