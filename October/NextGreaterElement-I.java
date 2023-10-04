class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans [] = new int [nums1.length];
        HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
        Stack<Integer> st= new Stack<>();
        int n=nums2.length;
        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty() && nums2[i]>=st.peek()) st.pop();

            if(i<n)
            {
                if(!st.isEmpty())
                {
                    mp.put(nums2[i],st.peek());
                }
                else
                {
                    mp.put(nums2[i],-1);
                }
                st.push(nums2[i]);
            }

        }
        for(int i=0; i<nums1.length;i++)
        {
            ans[i]=mp.get(nums1[i]);
        }

        return ans;
    }
}
