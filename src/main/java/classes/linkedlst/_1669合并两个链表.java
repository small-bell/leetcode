package classes.linkedlst;

public class _1669合并两个链表 {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode preA = list1;
        for (int i = 0; i < a - 1; i++) {
            preA = preA.next;
        }
        ListNode preB = preA;
        for (int i = 0; i < b - a + 2; i++) {
            preB = preB.next;
        }
        preA.next = list2;
        while (list2.next != null) {
            list2 = list2.next;
        }
        list2.next = preB;
        return list1;
    }

}
