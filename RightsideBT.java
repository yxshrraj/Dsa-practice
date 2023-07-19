class Solution {
    void dfs(TreeNode root,List<Integer> ans, int level)
    {
        if(root==null) return ;
        if(level==ans.size())
        {
            ans.add(root.val);
        }
        dfs(root.right,ans,level+1);
        dfs(root.left,ans,level+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        dfs(root,ans,0);
        return ans;

    }
}

