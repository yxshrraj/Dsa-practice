class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
         ListNode cur=head;
         ListNode temp=null;
         ListNode prev=null;
         int cnt=0;
         while(cnt<k && cur!=null)
         { 
             cur=cur.next;
             cnt++;
         }
         if(cnt<k)
         {
             return head;
         }
         cur=head;
         cnt=0;

         while(cnt<k && cur!=null)
          {
              temp=cur.next;
              cur.next=prev;
              prev=cur;
              cur=temp;
              cnt++;
          }
          if(temp!=null)
          {
              head.next=reverseKGroup(temp,k); 
          }

          return prev;

    }
}
