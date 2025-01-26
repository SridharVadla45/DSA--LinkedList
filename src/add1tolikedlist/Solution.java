package src.add1tolikedlist;

public class Solution {
    class Node{
        int data;
        Node next;

        Node(int x){
            data = x;
            next = null;
        }
    }
    public Node addOne(Node head) {
        if(head ==null) return null;
     int carry =1;
      head = reverse(head);
      Node temp = head;
      Node prev = null;
      while(temp!=null ){
          int tempVal = carry+temp.data;
          int lastDigit = tempVal%10;
          temp.data=lastDigit;
          carry=tempVal/10;
          prev=temp;
          temp=temp.next;
      }
      if(carry==1){
          Node newNode = new Node(1);
          prev.next=newNode;
      }

      head = reverse(head);
      return head;
    }


    private static Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        while(curr!=null){
            Node temp = curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}
