package dealed.mid;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _133克隆图 {
    class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    public Node cloneGraph(Node node) {
        if (node == null) return null;

        Queue<Node> queue = new LinkedList<>();
        Map<Node, Node> map = new HashMap<>();

        Node copyRoot = new Node(node.val);
        map.put(node, copyRoot);
        queue.offer(node);

        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            Node copyCurr = map.get(curr);

            for (Node neighbor : curr.neighbors) {
                if (!map.containsKey(neighbor)) {
                    Node copyNeighbor = new Node(neighbor.val);
                    map.put(neighbor, copyNeighbor);
                    queue.offer(neighbor);
                }
                copyCurr.neighbors.add(map.get(neighbor));
            }
        }

        return copyRoot;
    }


}
