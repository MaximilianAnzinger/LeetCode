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
    public ListNode swapPairs(ListNode head) {
        if (head == null)
            return head;
        ListNode h = new ListNode(0, head);
        ListNode prev = h, c1 = head, c2 = head.next;
        while(c1 != null && c2 != null) {
            prev.next = c2;
            c1.next = c2.next;
            c2.next = c1;
            
            prev = c1;
            c1 = c1.next;
            if(c1 != null)
                c2 = c1.next;
        }
        return h.next;
    }
}