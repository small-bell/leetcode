package dealed;

public class _2两数相加 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode res = dummy;
        int sup = 0;
        while (l1 != null && l2 != null) {
            int cur = sup + l1.val + l2.val;

            dummy.next = new ListNode(cur % 10);
            sup = cur / 10;
            l1 = l1.next;
            l2 = l2.next;
            dummy = dummy.next;
        }
        while (l1 != null) {
            int cur = sup + l1.val;
            dummy.next = new ListNode(cur % 10);
            sup = cur / 10;
            l1 = l1.next;
            dummy = dummy.next;
        }
        while (l2 != null) {
            int cur = sup + l2.val;
            dummy.next = new ListNode(cur % 10);
            sup = cur / 10;
            l2 = l2.next;
            dummy = dummy.next;
        }
        if (sup != 0) {
            dummy.next = new ListNode(sup);
        }
        return res.next;
    }

}
