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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        while(root != null) {
            if(root.left == null) {
                result.add(root.val);
                root = root.right;
            } else {
                TreeNode current = root.left;
                while (current.right != null && current.right != root)
                    current = current.right;
                if(current.right == root) {
                    current.right = null;
                    root = root.right;
                } else {
                    result.add(root.val);
                    current.right = root;
                    root = root.left;
                }
            }
        }
        return result;
    }
}