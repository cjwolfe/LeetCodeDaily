package LinkedList;

public class ReverseListTwo {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null){return null;}
        ListNode curr = head, prev = null;

        // pretty much all of this is just reinterpreted from the answer.
        // move two pointers until they reach the proper starting point in the list
        while(left > 1){
            prev = curr;
            curr = curr.next;
            left--;
            right--;
        }
        // the two pointers that will fix the final connections
        ListNode con = prev, tail = curr;

        // Iteratively reverse the nodes until right becomes 0
        ListNode third = null;
        while(right>0){
            // save current
            third = curr.next;
            // reverse nodes
            curr.next = prev;
            prev = curr;
            curr = third;
            right--;
        }

        // adjust the final connections as explained in the algorithm
        if(con != null){
            con.next = prev;
        } else {
            head = prev;
        }

        tail.next = curr;



        
        return head;
    }


    public String toString(ListNode head){
        StringBuilder sb = new StringBuilder();
        if (head == null){
            return "No Linked List";
        }
        sb.append("[");
        //String ans = "";
        while(head != null){
        sb.append(head.val);
        head = head.next;
        if (head != null){sb.append(", ");}

        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);        
        ListNode l3 = new ListNode(3);        
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = null;

        ReverseListTwo ex = new ReverseListTwo();

        System.out.println("Input: " + ex.toString(l1));
        System.out.println("Expected: [1, 4, 3, 2, 5]");
        System.out.print("Actual: ");
        System.out.println(ex.toString(ex.reverseBetween(l1, 2, 4)));


    }
}
