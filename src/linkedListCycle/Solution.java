package src.linkedListCycle;
import src.binaryLinkedListToInteger.Solution.ListNode;

import java.util.HashSet;

public class Solution {

    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null) return false;

        HashSet<ListNode> hashSet =new HashSet<>();
        ListNode temp = head;
        while(head!=null){
            if(hashSet.contains(head)) return true;
            hashSet.add(head);
            head=head.next;
        }

        return false;

    }

    private static boolean betterSolution(ListNode head){
        if(head==null || head.next==null ) return false;
        ListNode slow =head;
        ListNode fast=head;
        while(slow!=null && fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) return true;
        }
        return false
    }
}
