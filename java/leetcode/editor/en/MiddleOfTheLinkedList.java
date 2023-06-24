package leetcode.editor.en;

public class MiddleOfTheLinkedList {

    // Question 876
    public static void main(String[] args) {
        new MiddleOfTheLinkedList().new Solution();
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public ListNode middleNode(ListNode head) {
            final int n = numberOfNodes(head);
            for (int i = 0; i < n / 2; i++) {
                head = head.next;
            }
            return head;
        }

        public int numberOfNodes(ListNode head) {
            if (head.next == null) {
                return 1;
            }
            return 1 + numberOfNodes(head.next);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}