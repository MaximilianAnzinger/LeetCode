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
    public boolean isBalanced(TreeNode root) {
        return diff(root) >= 0;
    }
    
    public int diff(TreeNode root) {
        if (root == null) return 0;
        int l = diff(root.left), r = diff(root.right);
        if (l == -1 || r == -1 || l-r < -1 || l-r > 1)
            return -1;
        return (l > r ? l : r) + 1;
    }
}