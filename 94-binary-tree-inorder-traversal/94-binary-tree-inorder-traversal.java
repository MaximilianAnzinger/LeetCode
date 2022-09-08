/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> out = new LinkedList<>();
        Deque<TreeNode> s = new LinkedList<>();
        TreeNode c = root;
        while(c != null || !s.isEmpty()) {
            while(c != null) {
                s.push(c);
                c = c.left;
            }
            c = s.pop();
            out.add(c.val);
            c = c.right;
        }
        return out;
    }
}