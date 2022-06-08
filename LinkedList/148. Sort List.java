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
    public ListNode sortList(ListNode head) {
        ListNode current = head;
        int length = 0;
        while(current!=null){
            length++;
            current = current.next;
        }
        current = head;
        int[] arr = new int[length];
        int i = 0;
        while(current!=null){
            arr[i] = current.val;
            current = current.next;
            i++;
        }
        Arrays.sort(arr);
        current = head;
        i = 0;
        while(current!=null){
            current.val = arr[i];
            i++;
            current = current.next;
        }
        return head;
    }
}
