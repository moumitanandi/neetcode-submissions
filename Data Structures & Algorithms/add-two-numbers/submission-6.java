/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num1 = 0;
        int num2 = 0;
        int count = 1;
        while(l1 != null) {
            num1 += l1.val * count;
            count *= 10;
            l1 = l1.next;
        }
        count = 1;
        while(l2 != null) {
            num2 += l2.val * count;
            count *= 10;
            l2 = l2.next;
        }
        System.out.println("l1 " + num1);
        System.out.println("l2 " + num2);

        int sum = num1 + num2; 
        if (sum == 0) return new ListNode(0);

        ListNode output = new ListNode();
        ListNode curr = output;
        while(sum > 0 ) {
            int rem = sum %10;
            curr.next = new ListNode(rem, null);
            sum /= 10;
            curr = curr.next;

        }
        return output.next;
        
    }
}
