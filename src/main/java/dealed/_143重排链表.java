package dealed;

public class _143重排链表 {
    public void reorderList(ListNode head) {
        ListNode mid = head, fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            mid = mid.next;
        }

        

    }

}
