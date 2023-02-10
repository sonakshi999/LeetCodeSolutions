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
    List<String> ans = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
       String res = "";
       soln(root,res);
       return ans;
    }
    void soln(TreeNode t, String s) {
        if(t == null) { return;}
        s = s + t.val;
        if(t.left==null && t.right==null) {
            ans.add(s);
            return;
        }
        s=s+"->";
        soln(t.left,s);
        soln(t.right,s);
    }
}