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
        ListNode first = head, second = head;
        for(int i=0;i<k-1;i++) {
            first = first.next; // first reached to kth from begin
        }
        ListNode temp = first;
        while(temp.next != null) {
            temp = temp.next;
            second = second.next;
        }
        
        int x = first.val;
        first.val = second.val;
        second.val = x;
        return head;
    }
}