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
    public ListNode reverseList(ListNode head) {
        ListNode curr = head; //0
        ListNode prev = null;

        while(curr != null) {
            ListNode tmp = curr.next; //1 
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        return prev;
    }
    
}
