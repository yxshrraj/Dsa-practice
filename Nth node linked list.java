/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // BRUTE FORCE - TC - O(N) + O(N) = O(2N);
        //               SC - O(1) 
        //  ListNode temp= head;
        //  int count=0 ;
        //  while(temp!=null) 
        //  {
        //      count++;
        //      temp=temp.next;

        //  }
        //  if(n > count) return head;
        //  if(n==count) 
        //  {
        //      head=head.next;
        //      return head;
        //  }
        //  temp=head;
        //  int  l =count-n;
        //  for(int i=1 ; i<l ;i++)
        //  {
        //      temp=temp.next;
        //  }
        //  if(temp.next!=null)
        //  {
        //      temp.next=temp.next.next;
        //  }
          
        //   return head;

        ListNode start = new ListNode(0);
        start.next=head;
        ListNode slow = start;
        ListNode  fast = start;
        for(int i = 1 ;i<=n ;i++)
        {
            fast=fast.next;
        }
        while(fast.next!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        slow.next= slow.next.next;

         return start.next;


    }
}
