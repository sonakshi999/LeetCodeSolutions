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
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        gain(root);
        return max;
    }
    int gain(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int lgain = Math.max(gain(root.left),0);
        int rgain = Math.max(gain(root.right),0);
        max = Math.max(max,lgain+rgain+root.val);
        return Math.max(lgain + root.val,rgain+root.val);
    }
}