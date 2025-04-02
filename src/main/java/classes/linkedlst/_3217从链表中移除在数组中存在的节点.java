package classes.linkedlst;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _3217从链表中移除在数组中存在的节点 {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        ListNode dummy = new ListNode(), pre = dummy;
        dummy.next = head;
        while (pre != null && pre.next != null) {
            while (pre.next != null && set.contains(pre.next.val)) {
                pre.next = pre.next.next;
            }
            pre = pre.next;
        }
        return dummy.next;
    }
}
