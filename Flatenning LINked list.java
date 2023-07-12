class GfG
{
    Node merge(Node l1 ,  Node l2)
    {
       Node dummy = new Node(0);
        Node temp= dummy;
        
        while(l1!=null && l2!=null)
        {
            if(l1.data<=l2.data)
            {
                temp.bottom = l1;
                l1=l1.bottom ;
                temp=temp.bottom;
            }
            else
            {
                temp.bottom=l2;
                l2=l2.bottom;
                temp=temp.bottom;
            }
        }
        while(l1!=null)
        {
          temp.bottom = l1;
                l1=l1.bottom ;
                temp=temp.bottom;  
        }
        while(l2!=null)
         {
               temp.bottom=l2;
                l2=l2.bottom;
                temp=temp.bottom;
         }
        return dummy.bottom;
    }
    Node flatten(Node root)
    {
        if(root==null || root.next==null) return root;
        
        root.next= flatten(root.next);
        
        root= merge(root,root.next);
        return root;
    }
}
