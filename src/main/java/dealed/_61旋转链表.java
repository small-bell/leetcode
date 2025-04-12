package dealed;

public class _61旋转链表 {
    public ListNode rotateRight(ListNode head, int k) {
        // 处理链表为空或者 k 为 0 的情况
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // 计算链表的长度
        int size = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            size++;
        }

        // 计算实际需要旋转的步数
        k = k % size;
        if (k == 0) {
            return head;
        }

        // 找到新的链表尾
        ListNode newTail = head;
        for (int i = 0; i < size - k - 1; i++) {
            newTail = newTail.next;
        }

        // 找到新的链表头
        ListNode newHead = newTail.next;

        // 断开链表并重新连接
        newTail.next = null;
        tail.next = head;

        return newHead;
    }

}
