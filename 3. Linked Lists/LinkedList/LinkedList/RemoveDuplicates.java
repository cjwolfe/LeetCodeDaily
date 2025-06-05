package LinkedList;
//package LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        // I had initially created an infinite loop with
        // if(current.next != current){ans.next = current}
        // 1. current.next != current is almost always true, u nless the node points to itself (it shouldn't in a linked list)
        // 2. current is never moved forward, so while(current != null) becomes infinite, it was at least the right method to loop
        // through the linked list rather than a for loop or something
        // 3. reassigning ans.next = current, but ans just points to head and isn't moved either, so no real
        // deletion or skipping happens.

        while(current != null && current.next != null){ // while loop proper
            if(current.val == current.next.val){ // compare values
                current.next = current.next.next; // skip the node that is a duplicate
            } else {
                current = current.next; // advance current regardless
            }
        }

        return head;
    }


    public int[] listNodeToArray(ListNode head) {
        List<Integer> values = new ArrayList<>();
        ListNode current = head;

        while (current != null) {
            values.add(current.val);
            current = current.next;
        }

        // Convert ArrayList to int[]
        int[] result = new int[values.size()];
        for (int i = 0; i < values.size(); i++) {
            result[i] = values.get(i);
        }

        return result;
    }


    public static void main(String args[]){
    RemoveDuplicates rd = new RemoveDuplicates();
    ListNode l3 = new ListNode(2);
    ListNode l2 = new ListNode(1,l3);
    ListNode l1 = new ListNode(1,l2);

    int[] outputL = {1,2};

    ListNode n5 = new ListNode(3);
    ListNode n4 = new ListNode(3,n5);
    ListNode n3 = new ListNode(2,n4);
    ListNode n2 = new ListNode(1,n3);
    ListNode n1 = new ListNode(1,n2);

    int[] outputN = {1,2,3};

    System.out.println("The input list is: " + Arrays.toString(rd.listNodeToArray(l1)));
    System.out.println("The expected output list is: " + Arrays.toString(outputL));
    System.out.println("The actual output list is: " + Arrays.toString(rd.listNodeToArray(rd.deleteDuplicates(l1))));

    System.out.println("The input list is: " + Arrays.toString(rd.listNodeToArray(n1)));
    System.out.println("The expected output list is: " + Arrays.toString(outputN));
    System.out.println("The actual output list is: " + Arrays.toString(rd.listNodeToArray(rd.deleteDuplicates(n1))));
    
    
    
    
    }
}
