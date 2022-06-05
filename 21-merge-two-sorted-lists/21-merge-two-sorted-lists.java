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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;
        ListNode head, c, c1, c2;
        if(list1.val < list2.val) {
            head = list1;
            c1 = list1.next;
            c2 = list2;
        } else {
            head = list2;
            c1 = list1;
            c2 = list2.next;
        }
        c = head;
        while(c1 != null || c2 != null) {
            if(c1 == null) {
                c.next = c2;
                break;
            } else if(c2 == null) {
                c.next = c1;
                break;
            }
            if(c1.val < c2.val) {
                c.next = c1;
                c1 = c1.next;
            } else {
                c.next = c2;
                c2 = c2.next;
            }
             c = c.next;
        }
        return head;
    }
}