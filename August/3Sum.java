brute force :
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        int n= nums.length;
        for(int i=0 ;i < n;i++)
        {
            for(int j=i+1 ;j<n; j++)
            {
                for(int k=j+1 ;k< n;k++)
                {
                    List<Integer> list= new ArrayList<>();
                    int sum=nums[i]+nums[j]+nums[k];
                    if(sum==0)
                    {
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);

                        Collections.sort(list);
                        set.add(list);
                    }
                  
                    
                }
            }
        }
         ans.addAll(set);
         return ans;
    }
}

optimal :
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        
        int n= nums.length;
        for(int i=0 ;i < n;i++)
        {
            if(i>0 && nums[i]==nums[i-1])continue;
            int j=i+1;
            int k=n-1;
            while(j<k)
              {
                 int sum=nums[i]+nums[j]+nums[k];
                 if(sum>0)
                 {
                     k--;
                 }
                 else if( sum< 0)
                 {
                     j++;
                 }
                 else
                   {
                       List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        ans.add(list);
                        j++;
                        k--;
                        while(j<k && nums[j]==nums[j-1]) j++;
                        while(j<k && nums[k]==nums[k+1]) k--;
                   }
              }
           
        }
        return ans;
    }
}
