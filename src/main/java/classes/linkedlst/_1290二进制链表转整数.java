package classes.linkedlst;

public class _1290二进制链表转整数 {
    public int getDecimalValue(ListNode head) {
        int i = 0;
        while (head!=null) {
            i = i * 2 + head.val;
            head = head.next;
        }
        return i;
    }
}
