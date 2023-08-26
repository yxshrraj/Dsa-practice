class Solution
{
    int getMiddle(Node head)
    {
         Node temp =head;
         int c=0;
         while(temp!=null)
         {
             c++;
             temp= temp.next;
             
         }
         temp=head;
         int l=c/2;
         while(l>0)
         {
             temp=temp.next;
             l--;
         }
         return temp.data;
    }
}
________________________________________________________________________________________________________
  Optimal :-
  class Solution
{
    int getMiddle(Node head)
    {
         // Your code here
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
        
        
         }
}
