class Solution {
    public int maxLevelSum(TreeNode root) {
        Queue <TreeNode > q = new LinkedList<>();
        q.offer(root);
        
        
        int level=0;
        int ans=0;
        int maxi =Integer.MIN_VALUE;
        while(!q.isEmpty())
        {
            int size=q.size();
            level++;
  
            int maxsum=0;
            for(int i=0 ;i<size;i++)
            {
                TreeNode node= q.peek();
                maxsum+= q.poll().val;
                

                 if(node.left!=null)
                 {
                     q.offer(node.left);
                 } 
                 if(node.right!=null)
                  {
                      q.offer(node.right);
                  }
                 
            } 
           
            if(maxsum>maxi)
            {
              maxi=maxsum;
              ans=level;
            }
        }
      return ans;
        
    }
}
