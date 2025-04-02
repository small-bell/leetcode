package classes.linkedlst;

public class _2181合并零之间的节点 {
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(0), pre = dummy;

        while (head != null) {
            int number = 0;
            while (head != null && head.val == 0) {
                head = head.next;
            }
            while (head != null && head.val != 0) {
                number += head.val;
                head = head.next;
            }
            if (number > 0) {
                pre.next = new ListNode(number);
                pre = pre.next;
            }
        }
        return dummy.next;
    }
}
