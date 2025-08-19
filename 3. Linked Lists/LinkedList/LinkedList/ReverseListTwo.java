package LinkedList;

public class ReverseListTwo {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode prev = null;
        ListNode curr= head;
        int count = 1;
        while(count <= left){


            curr = head.next;
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
        }
        count++;
        }
        //System.out.println(prev.val);
        return prev;
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

        ex.reverseBetween(l1, 2, 4);


    }
}
