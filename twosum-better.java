class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] ans = new int[2];
        ans[0]=-1;
        ans[1]=-1;
        HashMap<Integer, Integer> mp = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            int req= target-nums[i];
            if(mp.containsKey(req))
            {
                ans[0]=mp.get(req);
                ans[1]=i;
            }
            mp.put(nums[i]);
        }
        return ans;

    }
}
