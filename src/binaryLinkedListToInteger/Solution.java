package src.binaryLinkedListToInteger;

public class Solution {

    private  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public int getDecimalValue(ListNode head) {
         int size =  size(head);
         ListNode temp = head;
         int base2Value =0;
         while(temp!=null){
             int value = temp.val;
             base2Value+=value*Math.pow(2,size-1);
             size--;
         }
         return base2Value;
    }

    //Time complexity :O(N) ;n - length of the linkedist
    private int size(ListNode head){
        ListNode temp =head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;

    }
}
