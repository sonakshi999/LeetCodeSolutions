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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode temp = head;
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        temp = head;
        // nth from end will be what from start
        int num = count - n;
        if(num==0) {
            return head.next;
        }
        ListNode prev = null;
        for(int i=0;i<num;i++){
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
        temp =null;
        
        return head;
        
    }
}