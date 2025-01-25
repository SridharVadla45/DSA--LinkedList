package src.IntersectionOfTwoLinkedList;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {

    private  class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // Time complexity : O(M+N) m and n are the size of the listnodes
    // Space complexity: O(M)
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> hashSet = new HashSet<>();
        if(headA==null || headB==null) return null;
        while(headA!=null){
            hashSet.add(headA);
            headA=headA.next;
        }
        while(headB!=null){
            if(hashSet.contains(headB)) return headB;
            headB=headB.next;
        }

        return null;

    }

    private ListNode betterSolution(ListNode headA,ListNode headB){
        int headASize = size(headA);
        int headBSize = size(headB);

        if(headASize>=headBSize){
            int skip = headASize-headBSize;
            while(headA!=null && skip>0){
                skip--;
                headA=headA.next;
            }
        }else {
            int skip = headBSize-headASize;
            while(headB!=null && skip>0){
                skip--;
                headB=headB.next;
            }
        }

        while (headA!=null && headB!=null){
            if(headA==headB) return headA;
            headA=headA.next;
            headB=headB.next;
        }

        return null;
    }

    private static int size(ListNode head){
        int size =0;
        if(head ==null) return size;
        ListNode temp = head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }


}
