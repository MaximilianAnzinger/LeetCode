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
    public ListNode removeElements(ListNode head, int val) {
        ListNode h = new ListNode(0, head), p = h, c = head;
        while(c != null)
            if(c.val == val) {
                p.next = c.next;
                c = c.next;
            } else {
                p = c;
                c = c.next;
            }
        return h.next;
    }
}