/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap <Integer,Integer> mp= new HashMap<Integer,Integer>();

        for(int i=0 ;i <inorder.length;i++)
        {
            mp.put(inorder[i],i);
        }
        TreeNode root = builDTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1,mp);
        return root;
    }
    public TreeNode builDTree(int []preorder,int prestart, int preEnd,int []inorder,int instart,int inEnd,HashMap<Integer,Integer> mp)
    {
        if(prestart > preEnd || instart > inEnd) return null;

        TreeNode root= new TreeNode(preorder[prestart]);
        int inRoot= mp.get(root.val);
        int numsLeft= inRoot-instart;
        
        root.left=builDTree(preorder,prestart+1,prestart+numsLeft, inorder ,instart,inRoot-1,mp);

        root.right=builDTree(preorder,prestart+numsLeft+1,preEnd,inorder,inRoot+1,inEnd,mp);
         
          return root;

            }
       
}
