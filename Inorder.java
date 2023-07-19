class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integet> ans= new ArrayList<>();
        Stack<TreeNode> st = new Stack<TreeNode>();
        TreeNode temp=root;
        while(true)
        {
            if(temp!=null)
            {
                st.push(temp);
                temp=temp.left;
            }
            else
            {
                if(st.isEmpty()) break;
                temp=st.pop();
                ans.add(temp.val);
                temp=temp.right;
            }
        
        }
        return ans;
    }
}
