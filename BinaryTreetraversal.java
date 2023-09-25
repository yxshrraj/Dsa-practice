class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans =new ArrayList<>();
        if(root==null) return ans;
        Stack<TreeNode> st= new Stack<>();
        st.push(root);
        while(!st.isEmpty())
        {
            TreeNode temp = st.pop();
            ans.add(temp.val);
            if(temp.right!=null)
            {
                st.push(temp.right);
            }
           if(temp.left!=null)
           {
            st.push(temp.left);
            }
        }

        return ans;
    }
}
