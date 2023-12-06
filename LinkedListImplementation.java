class Nodee
{
    int data;
    Nodee next;
}

public class LinkedList
{
    Nodee head;
    public void delete(int index)
    {
        Nodee n = head;
        Nodee m=null;
        for(int i=0; i<index-1;i++)
        {
            n=n.next;
        }
        m=n.next;
        n.next=m.next;
        
        
    }
    public void insertAtindex(int index ,int data)
    {
        Nodee node =new Nodee();
        node.data=data;
        node.next=null;
        if(index==0)
        {
            insertAtstart(data);
        }
        else
        {
        Nodee n=head;
        for(int i=0; i<index-1;i++)
        {
            n=n.next;
        }
          node.next=n.next;
          n.next=node;
    }
    }
    public void insertAtstart(int data)
    {
        Nodee node =new Nodee();
        node.data=data;
        node.next=head;
        head=node;
    }
    public void insert(int data)
    {
        Nodee node = new Nodee();
        node.data=data;
        node.next=null;
        
        if(head==null)
        {
            
            head=node;
        }
        else
        {
            Nodee n =head;
            while(n.next!=null)
            {
                n=n.next;
            }
            n.next=node;
            
        }
        
    }
    public void show()
    {
        Nodee n=head;
        while(n!=null)
        {
            System.out.println(n.data);
            n=n.next;
        }
    }
    public static void main (String args[])
    {
        LinkedList ll =new LinkedList();
        ll.insert(18);
        ll.insert(45);
        ll.insert(35);
        
        ll.insertAtstart(25);
        ll.insertAtindex(1,6);
        ll.delete(1);//indexposn
        ll.show();
    }
}
