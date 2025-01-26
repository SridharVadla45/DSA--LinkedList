package src.add2likedlistnumbers;
import src.binaryLinkedListToInteger.Solution.*;
public class Solution {
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int sizel1=size(l1);
            int sizel2=size(l2);
            // l1 = reverse(l1);
            // l2 =reverse(l2);
            int carry =0;
            ListNode temp1 =l1;
            ListNode temp2 =l2;
            ListNode prev1 = null;
            ListNode prev2 = null;
            while(temp1!=null && temp2!=null){
                int temp1Data = temp1.val;
                int temp2Data = temp2.val;
                int tempsum = temp1Data+temp2Data+carry;
                int lastDigit  = tempsum%10;
                if(sizel1>=sizel2) temp1.val=lastDigit;
                else temp2.val=lastDigit;
                carry=tempsum/10;
                prev1=temp1;
                prev2=temp2;
                temp1=temp1.next;
                temp2=temp2.next;
            }
            while (temp1!=null){
                int temp1Data = temp1.val;
                int tempsum = temp1Data+carry;
                int lastDigit  = tempsum%10;
                temp1.val=lastDigit;
                carry=tempsum/10;
                prev1=temp1;
                temp1=temp1.next;
            }

            while (temp2!=null){
                int temp2Data = temp2.val;
                int tempsum = temp2Data+carry;
                int lastDigit  = tempsum%10;
                temp2.val=lastDigit;
                carry=tempsum/10;
                prev2=temp2;
                temp2=temp2.next;
            }

            if(sizel1 >=sizel2){
                if(carry==1){
                    ListNode newNode = new ListNode(1);
                    prev1.next=newNode;
                }
                return l1;
            }else{
                if(carry==1){
                    ListNode newNode = new ListNode(1);
                    prev2.next=newNode;
                }
                return l2;
            }





        }

        private static ListNode reverse(ListNode head){
            ListNode prev = null;
            ListNode curr = head;
            while(curr!=null){
                ListNode temp = curr.next;
                curr.next=prev;
                prev=curr;
                curr=temp;
            }
            return prev;
        }

        private static  int size(ListNode head){
            int size =0;
            ListNode temp = head;
            if(head==null) return size;
            while(temp!=null){
                size++;
                temp=temp.next;
            }
            return size;
        }
    }
}
