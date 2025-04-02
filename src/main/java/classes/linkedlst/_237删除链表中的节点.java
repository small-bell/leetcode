package classes.linkedlst;

public class _237删除链表中的节点 {
    public void deleteNode(ListNode node) {

        ListNode pre = node, curr = node.next;
        while (curr.next != null) {
            pre.val = curr.val;
            pre = curr;
            curr = curr.next;
        }
        pre.val = curr.val;
        pre.next = null;
    }
}
