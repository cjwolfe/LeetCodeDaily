package LinkedList;

public class ReverseListTwo {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode curr= head;

        ListNode temp = curr.next;
        ListNode prev = null;
        int count = 1;
        ListNode start = head;
        while(count <= left){
            curr = head.next;
            start.next = curr;
            count++;
        }
        // while count < left, increment head
        // increment count

        // while head!= null
        while (count<right){
        
        while (curr != null){

        ListNode nextNode = curr.next;
        curr.next = prev;
        prev = curr;
        curr = nextNode;
        start.next = curr;
        }
        count++;
        }
        //System.out.println(prev.val);
        return start;
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

        System.out.println("Expected: " + ex.toString(l1));
        System.out.print("Actual: ");
        System.out.println(ex.toString(ex.reverseBetween(l1, 2, 4)));


    }
}
