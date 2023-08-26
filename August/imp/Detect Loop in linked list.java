brute forc(Using Hashmap) :
  class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        // Add code here
        HashSet<Node> set = new HashSet<Node>();
        Node temp=head;
        while(temp!=null)
         {
             if(set.contains(temp)) 
              return true;
             
             else
              set.add(temp);
              temp=temp.next;
             
         }
         return false;
         
    }
}

OPTIMAL ( Tortoise heir method ) 
  class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        // Add code here
         
        Node slow =head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
              return true;
        }
        return false;
        
    }
}
