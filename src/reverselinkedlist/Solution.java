package src.reverselinkedlist;
import src.binaryLinkedListToInteger.Solution.*;
public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head ==null || head.next==null ) return  head;
        ListNode prev =null;

        while(head!=null ){
            ListNode tempNext =head.next;
            head.next=prev;
            prev=head;
            head=tempNext;
        }
        return prev;
    }
}
