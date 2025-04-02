package classes.linkedlst;

public class _82删除排序链表中的重复元素II {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(), pre = dummy;
        dummy.next = head;
        while (pre.next != null) {
            ListNode curr = pre.next;
            while (curr.next != null && curr.next.val == curr.val) {
                curr = curr.next;
            }
            if (pre.next != curr) {
                pre.next = curr.next;
            } else {
                pre = pre.next;
            }
        }
        return dummy.next;
    }

}
