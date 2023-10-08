class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null) return null;

        // if(root.val==val) return root;
         while(root!=null)
         {
        if(root.val >= val)
        {
            if(root.val==val)
            {
                return root;
            }

            root=root.left;
            
        }
        else
        {
            root=root.right;

        }
         }
         return null;
    }
}
