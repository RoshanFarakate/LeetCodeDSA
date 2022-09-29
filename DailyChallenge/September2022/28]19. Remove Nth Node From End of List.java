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
    if(head==null||n==0) return head;
    ListNode ptr_1=head;
    ListNode ptr_2=head;
    for(int i=0; i<n; i++) 
        ptr_2=ptr_2.next;
    if(ptr_2==null) return head.next;
    while(ptr_2.next!=null){
        ptr_2=ptr_2.next;
        ptr_1=ptr_1.next;
    }
    ptr_1.next=ptr_1.next.next;
    return head;  
}
}
