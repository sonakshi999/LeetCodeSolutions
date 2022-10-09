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
    List<Integer> l = new ArrayList<>();
    public boolean findTarget(TreeNode root, int k) {
        traverse(root);
        int n = l.size();
        int a[] = new int[n];
        for(int i=0;i<n;i++) {
            a[i] = l.get(i);
        }
        boolean ans = find(a,k);
        return ans;
    }
    void traverse(TreeNode root) {
        if(root == null) {
            return;
        }
        traverse(root.left);
        l.add(root.val);
        traverse(root.right);
    }
    boolean find(int a[], int k) {
        int i = 0, j = a.length-1;
        while(i<j) {
            if(a[i]+a[j] == k) {
                return true;
            }else if(a[i]+a[j] > k) {
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
}