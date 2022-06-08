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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        } 
        else {

            if (list1 == null) {
                return list2;
            }

            if (list2 == null) {
                return list1;
            }

            ListNode newHead = null;

            ListNode newCurrent = null;

            while (list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    if (newHead == null) {
                        newHead = new ListNode(list1.val);
                        newCurrent = newHead;
                    } else {
                        newCurrent.next = new ListNode(list1.val);
                        newCurrent = newCurrent.next;
                    }
                    list1 = list1.next;
                } 
                else {
                    if (newHead == null) {
                        newHead = new ListNode(list2.val);
                        newCurrent = newHead;
                    } else {
                        newCurrent.next = new ListNode(list2.val);
                        newCurrent = newCurrent.next;
                    }
                    list2 = list2.next;
                }

            }

            while (list1 != null) {

                newCurrent.next = new ListNode(list1.val);
                newCurrent = newCurrent.next;

                list1 = list1.next;
            }

            while (list2 != null) {

                newCurrent.next = new ListNode(list2.val);
                newCurrent = newCurrent.next;

                list2 = list2.next;
            }

            return newHead;
    }
}
}
