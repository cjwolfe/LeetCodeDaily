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

    HashSet<Integer> set = new HashSet<>();


    public boolean hasCycle(ListNode head){
        int pos = 0;
        int tally = 0;
        int inc = 0;
        while (head != null){
            pos = head.val;
            System.out.println("pos " + pos);
            if(set.contains(pos)){tally++;}
            set.add(pos);
            inc ++;

                // Math.max(0,set.get(pos)+1)
            System.out.println("Pos's count" + set.contains(pos)+1);
            System.out.println("tally " + tally);
            System.out.println("Increment: " + inc);
            head = head.next;
            //if(set.contains(pos)){return true;} 
            if (tally>50){ return true;}
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

        LinkedListCycle ex = new LinkedListCycle();

        System.out.println(ex.hasCycle(l1));



    }
    
}



