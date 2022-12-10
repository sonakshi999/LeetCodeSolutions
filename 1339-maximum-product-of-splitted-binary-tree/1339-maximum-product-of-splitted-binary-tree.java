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
    long max = 0,tsum=0;
    public int maxProduct(TreeNode root) {
        tsum = totalsum(root);
        totalsum(root);
        return (int) (max % 1000000007);
    }
    long totalsum(TreeNode r) {
        if(r == null) return 0;
        long sum = totalsum(r.left) + r.val + totalsum(r.right) ;
        max = Math.max(max, (tsum-sum)*sum);
        return sum;
    }
}