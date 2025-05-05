package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _117填充每个节点的下一个右侧节点指针ii {

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };
    public Node connect(Node root) {
        if (root == null)return null;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            Node pre = null;
            for (int i = 0; i < size; i++) {
                Node poll = q.poll();
                poll.next = pre;
                pre = poll;
                if (poll.right != null) q.offer(poll.right);
                if (poll.left != null ) q.offer(poll.left);
            }
        }
        return root;
    }
}
