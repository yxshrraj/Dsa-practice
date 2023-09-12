class Solution {
    public void dfs(TreeNode root ,List<Integer> list, int level)
    {
        if(root==null) return ;
        if(level==list.size())
        {
            list.add(root.val);
            
        }
          dfs(root.right,list,level+1);
        dfs(root.left,list,level+1);
      
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root,list,0);
        return list;
    }
}
