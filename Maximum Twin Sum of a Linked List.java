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
    public ListNode middleNode(ListNode head) {
        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while(fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }

    public ListNode reverseList(ListNode head){
        if(head == null) return head;

        ListNode previous = null;
        ListNode present = head;
        ListNode next = present.next;

        while(present != null){
            present.next = previous;
            previous = present;
            present = next;

            if(next != null) next = next.next;
        }
        return previous;
    }

    public int pairSum(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode headSecond = reverseList(mid);

        int max = Integer.MIN_VALUE;
        while(head != null && headSecond != null){
            max = Math.max(max,(head.val + headSecond.val));
            head = head.next;
            headSecond = headSecond.next;
        }
        return max;
    }
}
