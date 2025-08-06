
 //Definition for singly-linked list.
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
    }
 }




public class LinkedListCycle{
    public boolean hasCycle(ListNode head){
        return false;
    }




    public static void main(String[] args){

        ListNode l4 = new ListNode(-4);
        ListNode l3 = new ListNode(0);
        ListNode l2 = new ListNode(2);
        ListNode l1 = new ListNode(3);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l2;
    
    
    }
    
}



