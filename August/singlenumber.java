// Brute force
class Solution {
    public int singleNumber(int[] nums) {
       HashMap <Integer,Integer> mp= new HashMap<>();
       for(int i=0 ; i <nums.length; i++)
       {
          int count = mp.getOrDefault(nums[i],0);
          mp.put(nums[i],count+1);
       }       
       int single= -1;
       for(int key : mp.keySet())
       {
           if(mp.get(key)==1)
           {
               single=key;
               break;
           }
       }
return single;

    }
}
