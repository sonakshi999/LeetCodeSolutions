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
    public List<Integer> largestValues(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        if(root == null) {
            return ans;
        }
        q.add(root);
        while(!q.isEmpty()) {
            int sz = q.size();
            int max = Integer.MIN_VALUE;
            for(int i=0;i<sz;i++) {
                TreeNode curr = q.poll();
                if(curr.left != null) {
                    q.add(curr.left);
                }
                if(curr.right != null) {
                    q.add(curr.right);
                }
                max = Math.max(curr.val,max);
            }
            ans.add(max);
        }
        return ans;
    }
}