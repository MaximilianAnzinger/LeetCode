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
        ListNode result = new ListNode(0);
        ListNode current = result, prev = null;
        while(l1 != null || l2 != null) {
            int v = current.val;
            if(l1 != null) {
                v += l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                v += l2.val;
                l2 = l2.next;
            }
            current.val = (v%10);
            current.next = new ListNode(v/10);
            prev = current;
            current = current.next;
        }
        if(current.val == 0) {
            prev.next = null;
        }
        return result;
    }
}