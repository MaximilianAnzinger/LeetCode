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
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode tmp = new TreeNode();
        sortedArrayToBst(nums, 0, nums.length-1, true, tmp);
        return tmp.left;
    }
    
    public void sortedArrayToBst(int[] nums, int i, int j, boolean left, TreeNode parent) {
        if(i == j) {
            if(left)
                parent.left = new TreeNode(nums[i]);
            else
                parent.right = new TreeNode(nums[i]);
        } else if(i < j) {
            int m = (i+j)/2;
            TreeNode n = new TreeNode(nums[m]);
            if(left)
                parent.left = n;
            else
                parent.right = n;
            sortedArrayToBst(nums, i, m-1, true, n);
            sortedArrayToBst(nums, m+1, j, false, n);
        }
    }
}