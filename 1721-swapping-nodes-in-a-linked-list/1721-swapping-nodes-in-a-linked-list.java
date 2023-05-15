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
    public ListNode swapNodes(ListNode head, int k) {
        List<ListNode> l = new ArrayList<>();
        ListNode curr = head;
        while(curr != null) {
            l.add(curr);
            curr = curr.next;
        }
        int len = l.size();
        int temp = l.get(k-1).val;
        l.get(k-1).val = l.get(len-k).val;
        l.get(len-k).val = temp;
        
        return head;
        
    }
}