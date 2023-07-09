class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        Queue<Node> q = new LinkedList<>();
        q.offer(node);
        
        while(!q.isEmpty())
        {

            
            if(q.peek().left!=null)
            {
                q.offer(q.peek().left);
            }
            if(q.peek().right!=null)
            {
                q.offer(q.peek().right);
            }
          ans.add(q.poll().data);
        }
        return ans;
    }
}
