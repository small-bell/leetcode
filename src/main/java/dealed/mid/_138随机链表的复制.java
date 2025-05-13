package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _138随机链表的复制 {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();
        Node tmp = head;
        while (tmp != null) {
            map.put(tmp, new Node(tmp.val));
            tmp = tmp.next;
        }
        tmp = head;
        while (tmp != null) {
            Node node = map.get(tmp);
            node.next = map.get(tmp.next);
            node.random = map.get(tmp.random);
            tmp = tmp.next;
        }
        return map.get(head);
    }


}
