class Solution
{
    public static Node reverse(Node node, int k)
    {
        //Your code here
        Node cur =node;
        Node temp= null;
        Node prev=null;
        int count =0;
        
        while(count <k && cur!=null)
        {
            temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
            count++;
        }
        if(temp!=null)
        {
            node.next=reverse(temp,k);
        }
        return prev;
    }
}

