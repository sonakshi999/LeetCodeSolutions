/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        List<Integer> l = new ArrayList<>();
        ListNode curr = head;
        while(curr != null) {
            l.add(curr.val);
            curr = curr.next;
        }
        int n = l.size();
        int res = 0;
        for(int i=0;i<n/2;i++) {
            res = Math.max(res,(l.get(i)+l.get(n-i-1)));
        }
        return res;
    }
}