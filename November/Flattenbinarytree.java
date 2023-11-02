class Solution { 
    TreeNode prev=null;
    public void flatten(TreeNode root) {
        if(root==null) return;
       
        flatten(root.right);
        flatten(root.left);
        
        root.right=prev;
        root.left=null;
        prev=root;
    }
}

_________________________________________________________________________
  Stack Solution :- 
  */
class Solution {
    public void flatten(TreeNode root) {
         if (root == null) return;
         Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while (!st.isEmpty()) {
            TreeNode cur = st.pop();
           
            if (cur.right != null) {
                st.push(cur.right);
            }
            if (cur.left != null) {
                st.push(cur.left);
            }
            if (!st.isEmpty()) {
                cur.right = st.peek();
                cur.left = null;
            }
       }
    }
}
