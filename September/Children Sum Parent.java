class Tree
{
    //Function to check whether all nodes of a tree have the value 
    //equal to the sum of their child nodes.
    public static int isSumProperty(Node root)
    {
        // add your code here
        if(root==null) return 1;
        int temp=0;
        
        if(root.left!=null)
        {
            temp+=root.left.data;
        }
        if(root.right!=null)
        {
            temp+=root.right.data;
        }
        if(temp!=root.data && temp!=0)
        {
            return 0;
        }

        return isSumProperty(root.left) & isSumProperty(root.right);

        
        
    }
}
