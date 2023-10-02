Brute force :
public class Solution {
    public int func(ListNode headA, ListNode headB)
    {
       int cnt1=0;
       int cnt2=0;

       while(headA!=null)
       {
           headA=headA.next;
           cnt1++;
       }
       while(headB!=null)
       {
           headB=headB.next;
           cnt2++;
       }
       return cnt1-cnt2;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
         int diff = func(headA,headB);
         if(diff<0)
         {
             while(diff!=0)
             {
                 headB=headB.next;
                 diff++;
             }
         }
         else
         {
             while(diff!=0)
             {
                 headA=headA.next;
                 diff--;
             }
         }
         while(headA!=null && headB!=null)
         {
             if(headA==headB)
             {
                 return headA;
             }
              headA=headA.next;
               headB=headB.next;
         }
         return null;
    }
}

optimal :
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a =headA;
        ListNode b = headB;
        
        if(headA==null || headB==null)  return null;
        while(a!=b)
        {
         a=a==null ? headB : a.next;
         b=b==null ? headA : b.next;
        }

        return a;
    }
}
