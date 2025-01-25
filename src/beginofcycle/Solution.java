package src.beginofcycle;
import src.binaryLinkedListToInteger.Solution.*;
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head ==null ) return head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null ){
            slow=slow.next;
            fast=fast.next.next;
            if(slow ==fast) {
                slow =head;
                while(fast!=slow){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}