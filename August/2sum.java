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
__________________________________________________________________________________________________________________________
    code:
    class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] =new int[2];
        int n=nums.length;
        HashMap<Integer,Integer> mp= new HashMap<>();
        for(int i=0 ; i<n; i++)
        {
          int num=nums[i];
          int need= target-num;
          if(mp.containsKey(need))
          {
              ans[0]=mp.get(need);
              ans[1]=i;
          }
          mp.put(nums[i],i);
        }
        return ans;
    }
}
