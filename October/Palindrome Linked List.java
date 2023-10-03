class Solution {
    public ListNode reverse(ListNode head)
    {
        ListNode cur=head;
        ListNode temp=head;
        ListNode prev=null;
        while(cur!=null)
        {
            temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head ;
        ListNode fast =head;
        ListNode temp=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=reverse(slow.next);
        slow=slow.next;
        while(temp!=null && slow!=null)
        {
            if(temp.val!=slow.val)
            {
                return false;

            }
            temp=temp.next;
            slow=slow.next;
        }

        return true;
    }
}
