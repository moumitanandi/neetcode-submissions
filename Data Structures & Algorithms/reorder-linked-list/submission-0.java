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
    public void reorderList(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        ListNode curr = head;
        ListNode curr2 = head;
        while(curr != null) {
            list.add(curr);
            curr = curr.next;
        }

        int i = 0; 
        int j = list.size() -1; 
        System.out.println("j: " + j);
        while (i < j) {
            System.out.println("i: " + i);
            System.out.println("inside ");
            list.get(i).next = list.get(j);
            i++;
            list.get(j).next = list.get(i);
            j--;
        }

        list.get(i).next = null;
    }
}
