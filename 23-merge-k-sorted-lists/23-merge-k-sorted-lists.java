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
        if(lists == null || lists.length == 0)
            return null;
        if(lists.length == 1)
            return lists[0];
        
        PriorityQueue<ListNode> q = new PriorityQueue<ListNode>(lists.length, (a,b)-> a.val-b.val);
        for(ListNode list : lists)
            if(list != null)
                q.add(list);
        
        ListNode head = new ListNode(), current = head;
        while(!q.isEmpty()) {
            current.next = q.poll();
            current = current.next;
            if(current.next != null)
                q.add(current.next);
        }
        return head.next;
    }
}