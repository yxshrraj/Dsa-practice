class Solution {
    public void dfs(TreeNode root , List<Integer> ans)
    {
        if(root==null) return ;
        ans.add(root.val);
        dfs(root.left,ans);
        dfs(root.right,ans);

    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans =new ArrayList<>();
        dfs(root,ans);
        return ans;
    }
}
_____________________________________________________________________________________________________________________________________________________________________

  class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
      
        List <Integer> ans = new LinkedList<>();
        if(root==null) return ans; 
         Stack<TreeNode> st =new Stack<TreeNode>();
         st.push(root);
         while(!st.isEmpty())
         {
             TreeNode cur = st.pop();
             ans.add(cur.val);

             if(cur.right!=null)
             {
                 st.push(cur.right);
             }
             if(cur.left!=null)
             {
                 st.push(cur.left);
             }
         }
         return ans;
    }
}
