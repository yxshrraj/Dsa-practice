class Solution {
    int func(TreeNode root,int []maxm)
    {
       
        if(root==null) return 0;
        int lh= Math.max(0,func(root.left,maxm));
        int rh=Math.max(0,func(root.right,maxm));
        maxm[0]= Math.max(maxm[0], root.val+lh+rh);

        return root.val+Math.max(lh,rh);
    }
    public int maxPathSum(TreeNode root) {
         int maxm[]= new int[1];
         maxm[0]=Integer.MIN_VALUE;
          func(root,maxm);
          return maxm[0];
    }
}
