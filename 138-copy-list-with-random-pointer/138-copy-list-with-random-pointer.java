/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null)
            return null;
        
        for(Node c = head; c != null; c = c.next.next) {
            Node copy = new Node(c.val);
            copy.next = c.next;
            c.next = copy;
        }
        
        for(Node c = head; c != null; c = c.next.next)
            if(c.random != null)
                c.next.random = c.random.next;
        
        Node newHead = head.next, c, cc;
        for(c = head, cc = head.next; cc.next != null; c = c.next, cc = cc.next) {
            c.next = c.next.next;
            cc.next = cc.next.next;
        }
        c.next = c.next.next;
        
        return newHead;
    }
}