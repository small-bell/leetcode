package dealed;

public class _24两两交换链表中的节点 {
    public ListNode swapPairs(ListNode head) {

        if (head == null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // 注意刚开始最好不要开始移动，在循环中开始移动效果会更好，不会懵逼
        ListNode next1 = dummy, next2 =dummy, pre = dummy;

        while (next1 != null && next1.next != null && next1.next.next != null) {
            next1 = next1.next;
            next2 = next1.next;
            ListNode tmp = next2.next;
            next1.next = tmp;
            next2.next = next1;
            pre.next = next2;
            pre = next1;
        }

        return dummy.next;
    }
}
