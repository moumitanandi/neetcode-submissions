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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        if(lists.length == 1) return lists[0];

        ListNode res = lists[0];
        for(int i = 1; i < lists.length; i++) {
            res = mergeList(res, lists[i]);
        }
        return res;
    }
    public ListNode mergeList(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val) {
            l1.next = mergeList(l1.next, l2);
            return l1;
        }
        l2.next = mergeList(l1, l2.next);
        return l2;
    }
}
