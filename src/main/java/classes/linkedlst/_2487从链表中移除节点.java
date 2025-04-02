package classes.linkedlst;

public class _2487从链表中移除节点 {
    public ListNode removeNodes(ListNode head) {
        return remove(head);
    }

    private ListNode remove(ListNode head) {
        if (head == null ) return null;
        if (head.next == null) return head;

        ListNode next = remove(head.next);
        if (next.val > head.val) {
            return next;
        }
        head.next = next;
        return head;
    }
}
