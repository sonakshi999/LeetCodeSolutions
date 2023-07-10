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
    public int minDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        Queue<TreeNode> l = new LinkedList<>();
    
        int ans = 1;
        l.add(root);
        while(!l.isEmpty()) {
            int sz = l.size();
            for(int i=0;i<sz;i++) {
                TreeNode temp = l.remove();
                if(temp==null){
                    continue;
                }
                if(temp.left==null && temp.right==null){
                    return ans;
                }
                l.add(temp.left);
                l.add(temp.right);
            }
            ans++;
        }
        return 0;
    }
   
}