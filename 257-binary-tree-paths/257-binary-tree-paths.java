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
    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null)
            return new LinkedList<String>();
        List<String> r = new LinkedList<String>();
        if(root.left == null && root.right == null)
            r.add("" + root.val);
        if(root.left != null) {
            for(String s : binaryTreePaths(root.left))
                r.add("" + root.val + "->" + s);
        }
        if(root.right != null) {
            for(String s : binaryTreePaths(root.right))
                r.add("" + root.val + "->" + s);
        }
        return r;
    }
}