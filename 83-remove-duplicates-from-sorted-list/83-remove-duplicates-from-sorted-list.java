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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return null;
        ListNode tail = head;
        while(tail.next != null) {
            if(tail.val != tail.next.val)
                tail = tail.next;
            else
                tail.next = tail.next.next;
        }
        return head;
    }
}