class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode cur=head;
        ListNode temp=null;
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
}
