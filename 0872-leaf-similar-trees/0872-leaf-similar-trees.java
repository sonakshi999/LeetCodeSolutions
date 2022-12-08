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
    ArrayList<Integer> l1 = new ArrayList<>();
    ArrayList<Integer> l2 = new ArrayList<>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        traverse(root1,l1);
        traverse(root2,l2);
        if(l1.size() != l2.size()) {
            return false;
        }
        for(int i=0; i<l1.size(); i++) {
            if(l1.get(i) != l2.get(i)) {
                return false;
            }
        }
        return true;
    }
    void traverse(TreeNode r, ArrayList<Integer> l) {
        if(r == null) return;
        if(r.left == null && r.right == null) {
            l.add(r.val);
        }
        traverse(r.left,l);
        traverse(r.right,l);
    }
}