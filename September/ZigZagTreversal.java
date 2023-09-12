class Solution {
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list= new ArrayList<>();
         Queue<TreeNode> q= new LinkedList<>(); 
         if(root==null) return list;
         q.offer(root);
        boolean flag= true;
        while(!q.isEmpty())
            {
                int size= q.size();
                List<Integer> sub = new ArrayList<>();
                for(int i=0 ;i<size; i++)
                {
                    if(q.peek().left!=null)
               {
                   q.offer(q.peek().left);
               }
               if(q.peek().right!=null)
               {
                   q.offer(q.peek().right);
               }
               sub.add(q.poll().val);
                        
                }	
                    if(flag==false)
                    {
                    Collections.reverse(sub);
                    }
                    
                    list.add(sub);
                    flag=!flag;


    }   
    return list;

    }
}
