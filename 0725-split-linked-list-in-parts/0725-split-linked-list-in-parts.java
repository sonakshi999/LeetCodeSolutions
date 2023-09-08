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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode curr = head;
        int len = 0;
        while(curr != null) {
            len++;
            curr=curr.next;
        }
        
        int sz = len / k;
        int rem = len % k;
        ListNode ans[] = new ListNode[k];
        curr = head;
        for(int i=0;i<k;i++) {
            ListNode root = new ListNode(0), write = root;
            for(int j=0; j < sz + (i<rem?1:0); ++j) {
                write = write.next =  new ListNode(curr.val);
                if(curr != null) curr = curr.next;
            }
            ans[i]=root.next;
        }
        return ans;
    }
}