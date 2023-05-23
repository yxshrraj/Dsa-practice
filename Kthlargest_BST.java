class Solution
{

    int ans=0,n=0;
 
    public int kthLargest(Node root,int K)
    {

        largest(root, K);
        return ans;
    }
    
    void largest(Node root, int K){
        if(root==null) return;
        largest(root.right,K);
        n++;
        if(n==K) ans=root.data;
        largest(root.left,K);
    }
}
