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
    public TreeNode pruneTree(TreeNode root) {
        if(!pruneTreeB(root))
            return null;
        return root;
    }
    
    public boolean pruneTreeB(TreeNode root) {
        if(root == null)
            return false;
        boolean left = false, right = false;
        if(root.left != null)
            left = pruneTreeB(root.left);
        if(root.right != null)
            right = pruneTreeB(root.right);
        if(!left)
            root.left = null;
        if(!right)
            root.right = null;
        return left || right || root.val == 1;
    }
}