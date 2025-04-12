package dealed.easy;

public class _160相交链表 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA, b = headB;
        while (headA != headB) {
            headA = headA == null ? b :headA.next;
            headB = headB == null ? a : headB.next;
        }
        return headA;
    }
}
