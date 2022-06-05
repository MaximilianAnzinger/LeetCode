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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0)
            return head;
        ListNode start = head, end = head, newHead;
        for(int i = 0; i < k; i++) {
            if(end.next == null)
                return rotateRight(head, k%(i+1));
            end = end.next;
        }
        while(end.next != null) {
            start = start.next;
            end = end.next;
        }
        newHead = start.next;
        start.next = null;
        end.next = head;
        return newHead;
    }
}