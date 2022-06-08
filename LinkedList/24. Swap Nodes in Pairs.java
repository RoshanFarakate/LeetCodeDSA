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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) 
            return head;
        ListNode tHead = swapPairs(head.next.next);
        ListNode temp = head.next;
        head.next = tHead;
        temp.next = head;
        return temp;
    }
}
