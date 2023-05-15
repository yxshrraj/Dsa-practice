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
                if(queue.peek().left!=null)
                queue.offer(queue.peek().left);

                if(queue.peek().right!=null)
                queue.offer(queue.peek().right);
                if (flag == true) 
                sublist.add(queue.poll().val);
                else sublist.add(0, queue.poll().val);
            }
            flag = !flag;
            wrapList.add(sublist);
            
        }
        return wrapList;

    }
}
