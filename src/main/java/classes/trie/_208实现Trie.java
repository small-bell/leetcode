package classes.trie;

import java.util.PriorityQueue;

public class _208实现Trie {

    class Node {
        boolean end = false;
        Node[] nodes = new Node[100];
    }
    Node root = new Node();

    public void insert(String word) {
        Node cur = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (cur.nodes[c - 'a'] == null) {
                Node node = new Node();
                cur.nodes[c - 'a'] = node;

            }
            cur = cur.nodes[c - 'a'];
        }
        cur.end = true;
    }

    public boolean search(String word) {
        Node cur = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            Node node = cur.nodes[c - 'a'];
            if (node == null) {
                return false;
            }
            cur = node;
        }
        if (cur.end) return true;

        return false;
    }

    public boolean startsWith(String prefix) {
        Node cur = root;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            Node node = cur.nodes[c - 'a'];
            if (node == null) {
                return false;
            }
            cur = node;
        }
        return true;
    }
}
