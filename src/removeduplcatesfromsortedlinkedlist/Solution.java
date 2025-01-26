package src.removeduplcatesfromsortedlinkedlist;
import src.binaryLinkedListToInteger.Solution.*;
public class Solution {

    public ListNode deleteDuplicates(ListNode head) {
        if(head==null ) return head;
        ListNode prev =head;
        ListNode curr =head.next;

        while(curr!=null){
            if(prev.val == curr.val){
                prev.next=null;
            }else{
                prev.next=curr;
                prev=curr;
            }
            curr=curr.next;
        }
        return head;

    }
}
