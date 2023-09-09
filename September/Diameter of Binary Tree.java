class Solution {
    public int func(TreeNode root, int [] diameter)
    {
        if(root==null) return 0;
        int lh=func(root.left,diameter);
        int rh =func(root.right,diameter);
        diameter[0]=Math.max(diameter[0],lh+rh);

        return 1+Math.max(lh,rh);
    }
    public int diameterOfBinaryTree(TreeNode root) {
      int diameter[] =new int[1];
      func(root,diameter);
      return diameter[0];   
         
        
    }
}
