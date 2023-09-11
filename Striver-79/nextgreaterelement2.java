class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n= nums.length;
        int ans[]=new int[n];
        Stack <Integer> st= new Stack<>();
       for (int i = 2 * n - 1; i >= 0; i--)
        {
            while(!st.empty() && nums[i%n]>=st.peek())
            st.pop();

            if(i<n)
            {
                if(!st.empty())
                ans[i]=st.peek();

                else
                ans[i]=-1;
            }
            st.push(nums[i%n]);
        }
        return ans;
    }
}
