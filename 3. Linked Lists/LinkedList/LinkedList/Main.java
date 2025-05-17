package LinkedList;
import java.util.Arrays;

//package LinkedList;
public class Main {
    public static void main (String[] args){
        //ListNode l = new ListNode();
        int[] j = {1,1,2};
        
        ListNode one = new ListNode(j[0]);
        ListNode two = new ListNode(j[1]);
        ListNode three = new ListNode(j[2]);

        one.next = two;
        two.next = three;
        ListNode head = one;

        RemoveDuplicates ans = new RemoveDuplicates();

        ans.deleteDuplicates(head);

        String answer = ans.toString();


        int[] output = {1,2};

        System.out.println("Input: " + Arrays.toString(j));
        System.out.println("Expected Output: " + Arrays.toString(output) + " Actual Output: " + answer);
        


    }    
}
