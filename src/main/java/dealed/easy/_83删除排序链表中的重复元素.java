package dealed.easy;

public class _83删除排序链表中的重复元素 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0), cur = head;
        dummy.next =head;
        while (cur != null) {
            ListNode nxt = cur.next;
            int val = cur.val;
            while (nxt != null && nxt.val == val) nxt = nxt.next;
            cur.next = nxt;
            cur = cur.next;
        }
        return dummy.next;
    }

    public ListNode deleteDuplicates1(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode cur = head;
        while (cur.next != null) { // 看看下个节点……
            if (cur.next.val == cur.val) { // 和我一样，删！
                cur.next = cur.next.next;
            } else { // 和我不一样，移动到下个节点
                cur = cur.next;
            }
        }
        return head;
    }
}
