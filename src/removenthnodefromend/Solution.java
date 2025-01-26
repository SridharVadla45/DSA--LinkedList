package src.removenthnodefromend;
import src.binaryLinkedListToInteger.Solution.*;

import java.util.Stack;

public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev = null;
        ListNode curr =head;
        int size = size(head);
        int k=size-n;
        while(curr!=null && k>0){
            prev=curr;
            curr=curr.next;
            k--;
        }
        prev.next=curr.next;
        curr=null;
      return head;
    }

    private static  int size(ListNode head){
        int size =0;
        if(head==null) return size;
        ListNode temp =head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        return size;

    }


}
