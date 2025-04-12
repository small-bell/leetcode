package dealed.easy;

public class _21合并两个有序链表 {
    public ListNode mergeTwoLists1(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0), cur = dummy;
        while ( list1 != null || list2 != null) {
            if (list1 == null) {
                cur.next = list2;
                break;
            }
            if (list2 == null) {
                cur.next = list1;
                break;
            }

            if (list1.val <= list2.val) {
                cur.next =  list1;
                list1 = list1.next;
            } else {
                cur.next =  list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        return dummy.next;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        dfs(list1, list2, dummy);
        return dummy.next;
    }

    private void dfs(ListNode list1, ListNode list2, ListNode dummy) {
        if (list1 == null) {
            dummy.next = list2;
            return;
        }
        if (list2 == null) {
            dummy.next = list1;
            return;
        }

        if (list1.val <= list2.val) {
            dummy.next = list1;
            dfs(list1.next, list2, dummy.next);
        } else {
            dummy.next = list2;
            dfs(list2.next, list1, dummy.next);
        }
    }
}
