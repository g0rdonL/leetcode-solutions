/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head.next == null)
            return head;
        ListNode next = head;
        while (next.next != null) {
            next.next = getGreatestCommonDivisor(next);
            next = next.next.next;
        }
        return head;
    }

    private ListNode getGreatestCommonDivisor(ListNode head) {
        if (head.val < head.next.val) {
            int i = head.val;
            while (i > 0) {
                if (head.val % i == 0 && head.next.val % i == 0) {
                    break;
                }
                i--;
            }
            return new ListNode(i, head.next);
        } else {
            int i = head.next.val;
            while (i > 0) {
                if (head.val % i == 0 && head.next.val % i == 0) {
                    break;
                }
                i--;
            }
            return new ListNode(i, head.next);
        }
    }
}