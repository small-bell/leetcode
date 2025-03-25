import dealed._146LRU缓存;

import java.util.HashMap;
import java.util.Map;

public class _LRU {

    class ListNode {
        Integer key;
        Integer val;
        ListNode pre;
        ListNode next;
        public ListNode(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
    ListNode head = new ListNode(0, 0);
    ListNode tail = new ListNode(0, 0);
    int capacity = 0;
    int size = 0;

    Map<Integer, ListNode> map = new HashMap<>();

    public _LRU(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.pre = head;
    }

    public int get(int key) {
        ListNode cur = map.get(key);
        if (cur == null) {
            return -1;
        }

        ListNode pre = cur.pre;
        pre.next = cur.next;
        cur.next.pre = pre;

        cur.pre = head;
        cur.next = head.next;
        head.next = cur;
        cur.next.pre = cur;

        return cur.val;
    }

    public void put(int key, int value) {
        ListNode cur = map.get(key);
        if (cur == null) {
            cur = new ListNode(key, value);
            map.put(key, cur);
            cur.pre = head;
            cur.next = head.next;

            head.next = cur;
            cur.next.pre = cur;
            size ++;
        } else {
            cur.val = value;

            ListNode pre = cur.pre;
            pre.next = cur.next;
            cur.next.pre = pre;

            cur.pre = head;
            cur.next = head.next;
            head.next = cur;
            cur.next.pre = cur;
        }

        if (size == capacity + 1) {
            ListNode ccur = tail.pre;
            ListNode pre = tail.pre.pre;
            pre.next = tail;
            tail.pre = pre;
            map.put(ccur.key, null);
            size --;
        }
    }
}
