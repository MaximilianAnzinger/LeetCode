/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        
        if(root == null)
            return root;
        
        if(root.left != null)
            if(root.right != null)
                root.left.next = root.right;
            else
                for(Node current = root.next; current != null; current = current.next)
                    if(current.left != null) {
                        root.left.next = current.left;
                        break;
                    } else if(current.right != null) {
                        root.left.next = current.right;
                        break;
                    }
        
        if(root.right != null)
            for(Node current = root.next; current != null; current = current.next)
                if(current.left != null) {
                    root.right.next = current.left;
                    break;
                } else if(current.right != null) {
                    root.right.next = current.right;
                    break;
                }
        
        connect(root.right);
        connect(root.left);
        return root;
    }
}