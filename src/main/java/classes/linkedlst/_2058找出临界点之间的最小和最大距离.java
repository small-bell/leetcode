package classes.linkedlst;

public class _2058找出临界点之间的最小和最大距离 {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int min = -1, max = -1, maxAns = -1, minAns = Integer.MAX_VALUE;
        ListNode pre = head, curr = head.next, left = null, right = null, point = null;

        while (curr != null && curr.next != null) {
            if (max >= 0) max ++;
            if (min >= 0) min ++;
            if ((pre.val < curr.val && curr.val > curr.next.val) ||
                    (pre.val > curr.val && curr.val < curr.next.val)) {
                if (left == null) left = curr; else right = curr;
                if (max == -1) {
                    max = 0;
                } else {
                    maxAns = max;
                }
                if (min == -1) {
                    min = 0;
                } else {
                    minAns = Math.min(min, minAns);
                    min = 0;
                }
            }
            pre = curr;
            curr = curr.next;
        }

        int[] ans = new int[2];
        if (right == null) return new int[] {-1, -1};
        return new int[] {minAns, maxAns};

    }
}
