package dealed.mid;

public class _2两数相加 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0), head = dummy;
        int cy = 0;
        while (l1 != null || l2 != null || cy != 0) {
            if (l1 != null) {
                cy += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                cy += l2.val;
                l2 = l2.next;
            }
            head.next = new ListNode(cy % 10);
            head = head.next;
            cy /= 10;
        }
        return dummy.next;
    }
}
