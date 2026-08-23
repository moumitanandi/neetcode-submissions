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

        ListNode res = new ListNode();
        ListNode cur = res;
        int num1 = reverseInt(l1);
        int num2 = reverseInt(l2);
        int sum = num1 + num2; 
        if(sum == 0) return new ListNode(0);

        while(sum > 0) {
            int rem = sum % 10;
            cur.next = new ListNode(rem, null);
            sum = sum / 10; 
            cur = cur.next;          
        }
        return res.next;
    }

    public int reverseInt(ListNode l1) {
        int num1 = 0;
        int count = 1;
        while(l1 != null) {
            num1 += l1.val * count;
            count *= 10;
            l1 = l1.next;
        }
        return num1;
    }
}
