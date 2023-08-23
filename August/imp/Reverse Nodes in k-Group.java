class Solution {
    public ListNode reverse(ListNode head, int k) {
        ListNode cur = head;
        ListNode prev = null;
        int count = 0;
        
        // Count the number of nodes in this group
        while (count < k && cur != null) {
            cur = cur.next;
            count++;
        }
        
        if (count < k) {
            return head; // Not enough nodes left, return as is
        }
        
        cur = head;
        count = 0;
        
        // Reverse the current group
        while (count < k && cur != null) {
            ListNode nextNode = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextNode;
            count++;
        }
        
        // Recurse on the remaining part of the list
        if (cur != null) {
            head.next = reverse(cur, k);
        }
        
        return prev; // Return the new head of this group
    }
    
    public ListNode reverseKGroup(ListNode head, int k) {
        
        
        return reverse(head, k);
    }
}
