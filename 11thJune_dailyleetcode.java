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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> wrapList = new LinkedList<List <Integer>>();
        Queue <TreeNode> queue = new LinkedList<TreeNode>();
        if(root==null)
        return wrapList;
        queue.offer(root);
        boolean flag = true;
        while(!queue.isEmpty())
        {
            int size=queue.size();
            List <Integer> sublist = new LinkedList<Integer>();
            for(int i=0; i<size;i++)
            {
                TreeNode cur= queue.poll();
                sublist.add(cur.val);
                if(cur.left!=null)
                queue.offer(cur.left);

                if(cur.right!=null)
                queue.offer(cur.right);
            }
                if (flag == true) 
                wrapList.add(sublist);
                else 
                {
                  Collections.reverse(sublist);
                   wrapList.add(sublist);
                }
                 flag = !flag;
            }
           
           
            return wrapList;
 
        }
       
    
}
