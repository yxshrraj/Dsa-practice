class Solution {
    public int rob(int[] nums) {
       int prev= nums[0];
        int prev2=0;
        
        for(int i=1; i<nums.length;i++)
        {
            int pick= nums[i];
            if(i>1)
               pick+=prev2;
             
            int notpick= prev;
            
            int cur = Math.max(pick,notpick);
            prev2=prev;
            prev=cur;
            
        }
        return prev;
    }
}
