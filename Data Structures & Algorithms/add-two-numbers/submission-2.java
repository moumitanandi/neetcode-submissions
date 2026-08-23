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
        ListNode result = new ListNode();
        ListNode cur = result;

        int sum = getNum(l1) + getNum(l2);
        if(sum == 0) {
            return new ListNode(0);
        }
        while(sum > 0) {
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            sum = sum / 10;
        }
        return result.next;
        
    }

    public int getNum(ListNode l1){
        int i = 1;
        int num = 0;
        while(l1 != null){
            num += l1.val * i;
            i *= 10;
            l1 = l1.next;
        }
        return num;
    }
}
