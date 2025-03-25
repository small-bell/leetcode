package dealed;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _146LRU缓存 {
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

    public _146LRU缓存(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.pre = head;
    }

    public int get(int key) {
        if (capacity == 0) {
            return -1;
        }
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
        ListNode print = head.next;
        while (print != tail) {
            System.out.print(print.key + ">" + print.val  + "|");
            print = print.next;
        }
        System.out.println();
        System.out.println("========");
        return cur.val;

    }

    public void put(int key, int value) {
        if (capacity == 0) {
            return;
        }
        ListNode listNode = map.get(key);
        if (listNode == null) {
            listNode = new ListNode(key, value);
            map.put(key, listNode);
            listNode.next = head.next;
            listNode.pre = head;
            head.next = listNode;
            listNode.next.pre = listNode;
            size ++;
        } else {
            listNode.val = value;

            ListNode curPre = listNode.pre;
            listNode.pre.next = listNode.next;
            listNode.next.pre = curPre;

            listNode.pre = head;
            listNode.next = head.next;
            head.next = listNode;
            listNode.next.pre = listNode;

        }
        map.put(key, listNode);


//        ListNode print = head.next;
//        while (print != tail) {
//            System.out.print(print.key + ">" + print.val + "|");
//            print = print.next;
//        }
//        System.out.println();
//        System.out.println("========");

        if (size == capacity + 1) {
            ListNode ccur = tail.pre;
            ListNode pre = tail.pre.pre;
            pre.next = tail;
            tail.pre = pre;
            map.put(ccur.key, null);
            size --;
        }

        ListNode print1 = head.next;
        while (print1 != tail) {
            System.out.print(print1.key + ">" + print1.val + "|");
            print1 = print1.next;
        }
        System.out.println();
        System.out.println("========");
    }

    public static void main(String[] args) {
        _146LRU缓存  lRUCache = new _146LRU缓存(2);
        lRUCache.get(2);
        lRUCache.put(2, 1);
        lRUCache.put(1,1);
        lRUCache.put(2,3);
        lRUCache.put(4,1);
        lRUCache.get(1);
        lRUCache.get(2);
    }
}
