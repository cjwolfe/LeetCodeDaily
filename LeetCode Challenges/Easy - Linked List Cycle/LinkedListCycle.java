import java.util.*;

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

    //HashSet<Integer> set = new HashSet<>();

    HashSet<ListNode> seen = new HashSet<>();

    public boolean hasCycle(ListNode head){
        //cycle through list
        //see if combination of two numbers has been seen before?
        
        int pos = 0;
        int tally = 0;
        while (head != null){
            if(!seen.add(head)) return true;
            head = head.next;




           /*  pos = head.val;
            // Increment tally when matching nodes are found
            if(set.contains(pos)){tally++;}
            set.add(pos); // add node to set, so it can be tracked

            head = head.next;
            if (tally>105){ return true;} // if tally is greater than the number of potential nodes in the list, return true (it cycles) */
        } 


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

        ListNode m1 = new ListNode(1);
        m1.next = null;

        LinkedListCycle ex = new LinkedListCycle();


        System.out.println(ex.hasCycle(l1));

        System.out.println(ex.hasCycle(m1));



    }
    
}



