package src.palindromelinkedlist;
import src.binaryLinkedListToInteger.Solution.*;

import java.util.List;
import java.util.ListIterator;

public class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null) return false;
        if(head.next == null ) return true;
        int size =size(head);
        int [] arr = new int[size];
        ListNode temp =head ;
        int i=0;
        while(temp!=null){
         arr[i]=temp.val;
         temp=temp.next;
         i++;
        }
        i=0;
        int j=size-1;
        while(i<=j){
            if(arr[i]!=arr[j]) return false;
            i++;
            j--;
        }
      return true;
    }

    private static int size(ListNode head){
        ListNode temp =head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        return size;
    }


    public boolean isPalindromeTest(ListNode head) {
        if(head ==null) return false;
        if(head.next==null) return true;
        int xorSum =0;
        ListNode temp =head;
        while(temp!=null){
            xorSum^=temp.val;
            temp=temp.next;
        }

     return xorSum==0;
    }

    public boolean isPalindromeTest(ListNode head) {
        if(head ==null) return false;
        if(head.next==null) return true;
        int xorSum =0;
        ListNode temp =head;
        while(temp!=null){
            xorSum^=temp.val;
            temp=temp.next;
        }

        return xorSum==0;
    }




}
