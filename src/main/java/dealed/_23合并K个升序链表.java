package dealed;

public class _23合并K个升序链表 {

    public ListNode mergeKLists(ListNode[] lists) {
        return mergeKLists(lists, 0, lists.length);
    }


    private ListNode mergeKLists(ListNode[] lists, int i, int j) {
        int m = j - i;
        if (m == 0) {
            return null;
        }

        if (m == 1) {
            return lists[i];
        }
        ListNode left = mergeKLists(lists, i, i + m / 2);
        ListNode right = mergeKLists(lists, i + m / 2, j);
        return mergeTwoLists(left, right);

    }

    private ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        cur.next = list1 != null ? list1 : list2;
        return dummy.next;
    }

}
