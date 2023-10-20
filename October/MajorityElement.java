brute Force - 
  __________
  class Solution {
    public int majorityElement(int[] nums) {
        int n= nums.length;
        int maj= n/2;
        HashMap<Integer ,Integer > mp =new HashMap<Integer,Integer>();
        for(int i=0 ;i<n ;i++)
        {
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
           

            if(mp.get(nums[i])> maj)
            {
                return nums[i];
            }
        }
        return -1;
    }
}

Optimal  - 
  
Boyer-Moore majority vote algorithm


class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int cnt=0;
        int el=0 ;
        for(int i=0 ;i<n;i++)
        {
          if(cnt==0)
          {
              cnt+=1;
              el=nums[i];
          }
          else if(nums[i]==el)
          {
              cnt++;
          }
          else cnt--;

        }
        int cnt1=0;

        for(int i=0; i<n; i++){
            if(nums[i]==el) cnt1++;
        }
        if(cnt1 > n/2) return el;

        return -1;
    }
}
