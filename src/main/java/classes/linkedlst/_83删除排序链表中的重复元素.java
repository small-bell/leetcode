package classes.linkedlst;

public class _83删除排序链表中的重复元素 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(), curr = head;
        dummy.next = head;
        while (curr != null) {
            int val = curr.val;
            ListNode nxt = curr.next;
            while (nxt != null && nxt.val == val ) nxt = nxt.next;
            curr.next = nxt;
            curr = nxt;
        }
        return dummy.next;
    }
}
