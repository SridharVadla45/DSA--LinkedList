package src.middleOfLinkedList;
import src.binaryLinkedListToInteger.Solution.ListNode;

public class Solution {
    public ListNode middleNode(ListNode head) {
        //early return
        if(head ==null || head.next ==null ) return head;
        int size =size(head);
        int middlePos = size/2;
        while(head!=null && middlePos>0){
            middlePos--;
            head=head.next;
        }
        return head;

    }

    private static int size(ListNode head){
        int size =0;
        if(head==null) return size;
        ListNode temp = head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        return size;
    }


    private static ListNode betterSolution(ListNode head){
        if(head ==null || head.next ==null ) return head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
