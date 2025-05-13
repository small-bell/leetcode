package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _146LRU缓存 {
    int cap = 0, size = 0;
    class Node {
        int key, val;
        Node pre;
        Node nxt;
    }
    Map<Integer, Node> map = new HashMap<>();
    Node head = new Node(), tail = new Node();
    public _146LRU缓存(int capacity) {
        cap = capacity;
        head.nxt = tail;
        tail.pre = head;
    }

    public int get(int key) {
        Node node = map.get(key);
        if (node == null) return -1;
        node.pre.nxt = node.nxt;
        node.nxt.pre = node.pre;

        // 移动到头部
        Node tmp = head.nxt;
        head.nxt = node;
        node.pre = head;
        node.nxt = tmp;
        tmp.pre = node;
        return node.val;
    }

    public void put(int key, int value) {
        Node node = map.get(key);
        if (node == null) {
            node = new Node();
            node.key = key;
            node.val = value;

            Node tmp = head.nxt;
            head.nxt = node;
            node.pre = head;
            node.nxt = tmp;
            tmp.pre = node;
            map.put(key, node);
            size ++;
            if (size > cap) {
                Node remove = tail.pre;
                tail.pre = remove.pre;
                remove.pre.nxt = tail;
                map.remove(remove.key);
                size --;
            }
        } else {
            node.pre.nxt = node.nxt;
            node.nxt.pre = node.pre;

            node.val = value;

            Node tmp = head.nxt;
            head.nxt = node;
            node.pre = head;
            node.nxt = tmp;
            tmp.pre = node;
        }
    }

    public static void main(String[] args) {
        _146LRU缓存 cache = new _146LRU缓存(1);
        cache.put(2, 1);
        cache.get(2);
    }

}
